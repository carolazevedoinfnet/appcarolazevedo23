package br.edu.infnet.appcarolazevedo23.controller;

import br.edu.infnet.appcarolazevedo23.model.Consulta;
import br.edu.infnet.appcarolazevedo23.model.Exame;
import br.edu.infnet.appcarolazevedo23.service.ConsultaService;
import br.edu.infnet.appcarolazevedo23.service.ExameService;
import br.edu.infnet.appcarolazevedo23.service.MedicoService;
import br.edu.infnet.appcarolazevedo23.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	@Autowired
	private ExameService exameService;
	@Autowired
	private MedicoService medicoService;
	@Autowired
	private PacienteService pacienteService;

	@RequestMapping(value = "/api/consultas", method = RequestMethod.GET)
	public String obterListaConsulta(Model model) {
		model.addAttribute("dataAtual", consultaService.obterLista());
		model.addAttribute("dataLimite", consultaService.obterLista());
		model.addAttribute("exames", exameService.obterLista());
		model.addAttribute("pacientes", pacienteService.obterLista());
		model.addAttribute("medicos", medicoService.obterLista());
		model.addAttribute("listaConsulta", consultaService.obterLista());

		return "consulta/listaConsulta";
	}

	@PostMapping(value = "/api/consulta")
	public String consulta(Model model, Consulta consulta) {
		consultaService.incluir(consulta);
		return "redirect:/consulta";

	}

	@RequestMapping(value = "/api/consulta", method = RequestMethod.GET)
	public String showConsulta(Model model) {
		model.addAttribute("pacientes", pacienteService.obterLista());
		model.addAttribute("medicos", medicoService.obterLista());
		model.addAttribute("exames", exameService.obterLista());
		
		return "consulta/consulta";
	}

	@RequestMapping(value = "/api/consulta/incluir", method = RequestMethod.POST)
	public String incluir(Model model, Consulta consulta, @RequestParam String dataConsulta,
			@RequestParam String horaConsulta, @RequestParam Optional<String[]> exameIds) {

		if (exameIds.isPresent()) {
			List<Exame> lista = new ArrayList<Exame>();

			for (String id : exameIds.get()) {
				lista.add(exameService.obterPorId(Integer.valueOf(id)));
			}

			consulta.setExames(lista);
		}

		try {
			if (!dataConsulta.isEmpty())
				consulta.setData(LocalDate.parse(dataConsulta, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		} catch (Exception ignored) {
		}
		;

		try {
			if (!horaConsulta.isEmpty())
				consulta.setHora(LocalTime.parse(horaConsulta, DateTimeFormatter.ofPattern("HH:mm")));
		} catch (Exception ignored) {
		}
		;

		consultaService.incluir(consulta);

		return this.obterListaConsulta(model);
	}

	@RequestMapping(value = "/api/consulta/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		consultaService.excluir(id);
		return this.obterListaConsulta(model);
	}

}
