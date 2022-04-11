package br.ucsal.manutencao.controller;

import br.ucsal.manutencao.model.DAO.LaboratorioDAO;
import br.ucsal.manutencao.model.entidades.Laboratorio;
import br.ucsal.manutencao.model.entidades.Solicitacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LaboratorioController {

    LaboratorioDAO laboratorioDAO = new LaboratorioDAO();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarLaboratorio(@RequestBody Laboratorio postLaboratorio) {
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setNome(postLaboratorio.getNome());
        laboratorio.setEquipamento(postLaboratorio.getEquipamento());
        laboratorioDAO.add(laboratorio);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarLaboratorio(@PathVariable Integer id) {
        laboratorioDAO.remove(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarLaboratorio(@PathVariable Integer id, @RequestBody Laboratorio postLaboratorio) {
        laboratorioDAO.update(postLaboratorio);
    }

    @GetMapping
    public List<Laboratorio> getAll() {
        return laboratorioDAO.getTable();
    }

    @GetMapping("/{id}")
    public Laboratorio getLaboratorio(@PathVariable Integer id ) {
        return laboratorioDAO.getDado(id);
    }

}
