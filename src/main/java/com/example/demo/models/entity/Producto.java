package com.example.demo.models.entity;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "productos")

public class Producto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5228334152478331300L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String matriz;
	private String sector;
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatriz() {
		return matriz;
	}
	public void setMatriz(String matriz) {
		this.matriz = matriz;
	}

}
