package com.barbearia.BarbeariaApp.controller;

import com.barbearia.BarbeariaApp.model.Servico;
import com.barbearia.BarbeariaApp.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    @PostMapping
    public Servico adicionarServico(@RequestBody Servico servico) {
        return servicoRepository.save(servico);
    }

    @PutMapping("/{id}")
    public Servico atualizarServico(@PathVariable Long id, @RequestBody Servico servico) {
        servico.setCodserv(id);
        return servicoRepository.save(servico);
    }

    @DeleteMapping("/{id}")
    public void deletarServico(@PathVariable Long id) {
        servicoRepository.deleteById(id);
    }
}