package co.edu.usco.pw.springboot_crud01;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.edu.usco.pw.springboot_crud01.model.Clase;
import co.edu.usco.pw.springboot_crud01.model.Docente;
import co.edu.usco.pw.springboot_crud01.model.ERol;
import co.edu.usco.pw.springboot_crud01.model.Rol;
import co.edu.usco.pw.springboot_crud01.model.Usuario;
import co.edu.usco.pw.springboot_crud01.repository.ClaseRepository;
import co.edu.usco.pw.springboot_crud01.repository.DocenteRepository;
import co.edu.usco.pw.springboot_crud01.repository.UsuarioReposity;

@SpringBootApplication
public class SpringbootCrud01SpringBootApplication {

	public static void main(String[] args) {SpringApplication.run(SpringbootCrud01SpringBootApplication.class, args);}
	
	
		@Autowired
		UsuarioReposity usuarioRepository;
		
		@Autowired
		DocenteRepository docenteRepository;
		
		@Autowired
		ClaseRepository claseRepository;
		
	
		@Bean
	    CommandLineRunner init() {
	        return args -> {
	            Usuario usuario = new Usuario();
	            usuario.setNombre("john");
	            usuario.setContrasenia("123");
	            Set<Rol> roles = new HashSet<>();
	            Rol rol = new Rol();
	            rol.setRol(ERol.RECTOR);
	            roles.add(rol);
	            usuario.setRoles(roles);
	            usuarioRepository.save(usuario);
	            
	            Usuario usuario2 = new Usuario();
	            usuario2.setNombre("stiven");
	            usuario2.setContrasenia("123");
	            Set<Rol> roles2 = new HashSet<>();
	            Rol rol2 = new Rol();
	            rol2.setRol(ERol.ESTUDIANTE);
	            roles2.add(rol2);
	            usuario2.setRoles(roles2);
	            usuarioRepository.save(usuario2);
	            
	            Docente docente1 = new Docente();
	            docente1.setNombre("Diego Carvajal");

	            Docente docente2 = new Docente();
	            docente2.setNombre("Juan Castro");

	            docenteRepository.save(docente1);
	            docenteRepository.save(docente2);
	            
	            Clase clase1 = new Clase("Programacion web", "Programacion en JAVA con Spring Boot", 120,"9AM","11AM","Diego Carvajal");
	            
	            claseRepository.save(clase1);
	            

	        };
	    }


}
