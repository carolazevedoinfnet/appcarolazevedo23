package br.edu.infnet.appcarolazevedo23.service;

import br.edu.infnet.appcarolazevedo23.model.Exame;
import br.edu.infnet.appcarolazevedo23.repository.IExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExameService {

	@Autowired
	private IExameRepository exameRepository;


	public void incluir(Exame exame) {
		exameRepository.save(exame);
		
	}
	
	public List<Exame> obterLista(){
		return (List<Exame>)exameRepository.findAll();
	}
	
	public Exame obterPorId (Integer id) {
		return exameRepository.findById(id).orElse(null);
	}
	
	public void excluir(Integer id) {
		exameRepository.deleteById(id);
}
	
	
}

