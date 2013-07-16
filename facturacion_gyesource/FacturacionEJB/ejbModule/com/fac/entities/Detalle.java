package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detalle database table.
 * 
 */
@Entity
public class Detalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_DETALLE_ID_GENERATOR", sequenceName = "detalle_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_DETALLE_ID_GENERATOR")
	@Column(name="detalle_id")
	private long detalleId;

	@Column(name="detalle_cantidad")
	private Integer detalleCantidad;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="detalle_estado")
	private Catalogo catalogo;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="detalle_factura_id")
	private Factura factura;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="detalle_producto_id")
	private Producto producto;

	public Detalle() {
	}

	public long getDetalleId() {
		return this.detalleId;
	}

	public void setDetalleId(long detalleId) {
		this.detalleId = detalleId;
	}

	public Integer getDetalleCantidad() {
		return this.detalleCantidad;
	}

	public void setDetalleCantidad(Integer detalleCantidad) {
		this.detalleCantidad = detalleCantidad;
	}

	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}