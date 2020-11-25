package co.com.tech.costalWilsonWeb.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tech.costalWilsonWeb.entity.UsuarioEntity;
import co.com.tech.costalWilsonWeb.repositories.UsuarioRepository;
import co.com.tech.costalWilsonWeb.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public void save(UsuarioEntity usuario)  {
		
		usuarioRepository.save(usuario);
		
	}

	
	

}
