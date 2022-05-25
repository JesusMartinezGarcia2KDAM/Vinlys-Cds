package es.jmar.vinyls.model;

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.entity.Usuario;

public class MAnuncio {
	
	private int id;
	
	private String titulo;
	
	private Usuario usuario;
	
	private double precio;
	
	private String cuerpo;
	
	public MAnuncio() {
		
	}
	
	public MAnuncio(Anuncio a) {
		super();
		this.id = a.getId();
		this.titulo = a.getTitulo();
		this.usuario = a.getUsuario();
		this.precio = a.getPrecio();
		this.cuerpo = a.getCuerpo();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	

}
