package com.barbearia.BarbeariaApp.controller;

import com.barbearia.BarbeariaApp.model.HistoricoServico;
import com.barbearia.BarbeariaApp.repository.HistoricoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/historico-servicos")
public class HistoricoServicoController {

    @Autowired
    private HistoricoServicoRepository historicoServicoRepository;

    private static final Logger logger = Logger.getLogger(HistoricoServicoController.class.getName());

    /**
     * Lista todos os históricos de serviço.
     *
     * @return Lista de históricos.
     */
    @GetMapping
    public ResponseEntity<List<HistoricoServico>> listarHistorico() {
        try {
            List<HistoricoServico> historicos = historicoServicoRepository.findAll();
            logger.info("Listando todos os históricos. Total: " + historicos.size());
            return ResponseEntity.ok(historicos);
        } catch (Exception e) {
            logger.severe("Erro ao listar históricos: " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Retorna um histórico específico pelo ID.
     *
     * @param id ID do histórico.
     * @return Histórico encontrado ou mensagem de erro.
     */
    @GetMapping("/{id}")
    public ResponseEntity<HistoricoServico> obterHistorico(@PathVariable Long id) {
        try {
            Optional<HistoricoServico> historico = historicoServicoRepository.findById(id);
            if (historico.isPresent()) {
                logger.info("Histórico encontrado: " + historico.get());
                return ResponseEntity.ok(historico.get());
            } else {
                logger.warning("Histórico com ID " + id + " não encontrado.");
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            logger.severe("Erro ao obter histórico com ID " + id + ": " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Salva ou atualiza um histórico de serviço.
     *
     * @param historicoServico Dados do histórico.
     * @return Histórico salvo ou mensagem de erro.
     */
    @PostMapping
    public ResponseEntity<HistoricoServico> salvarHistorico(@RequestBody HistoricoServico historicoServico) {
        try {
            if (historicoServico.getDataHora() == null || 
                historicoServico.getServico() == null || 
                historicoServico.getCliente() == null || 
                historicoServico.getFuncionario() == null) {
                logger.warning("Dados obrigatórios estão faltando.");
                return ResponseEntity.badRequest().body(null);
            }

            // Log detalhado para debug
            logger.info("Recebendo dados para salvar: " + historicoServico);

            HistoricoServico salvo = historicoServicoRepository.save(historicoServico);
            logger.info("Histórico salvo com sucesso: " + salvo.getCodhistorico());
            return ResponseEntity.ok(salvo);
        } catch (Exception e) {
            logger.severe("Erro ao salvar histórico: " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    /**
     * Remove um histórico de serviço pelo ID.
     *
     * @param id ID do histórico.
     * @return Mensagem de sucesso ou erro.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarHistorico(@PathVariable Long id) {
        try {
            if (historicoServicoRepository.existsById(id)) {
                historicoServicoRepository.deleteById(id);
                logger.info("Histórico com ID " + id + " deletado com sucesso.");
                return ResponseEntity.noContent().build();
            } else {
                logger.warning("Histórico com ID " + id + " não encontrado para exclusão.");
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            logger.severe("Erro ao deletar histórico com ID " + id + ": " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
