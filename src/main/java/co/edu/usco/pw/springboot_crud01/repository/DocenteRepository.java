package co.edu.usco.pw.springboot_crud01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usco.pw.springboot_crud01.model.Docente;


public interface DocenteRepository extends JpaRepository<Docente, Long> {

}