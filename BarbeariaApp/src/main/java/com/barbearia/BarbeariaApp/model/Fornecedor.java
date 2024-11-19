package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codforn;

	private String nomeforn;
	private String telforn;
	private String emailforn;
	private String enderecoforn;

	// Getters e Setters

	public Long getCodforn() {
		return codforn;
	}

	public void setCodforn(Long codforn) {
		this.codforn = codforn;
	}

	public String getNomeforn() {
		return nomeforn;
	}

	public void setNomeforn(String nomeforn) {
		this.nomeforn = nomeforn;
	}

	public String getTelforn() {
		return telforn;
	}

	public void setTelforn(String telforn) {
		this.telforn = telforn;
	}

	public String getEmailforn() {
		return emailforn;
	}

	public void setEmailforn(String emailforn) {
		this.emailforn = emailforn;
	}

	public String getEnderecoforn() {
		return enderecoforn;
	}

	public void setEnderecoforn(String enderecoforn) {
		this.enderecoforn = enderecoforn;
	}

}
