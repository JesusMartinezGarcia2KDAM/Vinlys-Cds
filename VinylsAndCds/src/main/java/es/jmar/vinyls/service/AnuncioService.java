package es.jmar.vinyls.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.model.MAnuncio;

public interface AnuncioService {
	
	ResponseEntity<String> insertar(Anuncio anuncio);
	
	ResponseEntity<String> actualizar(Anuncio anuncio);
	
	ResponseEntity<String> borrar(String titulo, int id);
	
	List<MAnuncio> obtener();
	
	List<MAnuncio> obtenerPorPaginacion(Pageable pageable);

}
