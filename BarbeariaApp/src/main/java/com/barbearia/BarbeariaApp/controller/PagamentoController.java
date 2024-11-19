package com.barbearia.BarbeariaApp.controller;

import com.barbearia.BarbeariaApp.model.Pagamento;
import com.barbearia.BarbeariaApp.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamento adicionarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @PutMapping("/{id}")
    public Pagamento atualizarPagamento(@PathVariable Long id, @RequestBody Pagamento pagamento) {
        pagamento.setCodpag(id);
        return pagamentoRepository.save(pagamento);
    }

    @DeleteMapping("/{id}")
    public void deletarPagamento(@PathVariable Long id) {
        pagamentoRepository.deleteById(id);
    }
}