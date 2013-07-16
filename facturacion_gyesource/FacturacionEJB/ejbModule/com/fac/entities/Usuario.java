package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.buscarPorNickname", query = "SELECT u FROM Usuario u WHERE u.usuarioNickname = ?1"),
})
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_USUARIO_ID_GENERATOR", sequenceName = "usuario_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_USUARIO_ID_GENERATOR")
	@Column(name="usuario_id")
	private long usuarioId;

	@Column(name="usuario_cedula")
	private String usuarioCedula;

	@Column(name="usuario_clave")
	private String usuarioClave;

	@Column(name="usuario_clave_encriptada")
	private String usuarioClaveEncriptada;

	@Column(name="usuario_correo")
	private String usuarioCorreo;

	@Temporal(TemporalType.DATE)
	@Column(name="usuario_fecha_ultimo_acceso")
	private Date usuarioFechaUltimoAcceso;

	@Column(name="usuario_nickname")
	private String usuarioNickname;

	@Column(name="usuario_nombre")
	private String usuarioNombre;

	public Usuario() {
	}

	public long getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioCedula() {
		return this.usuarioCedula;
	}

	public void setUsuarioCedula(String usuarioCedula) {
		this.usuarioCedula = usuarioCedula;
	}

	public String getUsuarioClave() {
		return this.usuarioClave;
	}

	public void setUsuarioClave(String usuarioClave) {
		this.usuarioClave = usuarioClave;
	}

	public String getUsuarioClaveEncriptada() {
		return this.usuarioClaveEncriptada;
	}

	public void setUsuarioClaveEncriptada(String usuarioClaveEncriptada) {
		this.usuarioClaveEncriptada = usuarioClaveEncriptada;
	}

	public String getUsuarioCorreo() {
		return this.usuarioCorreo;
	}

	public void setUsuarioCorreo(String usuarioCorreo) {
		this.usuarioCorreo = usuarioCorreo;
	}

	public Date getUsuarioFechaUltimoAcceso() {
		return this.usuarioFechaUltimoAcceso;
	}

	public void setUsuarioFechaUltimoAcceso(Date usuarioFechaUltimoAcceso) {
		this.usuarioFechaUltimoAcceso = usuarioFechaUltimoAcceso;
	}

	public String getUsuarioNickname() {
		return this.usuarioNickname;
	}

	public void setUsuarioNickname(String usuarioNickname) {
		this.usuarioNickname = usuarioNickname;
	}

	public String getUsuarioNombre() {
		return this.usuarioNombre;
	}

	public void setUsuarioNombre(String usuarioNombre) {
		this.usuarioNombre = usuarioNombre;
	}

}