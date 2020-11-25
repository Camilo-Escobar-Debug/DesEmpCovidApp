package com.muestra_mysql.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the login database table.
 * 
 */
@Entity
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Login.FIND_ALL";

	public static final String FIND_USER_CREDENTIALS_MYSQL = "Login.FIND_USER_CREDENTIALS_MYSQL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_login")
	private Integer idLogin;

	private String clave;

	private String usuario;

	public Login() {
	}

	public Integer getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}