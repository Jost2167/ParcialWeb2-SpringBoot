package co.edu.usco.pw.springboot_crud01.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Usuario;
import co.edu.usco.pw.springboot_crud01.repository.UsuarioReposity;

@Service
public class UsuarioDetalles implements UserDetailsService{

	
	@Autowired
	private UsuarioReposity usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		Usuario usuarioEntity = usuarioRepository.getNombre(username)
				.orElseThrow(()-> new UsernameNotFoundException("El usuario "+username+" no fue encontrado."));
				
		
		Collection<? extends GrantedAuthority > authorities = usuarioEntity.getRoles()
				.stream()
				.map(rol-> new SimpleGrantedAuthority("ROLE_".concat(rol.getRol().name())))
				.collect(Collectors.toSet());
		
		return new User(usuarioEntity.getNombre(),
				usuarioEntity.getContrasenia(),
				true,
				true,
				true,
				true,
				authorities);
	}
	
}
