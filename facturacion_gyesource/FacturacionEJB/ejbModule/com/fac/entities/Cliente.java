package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_CLIENTE_ID_GENERATOR", sequenceName = "cliente_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_CLIENTE_ID_GENERATOR")
	@Column(name="cliente_id")
	private long clienteId;

	@Column(name="cliente_correo")
	private String clienteCorreo;

	@Column(name="cliente_direccion")
	private String clienteDireccion;

	@Column(name="cliente_observaciones")
	private String clienteObservaciones;

	@Column(name="cliente_referencia_adic")
	private String clienteReferenciaAdic;

	@Column(name="cliente_representante")
	private String clienteRepresentante;

	@Column(name="cliente_telefono_oficina")
	private String clienteTelefonoOficina;

	@Column(name="cliente_telefono_rep_celular")
	private String clienteTelefonoRepCelular;

	@Column(name="razon_social")
	private String razonSocial;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="cliente")
	private List<Factura> facturas;

	public Cliente() {
	}

	public long getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteCorreo() {
		return this.clienteCorreo;
	}

	public void setClienteCorreo(String clienteCorreo) {
		this.clienteCorreo = clienteCorreo;
	}

	public String getClienteDireccion() {
		return this.clienteDireccion;
	}

	public void setClienteDireccion(String clienteDireccion) {
		this.clienteDireccion = clienteDireccion;
	}

	public String getClienteObservaciones() {
		return this.clienteObservaciones;
	}

	public void setClienteObservaciones(String clienteObservaciones) {
		this.clienteObservaciones = clienteObservaciones;
	}

	public String getClienteReferenciaAdic() {
		return this.clienteReferenciaAdic;
	}

	public void setClienteReferenciaAdic(String clienteReferenciaAdic) {
		this.clienteReferenciaAdic = clienteReferenciaAdic;
	}

	public String getClienteRepresentante() {
		return this.clienteRepresentante;
	}

	public void setClienteRepresentante(String clienteRepresentante) {
		this.clienteRepresentante = clienteRepresentante;
	}

	public String getClienteTelefonoOficina() {
		return this.clienteTelefonoOficina;
	}

	public void setClienteTelefonoOficina(String clienteTelefonoOficina) {
		this.clienteTelefonoOficina = clienteTelefonoOficina;
	}

	public String getClienteTelefonoRepCelular() {
		return this.clienteTelefonoRepCelular;
	}

	public void setClienteTelefonoRepCelular(String clienteTelefonoRepCelular) {
		this.clienteTelefonoRepCelular = clienteTelefonoRepCelular;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

}