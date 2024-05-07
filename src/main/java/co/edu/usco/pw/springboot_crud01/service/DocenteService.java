package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Docente;
import co.edu.usco.pw.springboot_crud01.repository.DocenteRepository;

@Service
public class DocenteService implements IDocenteService {

	@Autowired
	private DocenteRepository docenteRepository;
	
	@Override
	public List<Docente> docentes() {
		return (List<Docente>) docenteRepository.findAll();
	}

}
