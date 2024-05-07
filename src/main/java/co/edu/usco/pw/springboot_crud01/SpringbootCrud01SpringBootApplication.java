package co.edu.usco.pw.springboot_crud01;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.edu.usco.pw.springboot_crud01.model.ERol;
import co.edu.usco.pw.springboot_crud01.model.Rol;
import co.edu.usco.pw.springboot_crud01.model.Usuario;
import co.edu.usco.pw.springboot_crud01.repository.UsuarioReposity;

@SpringBootApplication
public class SpringbootCrud01SpringBootApplication {

	public static void main(String[] args) {SpringApplication.run(SpringbootCrud01SpringBootApplication.class, args);}
	
	
		@Autowired
		UsuarioReposity usuarioRepository;
	
		@Bean
	    CommandLineRunner init() {
	        return args -> {
	            Usuario usuario = new Usuario();
	            usuario.setNombre("stiven");
	            usuario.setContrasenia("123");
	            Set<Rol> roles = new HashSet<>();
	            Rol rol = new Rol();
	            rol.setRol(ERol.RECTOR);
	            roles.add(rol);
	            usuario.setRoles(roles);
	            usuarioRepository.save(usuario);
	            
	            Usuario usuario2 = new Usuario();
	            usuario2.setNombre("miguel");
	            usuario2.setContrasenia("321");
	            Set<Rol> roles2 = new HashSet<>();
	            Rol rol2 = new Rol();
	            rol2.setRol(ERol.DOCENTE);
	            roles2.add(rol2);
	            usuario2.setRoles(roles2);
	            usuarioRepository.save(usuario2);
	            
	        };
	    }


}
