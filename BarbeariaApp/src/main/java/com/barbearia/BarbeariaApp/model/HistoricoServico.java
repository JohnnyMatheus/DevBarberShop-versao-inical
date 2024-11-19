package com.barbearia.BarbeariaApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_servico")
public class HistoricoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codhistorico;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "servicocodserv", nullable = false)
    private Servico servico;

    @ManyToOne
    @JoinColumn(name = "clientecodcli", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "funcionariocodfun", nullable = false)
    private Funcionario funcionario;

    // Getters e Setters
    
    public Long getCodhistorico() {
		return codhistorico;
	}

	public void setCodhistorico(Long codhistorico) {
		this.codhistorico = codhistorico;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
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
