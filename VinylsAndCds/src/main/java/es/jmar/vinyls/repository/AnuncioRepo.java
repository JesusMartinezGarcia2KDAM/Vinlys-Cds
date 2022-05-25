package es.jmar.vinyls.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.jmar.vinyls.entity.Anuncio;

@Repository
public interface AnuncioRepo extends JpaRepository<Anuncio, Serializable> {
	
	public abstract Anuncio findByTituloAndId(String titulo, int id);

}
