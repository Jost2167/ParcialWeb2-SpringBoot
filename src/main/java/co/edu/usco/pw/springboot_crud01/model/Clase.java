package co.edu.usco.pw.springboot_crud01.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="clases")
public class Clase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userName="RECTOR";
	
	
	@Size(max = 30, message = "Longuitud máxima 30 caracteres")
	private String nombre;
	
	@Size(max = 100, message = "Longuitud máxima 100 caracteres")
	private String descripcion;

	private int salon;
	
	private String horarioInicio;
	
	private String horarioFin;
	 
	private String docente;

	public Clase() {
		super();
	}

	public Clase(String nombre,String descripcion, int salon, String horarioInicio, String horarioFin, String docente) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.salon = salon;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.docente = docente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSalon() {
		return salon;
	}

	public void setSalon(int salon) {
		this.salon = salon;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFin() {
		return horarioFin;
	}

	public void setHorarioFin(String horarioFin) {
		this.horarioFin = horarioFin;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}


}
