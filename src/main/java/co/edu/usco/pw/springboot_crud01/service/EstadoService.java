package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Estado;
import co.edu.usco.pw.springboot_crud01.repository.EstadoRepository;

@Service
public class EstadoService implements IEstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	
	@Override
	public List<Estado> estados() {
		return (List<Estado>) estadoRepository.findAll();
	}

}
