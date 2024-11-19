package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codcli;
    
    private String nomcli;
    private String telcli;
    private String emailcli;
    private String bairrocli;
    private String ruaendcli;
    private String sexocli;
    private String cidadecli;
    private LocalDate dtnascli;
    public Long getCodcli() {
        return codcli;
    }
    public void setCodcli(Long codcli) {
        this.codcli = codcli;
    }
    public String getNomcli() {
        return nomcli;
    }
    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }
    public String getTelcli() {
        return telcli;
    }
    public void setTelcli(String telcli) {
        this.telcli = telcli;
    }
    public String getEmailcli() {
        return emailcli;
    }
    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }
    public String getBairrocli() {
        return bairrocli;
    }
    public void setBairrocli(String bairrocli) {
        this.bairrocli = bairrocli;
    }
    public String getRuaendcli() {
        return ruaendcli;
    }
    public void setRuaendcli(String ruaendcli) {
        this.ruaendcli = ruaendcli;
    }
    public String getSexocli() {
        return sexocli;
    }
    public void setSexocli(String sexocli) {
        this.sexocli = sexocli;
    }
    public String getCidadecli() {
        return cidadecli;
    }
    public void setCidadecli(String cidadecli) {
        this.cidadecli = cidadecli;
    }
    public LocalDate getDtnascli() {
        return dtnascli;
    }
    public void setDtnascli(LocalDate dtnascli) {
        this.dtnascli = dtnascli;
    }

    // Getters e Setters
    
    
}