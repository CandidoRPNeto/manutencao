package br.ucsal.manutencao.controller;

import br.ucsal.manutencao.model.DAO.SolicitacaoDAO;
import br.ucsal.manutencao.model.entidades.Solicitacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class SolicitacaoController {

    private static SolicitacaoDAO solicitacaoDAO =  new SolicitacaoDAO();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarSolicitacao(@RequestBody Solicitacao postSolicitacao) {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setNomeSolicitante(postSolicitacao.getNomeSolicitante());
        solicitacao.setReclamacao(postSolicitacao.getReclamacao());
        solicitacaoDAO.add(solicitacao);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarSolicitacao(@PathVariable Integer id) {
        solicitacaoDAO.remove(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarSolicitacao(@PathVariable Integer id, @RequestBody Solicitacao postSolicitacao) {
        solicitacaoDAO.update(postSolicitacao);
    }

    @GetMapping
    public List<Solicitacao> getAll() {
        return solicitacaoDAO.getTable();
    }

    @GetMapping("/{id}")
    public Solicitacao getSolicitacao(@PathVariable Integer id ) {
       return solicitacaoDAO.getDado(id);
    }

}
