package br.ucsal.manutencao.controller;

import br.ucsal.manutencao.model.DAO.SolicitanteDAO;
import br.ucsal.manutencao.model.entidades.Solicitacao;
import br.ucsal.manutencao.model.entidades.Solicitante;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UsuarioController {

    SolicitanteDAO solicitanteDAO = new SolicitanteDAO();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarSolicitante(@RequestBody Solicitante postSolicitante) {
       Solicitante solicitante =  new Solicitante();
       solicitante.setEmail(postSolicitante.getEmail());
       solicitante.setSenha(postSolicitante.getSenha());
       solicitante.setSemestre(postSolicitante.getSemestre());
       solicitanteDAO.add(solicitante);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Solicitante login(@RequestBody String email,  String senha) {
        List<Solicitante> listaSolicitantes = solicitanteDAO.getTable();
        for(Solicitante solicitante : listaSolicitantes) {
            if (solicitante.getEmail().equals(email) && solicitante.getSenha().equals(senha)) {
                return solicitante;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarSolicitante(@PathVariable Integer id) {
        solicitanteDAO.remove(id);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarSolicitante(@PathVariable Integer id, @RequestBody Solicitante postSolicitante) {
        solicitanteDAO.update(postSolicitante);
    }

    public List<Solicitante> getAll() {
        return solicitanteDAO.getTable();
    }

    @GetMapping("/{id}")
    public Solicitante getSolicitante(@PathVariable Integer id ) {
        return solicitanteDAO.getDado(id);
    }


}
