package br.edu.infnet.appcarolazevedo23.controller;


import br.edu.infnet.appcarolazevedo23.model.Exame;
import br.edu.infnet.appcarolazevedo23.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ExameController {

	
	@Autowired 
	private ExameService exameService;
	
	
	@RequestMapping(value= "/api/exames", method = RequestMethod.GET)
	public String obterListaExames(
			  Model model
			  ) {
	  
	  model.addAttribute("listaExames", exameService.obterLista());
	  
	  return "exame/listaExames"; }
	  
	  
	@RequestMapping(value= "/api/exame",method = RequestMethod.GET)
	public String showExame() {

		return "exame/exame";
	}
	
	  
	  @RequestMapping(value = "/api/exame", method = RequestMethod.POST)
	  public String incluir(
			  Model model, 
			  Exame exame
			  ) {

			  exameService.incluir(exame);
		  	return this.obterListaExames(model); }

	  
	  @RequestMapping(value = "/api/exame/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  exameService.excluir(id); 
	return this.obterListaExames(model); 
	}
	  
	  }
