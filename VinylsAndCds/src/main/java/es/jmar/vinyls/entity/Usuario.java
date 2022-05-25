package es.jmar.vinyls.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="USUARIO")
public class Usuario implements /*UserDetails,*/ Serializable {
	
	@Id
	@Column(name="username")
	private String username;

	@Column(name="nombre", nullable = false, length=50)
	private String nombreYapellidos;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@ManyToOne
	private Rol rol;
	
	

	public Usuario() {
	}

	public Usuario(String username, String nombreYapellidos, String password, Rol rol) {
		super();
		this.username = username;
		this.nombreYapellidos = nombreYapellidos;
		this.password = password;
		this.rol = rol;
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

//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Arrays.asList( rol );
//	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}
	
	
	
	
	
	
}