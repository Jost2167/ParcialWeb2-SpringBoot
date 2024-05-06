package co.edu.usco.pw.springboot_crud01.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
	    .passwordEncoder(NoOpPasswordEncoder.getInstance())
	    .withUser("rector")
	        .password("123")
	        .roles("DOCENTE", "RECTOR")
	    .and()
	    .withUser("docente")
	        .password("321")
	        .roles("DOCENTE");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/").access("hasAnyRole('DOCENTE','RECTOR')")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/");
		
		
		
		
		

		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
}
