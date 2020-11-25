package co.com.tech.costalWilsonWeb.service;


import javax.ws.rs.core.Response;


import co.com.tech.costalWilsonWeb.dto.EntradaDTO;

public interface CostalService  {
	

	public Response obtenerSalidaViajes(EntradaDTO entradaDTO);

}
