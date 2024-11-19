package com.barbearia.BarbeariaApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Fornecedor;


public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}