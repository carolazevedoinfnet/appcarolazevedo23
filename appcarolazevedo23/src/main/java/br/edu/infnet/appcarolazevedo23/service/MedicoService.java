package br.edu.infnet.appcarolazevedo23.service;

import br.edu.infnet.appcarolazevedo23.model.Medico;
import br.edu.infnet.appcarolazevedo23.repository.IMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class MedicoService {
	
	@Autowired
	private IMedicoRepository medicoRepository;


	public void incluir(Medico medico) {
		medicoRepository.save(medico);
		
	}
	public void excluir(Integer id) {
		medicoRepository.deleteById(id);
}
	
	public List<Medico> obterLista(){
		return (List<Medico>)medicoRepository.findAll();
	}
}

