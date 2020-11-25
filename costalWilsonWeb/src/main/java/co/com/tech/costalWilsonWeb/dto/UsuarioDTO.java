package co.com.tech.costalWilsonWeb.dto;

import java.io.Serializable;
import java.util.Date;

public class UsuarioDTO implements Serializable {

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long nroIdentificacion;

	Date fecghaRegistro;
	
	
	public UsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UsuarioDTO(Long id, Long nroIdentificacion, Date fecghaRegistro) {
		super();
		this.id = id;
		this.nroIdentificacion = nroIdentificacion;
		this.fecghaRegistro = fecghaRegistro;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(Long nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	public Date getFecghaRegistro() {
		return fecghaRegistro;
	}

	public void setFecghaRegistro(Date fecghaRegistro) {
		this.fecghaRegistro = fecghaRegistro;
	}	
	
	
	
	
	
}
