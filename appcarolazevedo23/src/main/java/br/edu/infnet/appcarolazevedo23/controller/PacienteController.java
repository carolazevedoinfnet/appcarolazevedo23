package br.edu.infnet.appcarolazevedo23.controller;


import br.edu.infnet.appcarolazevedo23.model.Paciente;
import br.edu.infnet.appcarolazevedo23.service.MedicoService;
import br.edu.infnet.appcarolazevedo23.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private MedicoService medicoService;

	@RequestMapping(value = "/api/paciente", method = RequestMethod.GET)
	public String showPaciente(
			Model model
	){
		model.addAttribute("listaMedicos", medicoService.obterLista());
		return "paciente/paciente";

	}


	@RequestMapping(value= "/api/pacientes", method = RequestMethod.GET) public
	  String obterListaPaciente(
			  Model model
			  ) {

	  model.addAttribute("listaPacientes", pacienteService.obterLista());

	  return "paciente/listaPacientes"; }




	  @RequestMapping(value = "/api/paciente", method = RequestMethod.POST)
	  public String incluir(
			  Model model,
			  Paciente paciente
	  ){
		pacienteService.incluir(paciente);
		return this.obterListaPaciente(model);}


	@RequestMapping(value = "/api/paciente/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model,
			  @PathVariable Integer id
			  ) {


		  		pacienteService.excluir(id);
		  		return this.obterListaPaciente(model);


	}
}





