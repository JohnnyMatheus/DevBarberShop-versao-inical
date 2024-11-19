package com.barbearia.BarbeariaApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}