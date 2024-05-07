package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;
import java.util.Optional;

import co.edu.usco.pw.springboot_crud01.model.Clase;

public interface IClaseService {

	List<Clase> getClasesByUser(String user);

	Optional<Clase> getClaseById(long id);

	void updateClase(Clase clase);

	void addClase(String nombre,String descripcion, int salon, String horarioInicio, String horarioFin, String docente);

	void deleteClase(long id);
	
	void saveClase(Clase todo);

}