package br.edu.infnet.appcarolazevedo23.repository;


import br.edu.infnet.appcarolazevedo23.model.Consulta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultaRepository extends CrudRepository<Consulta, Integer> {



}
