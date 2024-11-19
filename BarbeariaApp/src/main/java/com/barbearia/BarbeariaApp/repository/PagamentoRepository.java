package com.barbearia.BarbeariaApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}