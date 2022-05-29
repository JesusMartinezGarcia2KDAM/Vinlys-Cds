package es.jmar.vinyls.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmar.vinyls.entity.Usuario;
import es.jmar.vinyls.model.MUsuario;
import es.jmar.vinyls.service.impl.UsuarioServiceImpl;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl service;
	
	@PutMapping("/usuario")
	public ResponseEntity<String> agregarUsuario(@RequestBody @Valid Usuario usuario) {
		return service.insertar(usuario);
		}
	
	@PostMapping("/usuario")
	public ResponseEntity<String> actualizar(@RequestBody @Valid Usuario usuario) {
		return service.actualizar(usuario);
	}
	
	@DeleteMapping("/usuario/{username}")
	public ResponseEntity<String> borrarUsuario(@PathVariable("username") String username) {
		return service.borrar(username);
	}
	
	@GetMapping("/usuarios")
	public List<MUsuario> obtenerUsuarios(){
		return service.obtener();
	}

}
