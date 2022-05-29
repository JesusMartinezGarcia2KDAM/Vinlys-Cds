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
import es.jmar.vinyls.entity.Usuario;
import es.jmar.vinyls.model.MUsuario;
import es.jmar.vinyls.repository.UsuarioRepo;
import es.jmar.vinyls.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired
	UsuarioRepo repo;
	
	@Autowired
	@Qualifier("convertidor")
	Convertidor converter;
	
	private static final Log logger = LogFactory.getLog(AnuncioServiceImpl.class);

	
	@Override
	public ResponseEntity<String> insertar(Usuario usuario) {
		logger.info("CREANDO USUARIO");
		try {
			repo.save(usuario);
			logger.info("CREANDO USUARIO");
			return ResponseEntity.ok("OK");
		} catch(Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
		}
	}

	@Override
	public ResponseEntity<String> actualizar(Usuario usuario) {
		logger.info("ACTUALIZANDO USUARIO");
		try {
			repo.save(usuario);
			logger.info("ACTUALIZANDO USUARIO");
			return ResponseEntity.ok("OK");
		} catch(Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
		}
	}

	@Override
	public ResponseEntity<String> borrar(String username) {
		logger.warn("BORRANDO ANUNCIO");
		try {
			logger.info("BORRANDO ANUNCIO");
			//Empleado e = empleadoDAO.findById(id);
			Usuario u = repo.findByUsername(username);
			logger.info(u.getUsername());
			repo.delete(u);
			
			return ResponseEntity.ok("OK");
		} catch (Exception e) {
			logger.error("HUBO UN ERROR");
			throw(e);
			//return false;
		}
	}

	@Override
	public List<MUsuario> obtener() {
		logger.info("OBTENIENDO TODOS LOS ELEMENTOS");
		return converter.convertirListaUsuario(repo.findAll());
	}

	@Override
	public List<MUsuario> obtenerPorPaginacion(Pageable pageable) {
		return converter.convertirListaUsuario(repo.findAll(pageable).getContent());
	}

}
