package br.com.campanhas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class campanha {
	@Column(name="nome")
	private String nome;
	
	@Column(name="idTime")
	private Integer idTime;
	
	@Column(name="dataInicio")
	private Date dataInicio;
	
	@Column(name="dataFim")
	private Date dataFim;
	
	public campanha(String string, int i, Date date, Date date2) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdTime() {
		return idTime;
	}
	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
