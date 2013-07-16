package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_PRODUCTO_ID_GENERATOR", sequenceName = "producto_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_PRODUCTO_ID_GENERATOR")
	@Column(name="producto_id")
	private long productoId;

	@Column(name="producto_codigo")
	private String productoCodigo;

	@Column(name="producto_descripcion")
	private String productoDescripcion;

	@Column(name="producto_descuento")
	private BigDecimal productoDescuento;

	@Column(name="producto_info_adicional")
	private String productoInfoAdicional;

	@Column(name="producto_peso")
	private BigDecimal productoPeso;

	@Column(name="producto_precio_unitario")
	private BigDecimal productoPrecioUnitario;

	//bi-directional many-to-one association to Detalle
	@OneToMany(mappedBy="producto")
	private List<Detalle> detalles;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="producto_unidad")
	private Catalogo catalogo1;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="producto_estado")
	private Catalogo catalogo2;

	public Producto() {
	}

	public long getProductoId() {
		return this.productoId;
	}

	public void setProductoId(long productoId) {
		this.productoId = productoId;
	}

	public String getProductoCodigo() {
		return this.productoCodigo;
	}

	public void setProductoCodigo(String productoCodigo) {
		this.productoCodigo = productoCodigo;
	}

	public String getProductoDescripcion() {
		return this.productoDescripcion;
	}

	public void setProductoDescripcion(String productoDescripcion) {
		this.productoDescripcion = productoDescripcion;
	}

	public BigDecimal getProductoDescuento() {
		return this.productoDescuento;
	}

	public void setProductoDescuento(BigDecimal productoDescuento) {
		this.productoDescuento = productoDescuento;
	}

	public String getProductoInfoAdicional() {
		return this.productoInfoAdicional;
	}

	public void setProductoInfoAdicional(String productoInfoAdicional) {
		this.productoInfoAdicional = productoInfoAdicional;
	}

	public BigDecimal getProductoPeso() {
		return this.productoPeso;
	}

	public void setProductoPeso(BigDecimal productoPeso) {
		this.productoPeso = productoPeso;
	}

	public BigDecimal getProductoPrecioUnitario() {
		return this.productoPrecioUnitario;
	}

	public void setProductoPrecioUnitario(BigDecimal productoPrecioUnitario) {
		this.productoPrecioUnitario = productoPrecioUnitario;
	}

	public List<Detalle> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public Catalogo getCatalogo1() {
		return this.catalogo1;
	}

	public void setCatalogo1(Catalogo catalogo1) {
		this.catalogo1 = catalogo1;
	}

	public Catalogo getCatalogo2() {
		return this.catalogo2;
	}

	public void setCatalogo2(Catalogo catalogo2) {
		this.catalogo2 = catalogo2;
	}

}