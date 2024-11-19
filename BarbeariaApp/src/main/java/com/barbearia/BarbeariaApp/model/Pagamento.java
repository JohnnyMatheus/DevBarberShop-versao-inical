package com.barbearia.BarbeariaApp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codpag;

    private Double valor;

    private LocalDateTime data_hora_pagamento;

    private String forma_pagamento;

    @ManyToOne
    @JoinColumn(name = "clientecodcli")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "agendamentocodagen")
    private Agendamento agendamento;

    // Getters e Setters
    public Long getCodpag() {
        return codpag;
    }

    public void setCodpag(Long codpag) {
        this.codpag = codpag;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData_hora_pagamento() {
        return data_hora_pagamento;
    }

    public void setData_hora_pagamento(LocalDateTime data_hora_pagamento) {
        this.data_hora_pagamento = data_hora_pagamento;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
