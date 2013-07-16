package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the catalogo database table.
 * 
 */
@Entity
public class Catalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_CATALOGO_ID_GENERATOR", sequenceName = "catalogo_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_CATALOGO_ID_GENERATOR")
	@Column(name="catalogo_id")
	private long catalogoId;

	@Column(name="catalogo_descripcion")
	private String catalogoDescripcion;

	@Column(name="catalogo_nombre")
	private String catalogoNombre;

	@Column(name="catalogo_orden")
	private BigDecimal catalogoOrden;

	//bi-directional many-to-one association to Detalle
	@OneToMany(mappedBy="catalogo")
	private List<Detalle> detalles;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="catalogo")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="catalogo1")
	private List<Producto> productos1;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="catalogo2")
	private List<Producto> productos2;

	public Catalogo() {
	}

	public long getCatalogoId() {
		return this.catalogoId;
	}

	public void setCatalogoId(long catalogoId) {
		this.catalogoId = catalogoId;
	}

	public String getCatalogoDescripcion() {
		return this.catalogoDescripcion;
	}

	public void setCatalogoDescripcion(String catalogoDescripcion) {
		this.catalogoDescripcion = catalogoDescripcion;
	}

	public String getCatalogoNombre() {
		return this.catalogoNombre;
	}

	public void setCatalogoNombre(String catalogoNombre) {
		this.catalogoNombre = catalogoNombre;
	}

	public BigDecimal getCatalogoOrden() {
		return this.catalogoOrden;
	}

	public void setCatalogoOrden(BigDecimal catalogoOrden) {
		this.catalogoOrden = catalogoOrden;
	}

	public List<Detalle> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public List<Producto> getProductos1() {
		return this.productos1;
	}

	public void setProductos1(List<Producto> productos1) {
		this.productos1 = productos1;
	}

	public List<Producto> getProductos2() {
		return this.productos2;
	}

	public void setProductos2(List<Producto> productos2) {
		this.productos2 = productos2;
	}

}