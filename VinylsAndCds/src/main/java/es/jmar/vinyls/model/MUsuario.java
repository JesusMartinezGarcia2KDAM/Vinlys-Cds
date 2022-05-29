package es.jmar.vinyls.model;

import java.util.List;

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.entity.Rol;
import es.jmar.vinyls.entity.Usuario;

public class MUsuario {
	
	private String username;
	
	private String nombreYapellidos;

	private String password;
	
	private Rol rol;
	
	private List<Anuncio> anuncios;
	
	public MUsuario(Usuario u) {
		super();
		this.username = u.getUsername();
		this.nombreYapellidos = u.getNombreYapellidos();
		this.password = u.getPassword();
		this.rol = u.getRol();
		this.anuncios = u.getAnuncios();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombreYapellidos() {
		return nombreYapellidos;
	}

	public void setNombreYapellidos(String nombreYapellidos) {
		this.nombreYapellidos = nombreYapellidos;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Anuncio> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(List<Anuncio> anuncios) {
		this.anuncios = anuncios;
	}
	
	
}


