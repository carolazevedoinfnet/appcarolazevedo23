package br.edu.infnet.appcarolazevedo23.repository;

import br.edu.infnet.appcarolazevedo23.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IusuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario u where u.login =:login and u.senha =:senha")
	Usuario autenticacao (String login, String senha);

}
