package co.com.tech.costalWilsonWeb.util;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import co.com.tech.costalWilsonWeb.dto.UsuarioDTO;
import co.com.tech.costalWilsonWeb.entity.UsuarioEntity;

@Component
public class ConvertUsuario {
	
	
	private ModelMapper modelMapper = new ModelMapper();
	   
    public UsuarioEntity convertToEntity(UsuarioDTO usuarioDTO) throws ParseException {
        return modelMapper.map(usuarioDTO, UsuarioEntity.class);
    }

}
