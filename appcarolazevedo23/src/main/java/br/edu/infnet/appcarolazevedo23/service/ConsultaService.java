package br.edu.infnet.appcarolazevedo23.service;


import br.edu.infnet.appcarolazevedo23.model.Consulta;
import br.edu.infnet.appcarolazevedo23.repository.IConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service 
public class ConsultaService {

	@Autowired
	private IConsultaRepository consultaRepository;


	public void incluir(Consulta consulta) {
		consultaRepository.save(consulta);
		
	}
	
	public List<Consulta> obterLista(){
		return (List<Consulta>)consultaRepository.findAll();
	}
	
	
	/*
	 * public Object obterDataAtual() { LocalDate data = LocalDate.now(); return
	 * data;
	 * 
	 * }
	 */
	
	public Consulta obterPorId (Integer id) {
		return consultaRepository.findById(id).orElse(null);
	}
	
	/*
	 * public Object obterDataLimite() { LocalDate diaLimite =
	 * LocalDate.now().plusDays(30); return diaLimite; }
	 * 
	 * public String weekDay() { Calendar rightNow = Calendar.getInstance();
	 * System.out.println(rightNow); return new
	 * DateFormatSymbols().getWeekdays()[rightNow.get(Calendar.DAY_OF_WEEK)];
	 * 
	 * }
	 */
	
	public void excluir(Integer id) {

		consultaRepository.deleteById(id);
}
	

}
