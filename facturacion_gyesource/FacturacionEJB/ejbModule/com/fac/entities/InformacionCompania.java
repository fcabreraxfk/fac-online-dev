package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the informacion_compania database table.
 * 
 */
@Entity
@Table(name="informacion_compania")
public class InformacionCompania implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_INFO_CIA_ID_GENERATOR", sequenceName = "informacion_compania_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_INFO_CIA_ID_GENERATOR")
	@Column(name="compania_id")
	private long companiaId;

	@Column(name="compania_correo")
	private String companiaCorreo;

	@Column(name="compania_direccion")
	private String companiaDireccion;

	@Column(name="compania_razon_social")
	private String companiaRazonSocial;

	@Column(name="compania_rep_legal")
	private String companiaRepLegal;

	@Column(name="compania_rep_legal_celular")
	private String companiaRepLegalCelular;

	@Column(name="compania_telefono_fijo")
	private String companiaTelefonoFijo;

	public InformacionCompania() {
	}

	public long getCompaniaId() {
		return this.companiaId;
	}

	public void setCompaniaId(long companiaId) {
		this.companiaId = companiaId;
	}

	public String getCompaniaCorreo() {
		return this.companiaCorreo;
	}

	public void setCompaniaCorreo(String companiaCorreo) {
		this.companiaCorreo = companiaCorreo;
	}

	public String getCompaniaDireccion() {
		return this.companiaDireccion;
	}

	public void setCompaniaDireccion(String companiaDireccion) {
		this.companiaDireccion = companiaDireccion;
	}

	public String getCompaniaRazonSocial() {
		return this.companiaRazonSocial;
	}

	public void setCompaniaRazonSocial(String companiaRazonSocial) {
		this.companiaRazonSocial = companiaRazonSocial;
	}

	public String getCompaniaRepLegal() {
		return this.companiaRepLegal;
	}

	public void setCompaniaRepLegal(String companiaRepLegal) {
		this.companiaRepLegal = companiaRepLegal;
	}

	public String getCompaniaRepLegalCelular() {
		return this.companiaRepLegalCelular;
	}

	public void setCompaniaRepLegalCelular(String companiaRepLegalCelular) {
		this.companiaRepLegalCelular = companiaRepLegalCelular;
	}

	public String getCompaniaTelefonoFijo() {
		return this.companiaTelefonoFijo;
	}

	public void setCompaniaTelefonoFijo(String companiaTelefonoFijo) {
		this.companiaTelefonoFijo = companiaTelefonoFijo;
	}

}