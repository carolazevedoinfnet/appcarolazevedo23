package br.edu.infnet.appcarolazevedo23.repository;


import br.edu.infnet.appcarolazevedo23.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPacienteRepository extends CrudRepository<Paciente, Integer> {

}