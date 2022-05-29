package es.jmar.vinyls.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import es.jmar.vinyls.entity.Usuario;
import es.jmar.vinyls.model.MUsuario;

public interface UsuarioService {
	
	ResponseEntity<String> insertar(Usuario usuario);
	
	ResponseEntity<String> actualizar(Usuario usuario);
	
	ResponseEntity<String> borrar(String username);
	
	List<MUsuario> obtener();
	
	List<MUsuario> obtenerPorPaginacion(Pageable pageable);

}
