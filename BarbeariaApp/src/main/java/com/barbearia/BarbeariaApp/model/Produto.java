package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codprod;

    private String nomeprod;
    private String descprod;
    private int qtdprod;
    private double precoprod;

    @ManyToOne
    @JoinColumn(name = "fornecedorcodforn")
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "servicocodserv")
    private Servico servico;

	public Long getCodprod() {
		return codprod;
	}

	public void setCodprod(Long codprod) {
		this.codprod = codprod;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public String getDescprod() {
		return descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	public int getQtdprod() {
		return qtdprod;
	}

	public void setQtdprod(int qtdprod) {
		this.qtdprod = qtdprod;
	}

	public double getPrecoprod() {
		return precoprod;
	}

	public void setPrecoprod(double precoprod) {
		this.precoprod = precoprod;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

  
}