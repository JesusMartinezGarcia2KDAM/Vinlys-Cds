package es.jmar.vinyls.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="ROL")
public class Rol implements /*GrantedAuthority,*/ Serializable {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String rol;

//	public String getAuthority() {
//		return ("ROLE_"+this.rol).toUpperCase();
//	}
//	
	public Rol(Integer id, String rol) {
		this.id = id;
		this.rol = rol;
	}

	public Rol() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
