package com.barbearia.BarbeariaApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.HistoricoServico;

public interface HistoricoServicoRepository extends JpaRepository<HistoricoServico, Long> {
}