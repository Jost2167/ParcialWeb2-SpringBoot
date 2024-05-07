package co.edu.usco.pw.springboot_crud01.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.usco.pw.springboot_crud01.model.Usuario;

public interface UsuarioReposity extends CrudRepository<Usuario, Long> {

		@Query("select u from Usuario u where u.nombre=?1")
		Optional<Usuario> getNombre(String nombreUsuario);
	
	
}




