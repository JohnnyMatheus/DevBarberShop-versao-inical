package com.barbearia.BarbeariaApp.controller;

import com.barbearia.BarbeariaApp.model.Fornecedor;
import com.barbearia.BarbeariaApp.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    // Listar todos os fornecedores
    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    // Adicionar novo fornecedor
    @PostMapping
    public Fornecedor adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    // Atualizar fornecedor existente
    @PutMapping("/{id}")
    public Fornecedor atualizarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        fornecedor.setCodforn(id);
        return fornecedorRepository.save(fornecedor);
    }

    // Deletar fornecedor
    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id) {
        fornecedorRepository.deleteById(id);
    }
}