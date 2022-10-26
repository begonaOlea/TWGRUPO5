package com.curso.jpa.entidades;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Embeddable
public class DetalleFacturaPK {

	private int idFactura;
	private int lineaDetalle;
}

@Entity
class DetalleFactura{
	@EmbeddedId 
	private DetalleFacturaPK id;
	
	private String detalle;
	
}


/**
 *    DETALLE FACTURA 
 *       PK ES IDFACTURA+LINEA
 *     
 *      IDFACTURA LINEA DETALLE
 *      1          1     LAPIZ
 *      1          2     ZAPATO
 *      2          1      SSS
 *      2          2     LASDFASD
 */
