package com.fac.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the factura database table.
 * 
 */
@Entity
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FACTURACION_FACTURA_ID_GENERATOR", sequenceName = "factura_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FACTURACION_FACTURA_ID_GENERATOR")
	@Column(name="factura_id")
	private long facturaId;

	@Column(name="factura_descuento")
	private BigDecimal facturaDescuento;

	@Temporal(TemporalType.DATE)
	@Column(name="factura_fecha")
	private Date facturaFecha;

	@Column(name="factura_monto_iva")
	private BigDecimal facturaMontoIva;

	@Column(name="factura_monto_subtotal")
	private BigDecimal facturaMontoSubtotal;

	@Column(name="factura_monto_total")
	private BigDecimal facturaMontoTotal;

	//bi-directional many-to-one association to Detalle
	@OneToMany(mappedBy="factura")
	private List<Detalle> detalles;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="factura_estado")
	private Catalogo catalogo;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="factura_cliente")
	private Cliente cliente;

	public Factura() {
	}

	public long getFacturaId() {
		return this.facturaId;
	}

	public void setFacturaId(long facturaId) {
		this.facturaId = facturaId;
	}

	public BigDecimal getFacturaDescuento() {
		return this.facturaDescuento;
	}

	public void setFacturaDescuento(BigDecimal facturaDescuento) {
		this.facturaDescuento = facturaDescuento;
	}

	public Date getFacturaFecha() {
		return this.facturaFecha;
	}

	public void setFacturaFecha(Date facturaFecha) {
		this.facturaFecha = facturaFecha;
	}

	public BigDecimal getFacturaMontoIva() {
		return this.facturaMontoIva;
	}

	public void setFacturaMontoIva(BigDecimal facturaMontoIva) {
		this.facturaMontoIva = facturaMontoIva;
	}

	public BigDecimal getFacturaMontoSubtotal() {
		return this.facturaMontoSubtotal;
	}

	public void setFacturaMontoSubtotal(BigDecimal facturaMontoSubtotal) {
		this.facturaMontoSubtotal = facturaMontoSubtotal;
	}

	public BigDecimal getFacturaMontoTotal() {
		return this.facturaMontoTotal;
	}

	public void setFacturaMontoTotal(BigDecimal facturaMontoTotal) {
		this.facturaMontoTotal = facturaMontoTotal;
	}

	public List<Detalle> getDetalles() {
		return this.detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}