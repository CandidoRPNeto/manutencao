package br.ucsal.manutencao.controller;

import br.ucsal.manutencao.model.DAO.EquipamentoDAO;
import br.ucsal.manutencao.model.entidades.Equipamento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EquipamentoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarEquipamento(@RequestBody Equipamento PostEquipamento) {
        Equipamento equipamento = new Equipamento();
        equipamento.setIsBroken(PostEquipamento.getIsBroken());
        EquipamentoDAO.add(equipamento);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarEquipamento(@PathVariable Integer id) {
        EquipamentoDAO.remove(id);
    }

    @PutMapping("/{Equipamento}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarSolicitacao(@RequestBody Equipamento PostEquipamento) {
        EquipamentoDAO.update(PostEquipamento);
    }

    @GetMapping
    public List<Equipamento> getAll() {
        return EquipamentoDAO.getTable();
    }

    @GetMapping("/{id}")
    public Equipamento getEquipamento(@PathVariable Integer id) {
        return EquipamentoDAO.getDado(id);
    }

}