package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codfun;

    private String nomefun;
    private String telefone;
    private String email;
    private String cargo;

    // Getters e Setters
    public Long getCodfun() {
        return codfun;
    }

    public void setCodfun(Long codfun) {
        this.codfun = codfun;
    }

    public String getNomefun() {
        return nomefun;
    }

    public void setNomefun(String nomefun) {
        this.nomefun = nomefun;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
