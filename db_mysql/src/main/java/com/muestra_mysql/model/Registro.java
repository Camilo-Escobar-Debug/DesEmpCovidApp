package com.muestra_mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the registros database table.
 * 
 */
@Entity
@Table(name = "registros")
public class Registro implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Registro.FIND_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_registro")
	private Integer idRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_salida")
	private Date fechaSalida;

	@Column(name = "id_empresa")
	private java.math.BigInteger idEmpresa;

	@Column(name = "id_enfermedad")
	private java.math.BigInteger idEnfermedad;

	@Column(name = "id_persona")
	private java.math.BigInteger idPersona;

	private byte ingreso;

	private byte sintomas;

	private int temperatura;

	public Registro() {
	}

	public Integer getIdRegistro() {
		return this.idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public java.math.BigInteger getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(java.math.BigInteger idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public java.math.BigInteger getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(java.math.BigInteger idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public java.math.BigInteger getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(java.math.BigInteger idPersona) {
		this.idPersona = idPersona;
	}

	public byte getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(byte ingreso) {
		this.ingreso = ingreso;
	}

	public byte getSintomas() {
		return this.sintomas;
	}

	public void setSintomas(byte sintomas) {
		this.sintomas = sintomas;
	}

	public int getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}