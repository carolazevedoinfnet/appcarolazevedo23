package br.edu.infnet.appcarolazevedo23.controller;


import br.edu.infnet.appcarolazevedo23.model.Medico;
import br.edu.infnet.appcarolazevedo23.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MedicoController {

	
	@Autowired 
	private MedicoService medicoService;

	
	@RequestMapping(value= "/api/medicos", method = RequestMethod.GET)
	public String obterListaMedicos(
			  Model model
			  ) {
	  
	  model.addAttribute("listaMedicos", medicoService.obterLista());
	  
	  return "medico/listaMedicos"; }
	  
	  
	  
		@RequestMapping(value= "/api/medico",method = RequestMethod.GET)
		public String showMedico() {

		return "medico/medico";
		}
	  
	  @RequestMapping(value = "/api/medico", method = RequestMethod.POST)
	  public String incluir(
			  Model model, 
			  Medico medico,
			 @RequestParam String[] especialidades) {
		  System.out.println(especialidades);
		  System.out.println("gravandomedico");
		  System.out.println(medico.getEspecialidade());
		  
		  	medico.setEspecialidade(especialidades);
		  medicoService.incluir(medico);
		  	return this.obterListaMedicos(model); }
	  
	  
	  @RequestMapping(value = "/api/medico/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  medicoService.excluir(id); 
	return this.obterListaMedicos(model); 
	}
	  
	  }


