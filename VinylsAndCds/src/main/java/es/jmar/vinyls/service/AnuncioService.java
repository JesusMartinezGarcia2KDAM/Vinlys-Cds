package es.jmar.vinyls.service;

import java.util.List;

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.model.MAnuncio;

public interface AnuncioService {
	
	boolean insertar(Anuncio anuncio);
	
	boolean actualizar(Anuncio anuncio);
	
	boolean borrar(String titulo, int id);
	
	List<MAnuncio> obtener();

}
