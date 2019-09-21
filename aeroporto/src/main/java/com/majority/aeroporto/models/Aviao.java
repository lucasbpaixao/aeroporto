package com.majority.aeroporto.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aviao {

	@Id
	private long id;
	
	private String numeroAviao;
	
	private String modelo;
	
	private EmpresaAerea empresaAerea;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumeroAviao() {
		return numeroAviao;
	}

	public void setNumeroAviao(String numeroAviao) {
		this.numeroAviao = numeroAviao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public EmpresaAerea getEmpresaAerea() {
		return empresaAerea;
	}

	public void setEmpresaAerea(EmpresaAerea empresaAerea) {
		this.empresaAerea = empresaAerea;
	}
	
}
