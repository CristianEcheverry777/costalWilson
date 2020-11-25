package co.com.tech.costalWilsonWeb.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioEntity {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private Long nroIdentificacion;	
	
	private Date fechaRegistro;
	

	public UsuarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UsuarioEntity(Long id, Long nroIdentificacion, Date fechaRegistro) {
		super();
		this.id = id;
		this.nroIdentificacion = nroIdentificacion;
		this.fechaRegistro = fechaRegistro;
	}



	public Long getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(Long nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}



	public Date getFechaRegistro() {
		return fechaRegistro;
	}



	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
	
	

}
