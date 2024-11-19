package com.barbearia.BarbeariaApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}