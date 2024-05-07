package co.edu.usco.pw.springboot_crud01.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="clases")
public class Clase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userName="rector";
	
	
	@Size(max = 20, message = "Longuitud máxima 20 caracteres")
	private String nombre;
	
	
	private int horario;
	
	
	@Size(max = 100, message = "Longuitud máxima 100 caracteres")
	private String docente;
	
	
	private String salon;
	
	
	private String estado;
	
	public Clase() {}

	public Clase(String nombre, int horario, String docente, String salon, String estado) {
	    this("rector", nombre, horario, docente, salon, estado);
	}

	public Clase(String userName, String nombre, int horario, String docente, String salon, String estado) {
		this.userName=userName;
		this.nombre=nombre;
		this.horario=horario;
		this.docente=docente;
		this.salon=salon;
		this.estado=estado;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
