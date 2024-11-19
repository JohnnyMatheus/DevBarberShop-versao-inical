package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codagen;

    private LocalDateTime data_hora;

    private String status;

    @ManyToOne
    @JoinColumn(name = "clientecodcli")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "funcionariocodfun")
    private Funcionario funcionario;

    // Getters e Setters
    public Long getCodagen() {
        return codagen;
    }

    public void setCodagen(Long codagen) {
        this.codagen = codagen;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
