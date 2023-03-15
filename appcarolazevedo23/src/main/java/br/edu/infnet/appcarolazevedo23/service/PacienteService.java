package br.edu.infnet.appcarolazevedo23.service;


import br.edu.infnet.appcarolazevedo23.model.Paciente;
import br.edu.infnet.appcarolazevedo23.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PacienteService {
	
	@Autowired
	private IPacienteRepository pacienteRepository;


	public void incluir(Paciente paciente) {
		pacienteRepository.save(paciente);
	}
	public List<Paciente> obterLista(){
		return (List<Paciente>)pacienteRepository.findAll();
	}

	
	public void excluir(Integer id) {
		pacienteRepository.deleteById(id);
}
	
}
