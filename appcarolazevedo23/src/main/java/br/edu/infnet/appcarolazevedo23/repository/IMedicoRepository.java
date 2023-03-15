package br.edu.infnet.appcarolazevedo23.repository;


import br.edu.infnet.appcarolazevedo23.model.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMedicoRepository extends CrudRepository<Medico, Integer> {

}
