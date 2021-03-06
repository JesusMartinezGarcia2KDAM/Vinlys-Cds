package es.jmar.vinyls.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import es.jmar.vinyls.converter.Convertidor;
import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.model.MAnuncio;
import es.jmar.vinyls.repository.AnuncioRepo;
import es.jmar.vinyls.service.AnuncioService;

@Service
public class AnuncioServiceImpl implements AnuncioService {
	
	@Autowired
	AnuncioRepo repo;
	
	@Autowired
	@Qualifier("convertidor")
	Convertidor converter;

	
	
	private static final Log logger = LogFactory.getLog(AnuncioServiceImpl.class);
	
	@Override
	public ResponseEntity<String> insertar(Anuncio anuncio) {
		logger.info("CREANDO ANUNCIO");
		try {
			repo.save(anuncio);
			logger.info("CREANDO ANUNCIO");
			return ResponseEntity.ok("OK");
		} catch(Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
		}
		
	}

	@Override
	public ResponseEntity<String> actualizar(Anuncio anuncio) {
		logger.info("ACTUALIZANDO ANUNCIO");
		try {
			repo.save(anuncio);
			logger.info("ACTUALIZANDO ANUNCIO");
			return ResponseEntity.ok("OK");
		} catch(Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
		}
	}

	@Override
	public ResponseEntity<String> borrar(String titulo, int id) {
		logger.warn("BORRANDO ANUNCIO");
		try {
			logger.info("BORRANDO ANUNCIO");
			//Empleado e = empleadoDAO.findById(id);
			Anuncio a = repo.findByTituloAndId(titulo, id);
			logger.info(a.getId());
			repo.delete(a);
			
			return ResponseEntity.ok("OK");
		} catch (Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
			//return false;
		}
	}

	@Override
	public List<MAnuncio> obtener() {
		logger.info("OBTENIENDO TODOS LOS ELEMENTOS");
		return converter.convertirListaAnuncio(repo.findAll());
	}

	@Override
	public List<MAnuncio> obtenerPorPaginacion(Pageable pageable) {
		return converter.convertirListaAnuncio(repo.findAll(pageable).getContent());
	}

}
