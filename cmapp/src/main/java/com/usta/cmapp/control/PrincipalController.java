package com.usta.cmapp.control;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "principal")
@SessionScoped
public class PrincipalController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Properties properties;
	private String userAccess;
	private final static String PAGE_PRINCIPAL = "../login/login.faces";

	/**
	 * constructor class
	 */
	public PrincipalController() {
		try {
			properties = new Properties();
			userAccess = null;
			chargeProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * init variables
	 */
	private void chargeProperties() {
		try {
			properties.load(PrincipalController.class.getResourceAsStream("messages.properties"));
			userAccess = ((String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get(LoginController.USER_AUTENTICH)).toUpperCase();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					properties.getProperty("errorGeneral"), properties.getProperty("errorCargaPropiedades")));
		}
	}

	/**
	 * este método se inicializa tanpronto se carga la clase y después que crea el
	 * contructor. NO recibe invocación de ningún cliente, el cliente es el mismo
	 * servidor cuando la aplicación es inicializada
	 */
	@PostConstruct
	public void chargeData() {
		try {

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					properties.getProperty("errorGeneral"), properties.getProperty("errorCargaPropiedades")));
		}
	}

	public void logout() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("principal");
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.remove(LoginController.USER_AUTENTICH);
			FacesContext.getCurrentInstance().getExternalContext().redirect(PAGE_PRINCIPAL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUserAccess() {
		return userAccess;
	}

	public void setUserAccess(String userAccess) {
		this.userAccess = userAccess;
	}

}
