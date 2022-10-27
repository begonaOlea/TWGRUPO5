package com.curso.jpa.entidades;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
public class Empleado implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "EMPLOYEES_SEQ", name = "CUST_SEQ", allocationSize=1)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String nombre;
	@Column(name = "LAST_NAME")
	private String apellidos;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE_NUMBER")
	private String telefono;

	@Temporal(TemporalType.DATE) // javax.persistence.Temporal
	@Column(name = "HIRE_DATE")
	private Date fechaContratacion; // java.util.Date
	

	@Column(name = "JOB_ID")
	private String idTrabajo;       // USO  PARA INSERTS UPDATES 
	
	
	@Column(name = "SALARY")
	private Double salario;
	@Column(name = "COMMISSION_PCT")
	private Double comision;
	
	@Column(name = "MANAGER_ID")
	private Long idManager;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	//private Integer idDepartamento;
	private Departamento departamento;
	

	public Empleado() {
		super();
	}
	
	public Empleado(Long id, String nombre, String ape) {
		this.id = id;
		this.nombre =nombre;
		this.apellidos = ape;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getIdTrabajo() {
		return idTrabajo;
	}
	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Long getIdManager() {
		return idManager;
	}

	public void setIdManager(Long idManager) {
		this.idManager = idManager;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
