package com.barbearia.BarbeariaApp.controller;

import com.barbearia.BarbeariaApp.model.Agendamento;
import com.barbearia.BarbeariaApp.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    // Listar todos os agendamentos
    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    // Obter um agendamento por ID
    @GetMapping("/{id}")
    public Optional<Agendamento> obterAgendamento(@PathVariable Long id) {
        return agendamentoRepository.findById(id);
    }

    // Criar um novo agendamento
    @PostMapping
    public Agendamento salvarAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    // Atualizar um agendamento existente
    @PutMapping("/{id}")
    public Agendamento atualizarAgendamento(@PathVariable Long id, @RequestBody Agendamento agendamento) {
        agendamento.setCodagen(id); // Define o ID para garantir a atualização
        return agendamentoRepository.save(agendamento);
    }

    // Deletar um agendamento por ID
    @DeleteMapping("/{id}")
    public void deletarAgendamento(@PathVariable Long id) {
        agendamentoRepository.deleteById(id);
    }
}
