package com.curso.spring.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PEDIDOS")
//@NamedQueries({
//	@NamedQuery(name="Pedido.findAll", 
//			    query = "SELECT p FROM Pedido p"),
//	@NamedQuery(name="Pedido.findbyIdUsuario", 
//    query = "SELECT p FROM Pedido p WHERE p.user = :usuarioNombre")
//	
//})
public class Pedido implements Serializable{

	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PED_SEQ")
	 @SequenceGenerator(sequenceName = "PEDIDO_SEQ", name = "PED_SEQ", allocationSize=1)	
	 private Integer id;
	 
	 @Column(name="USUARIO")
	 private String  user;
	 
	 @Column(name="DESCRIPCION")
	 @NotNull
	 private String desc;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name="FECHA_PEDIDO")
	 private Date fechaPedido;
	 
	 
	 @Column(name="ENTREGADO")
	 private boolean entregado;

	 
	 public Pedido() {}


	public Pedido(Integer id, String user, String desc, Date fechaPedido, boolean entregado) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.fechaPedido = fechaPedido;
		this.entregado = entregado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Date getFechaPedido() {
		return fechaPedido;
	}


	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", user=" + user + ", desc=" + desc + ", fechaPedido=" + fechaPedido
				+ ", entregado=" + entregado + "]";
	}
	 
	 
	 
	
}
