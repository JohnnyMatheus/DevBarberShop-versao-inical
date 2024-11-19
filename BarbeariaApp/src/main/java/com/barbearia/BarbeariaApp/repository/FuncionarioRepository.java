package com.barbearia.BarbeariaApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarbeariaApp.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}