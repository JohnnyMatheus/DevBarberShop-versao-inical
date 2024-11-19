package com.barbearia.BarbeariaApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.barbearia.BarbeariaApp.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
