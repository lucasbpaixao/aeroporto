package com.majority.aeroporto.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;
	
	private String origem;
	
	private String destino;
	
	private String portaoEmbarque;
	
	private String plaPiloto;
	
	private String plaCoPiloto;
	
	private Aviao aviao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPortaoEmbarque() {
		return portaoEmbarque;
	}

	public void setPortaoEmbarque(String portaoEmbarque) {
		this.portaoEmbarque = portaoEmbarque;
	}

	public String getPlaPiloto() {
		return plaPiloto;
	}

	public void setPlaPiloto(String plaPiloto) {
		this.plaPiloto = plaPiloto;
	}

	public String getPlaCoPiloto() {
		return plaCoPiloto;
	}

	public void setPlaCoPiloto(String plaCoPiloto) {
		this.plaCoPiloto = plaCoPiloto;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	
	
	
}
