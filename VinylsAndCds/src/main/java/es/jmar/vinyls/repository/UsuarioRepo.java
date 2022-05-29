package es.jmar.vinyls.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.jmar.vinyls.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Serializable> {
	
	public abstract Usuario findByUsername(String username);

}
