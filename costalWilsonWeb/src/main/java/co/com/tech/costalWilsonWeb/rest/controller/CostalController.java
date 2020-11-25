package co.com.tech.costalWilsonWeb.rest.controller;


import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.tech.costalWilsonWeb.dto.EntradaDTO;
import co.com.tech.costalWilsonWeb.service.CostalService;

@CrossOrigin
@RestController
@RequestMapping("/costal")
public class CostalController {
	
	@Autowired
	CostalService costalService;
	
	
	

	@PostMapping(path="/calcularMaxViajes")
    @Produces("text/plain")  


	public Response obtenerMaxViajes(@RequestBody EntradaDTO entradaDTO) {
		
		return (Response) costalService.obtenerSalidaViajes(entradaDTO);
	}
		
			
}
