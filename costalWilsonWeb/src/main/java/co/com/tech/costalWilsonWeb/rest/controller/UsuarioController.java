package co.com.tech.costalWilsonWeb.rest.controller;

import java.text.ParseException;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import co.com.tech.costalWilsonWeb.dto.UsuarioDTO;
import co.com.tech.costalWilsonWeb.entity.UsuarioEntity;
import co.com.tech.costalWilsonWeb.service.UsuarioService;
import co.com.tech.costalWilsonWeb.util.ConvertUsuario;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private ConvertUsuario convertUsuario;
	
	@Autowired
	private UsuarioService UsuarioService;
	
	@PostMapping("/usuario/adicionarUsuario")
	public ResponseEntity<String> adicionarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		
		UsuarioEntity usuario;
		
		try {
			usuario = convertUsuario.convertToEntity(usuarioDTO);
			usuario.setFechaRegistro(new Date());
			UsuarioService.save(usuario);
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		
		return ResponseEntity.ok("Registro guardado exitosamente");
	}

}
