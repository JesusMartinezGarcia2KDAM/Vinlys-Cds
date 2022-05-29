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

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.model.MAnuncio;
import es.jmar.vinyls.service.impl.AnuncioServiceImpl;

@RestController
public class AnuncioController {

	@Autowired
	AnuncioServiceImpl service;
	
	@PutMapping("/anuncio")
	public ResponseEntity<String> agregarAnuncio(@RequestBody @Valid Anuncio anuncio) {
		return service.insertar(anuncio);
		}
	
	@PostMapping("/anuncio")
	public ResponseEntity<String> actualizar(@RequestBody @Valid Anuncio anuncio) {
		return service.actualizar(anuncio);
	}
	
	@DeleteMapping("/anuncio/{id}/{titulo}")
	public ResponseEntity<String> borrarAnuncio(@PathVariable("id") int id, @PathVariable("titulo") String titulo) {
		return service.borrar(titulo, id);
	}
	
	@GetMapping("/anuncios")
	public List<MAnuncio> obtenerAnuncios(){
		return service.obtener();
	}
}
