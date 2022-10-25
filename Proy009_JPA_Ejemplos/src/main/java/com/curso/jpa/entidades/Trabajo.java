package com.curso.jpa.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS",schema = "HR")
public class Trabajo implements Serializable {

	/**
	 * indica la versión de la clase
	 */
	private static final long serialVersionUID = 2L;
	
	//ATRIBUTOS
	 @Id
	 @Column(name="JOB_ID")
     private String id;
	 @Column(name="JOB_TITLE")
     private String tituloTrabajo;
	 @Column(name="MIN_SALARY")
     private Double salarioMin;
	 @Column(name="MAX_SALARY")
     private Double salarioMax;
     public Trabajo() {}


	public Trabajo(String id, String tituloTrabajo, Double salarioMin, Double salarioMax) {
		super();
		this.id = id;
		this.tituloTrabajo = tituloTrabajo;
		this.salarioMin = salarioMin;
		this.salarioMax = salarioMax;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTituloTrabajo() {
		return tituloTrabajo;
	}


	public void setTituloTrabajo(String tituloTrabajo) {
		this.tituloTrabajo = tituloTrabajo;
	}


	public Double getSalarioMin() {
		return salarioMin;
	}


	public void setSalarioMin(Double salarioMin) {
		this.salarioMin = salarioMin;
	}


	public Double getSalarioMax() {
		return salarioMax;
	}


	public void setSalarioMax(Double salarioMax) {
		this.salarioMax = salarioMax;
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
		Trabajo other = (Trabajo) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Trabajo [id=" + id 
				+ ", tituloTrabajo=" 
				+ tituloTrabajo 
				+ ", salarioMin=" + salarioMin + ", salarioMax="
				+ salarioMax + "]";
	}



}
