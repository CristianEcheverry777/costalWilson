package co.com.tech.costalWilsonWeb.service.Impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import co.com.tech.costalWilsonWeb.dto.EntradaDTO;
import javax.ws.rs.core.Response.ResponseBuilder;
import co.com.tech.costalWilsonWeb.service.CostalService;
import co.com.tech.costalWilsonWeb.util.Constantes;
import co.com.tech.costalWilsonWeb.util.Constantes.Caracteres;

@Service
public class CostalServiceImpl implements CostalService {

	public StringBuilder calcularMaxViajes(List<Integer> entrada) {
		StringBuilder salida = new StringBuilder();
		try {
			int nroDiasTrabajo = entrada.get(0);
			int nroElementosCargar = 0;
			int pesoElementSuperior = 0;
			int contadorPila = 0;
			int contadorViajes = 0;
			int librasMinimas = 50;
			List<Integer> elementos = new ArrayList<>();
			entrada.remove(0);
			for (int i = 0; i < nroDiasTrabajo; i++) {
				nroElementosCargar = entrada.get(contadorPila);
				for (int j = 0; j < nroElementosCargar; j++) {
					elementos.add(entrada.get(contadorPila + 1));
					contadorPila++;
				}
				contadorPila++;
				elementos.sort((o1, o2) -> o1.compareTo(o2));

				for (int k = 1; k < elementos.size();) {
					pesoElementSuperior = elementos.get(elementos.size() - 1);
					if (pesoElementSuperior >= 50) {
						contadorViajes++;
						elementos.remove(elementos.size() - 1);
					} else {
						contadorViajes++;
						elementos.remove(elementos.size() - 1);
						// Ciclo recorre elementos "No visibles" del costal y los remueve de la lista "elementos".
						for (int m = 0; m < (librasMinimas / pesoElementSuperior); m++) {
							elementos.remove(0);
						}
					}
				}
				elementos.clear();
				salida.append(Caracteres.CASE_NUM + (i + 1) + Caracteres.DOS_PUNTOS + contadorViajes + Caracteres.SALTO_LINEA);
				contadorViajes = 0;
			}
		} catch (Exception e) {
			salida = null;
			e.printStackTrace();
			
		}

		return salida;
	}

	@Override
	public Response obtenerSalidaViajes(EntradaDTO entradaDTO) {
		String ruta = Constantes.DEFAULT_PATH;
		String contenido = this.calcularMaxViajes(entradaDTO.getEntrada()).toString();

		try {
			PrintWriter writer = new PrintWriter(ruta, Caracteres.UTF);
			writer.println(contenido);
			writer.close();
			File file = new File(ruta);
			ResponseBuilder response = Response.ok((Object) file);
			response.header(Caracteres.CONTENT, Caracteres.ATTACHMENT + file.getName() + Caracteres.SLASH)
					.type(MediaType.TEXT_PLAIN);

			return response.build();
		} catch (FileNotFoundException | UnsupportedEncodingException | IndexOutOfBoundsException
				| NullPointerException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

}
