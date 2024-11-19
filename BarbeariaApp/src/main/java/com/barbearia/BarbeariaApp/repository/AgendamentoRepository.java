package com.barbearia.BarbeariaApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}