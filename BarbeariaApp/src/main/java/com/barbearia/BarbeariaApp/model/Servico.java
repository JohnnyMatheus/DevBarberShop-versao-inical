package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codserv;

    private String nomeserv;
    private String descserv;
    private double precoserv;
	public Long getCodserv() {
		return codserv;
	}
	public void setCodserv(Long codserv) {
		this.codserv = codserv;
	}
	public String getNomeserv() {
		return nomeserv;
	}
	public void setNomeserv(String nomeserv) {
		this.nomeserv = nomeserv;
	}
	public String getDescserv() {
		return descserv;
	}
	public void setDescserv(String descserv) {
		this.descserv = descserv;
	}
	public double getPrecoserv() {
		return precoserv;
	}
	public void setPrecoserv(double precoserv) {
		this.precoserv = precoserv;
	}

   
}