package br.ucsal.manutencao.controller;

import br.ucsal.manutencao.model.DAO.SolicitacaoDAO;
import br.ucsal.manutencao.model.entidades.Solicitacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class SolicitacaoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarSolicitacao(@RequestBody Solicitacao PostSolicitacao) {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setNomeSolicitante(PostSolicitacao.getNomeSolicitante());
        solicitacao.setReclamacao(PostSolicitacao.getReclamacao());
        // Setar em Array
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarSolicitacao(@PathVariable Integer id) {
        // Buscar no Array
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarSolicitacao(@PathVariable Integer id, @RequestBody Solicitacao PostSolicitacao) {
        // Updatar no array
    }

    @GetMapping
    public ArrayList<Solicitacao> getAll() {
        // Retornar array com todas as solicitações
        ArrayList<Solicitacao> placeholder = new ArrayList<>();
        return placeholder;
    }

    @GetMapping("/{nomeSolicitante}")
    public Solicitacao getSolicitacao(@PathVariable String nomeSolicitante ) {
        // Retornar solicitacao por nome
        Solicitacao placeholder = new Solicitacao();
        return placeholder;
    }

}
