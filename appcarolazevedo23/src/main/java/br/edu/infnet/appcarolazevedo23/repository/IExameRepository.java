package br.edu.infnet.appcarolazevedo23.repository;

import br.edu.infnet.appcarolazevedo23.model.Exame;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IExameRepository extends CrudRepository<Exame, Integer> {

	List<Exame> findAll(Sort by);
}
