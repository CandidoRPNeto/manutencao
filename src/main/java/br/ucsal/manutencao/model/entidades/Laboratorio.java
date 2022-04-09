package br.ucsal.manutencao.model.entidades;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private static Integer id = 0;
	private String nome;
	private List<Equipamento> equipamento = new ArrayList<>();

	public Laboratorio() {

	}

	public Laboratorio(String id, String nome, List<Equipamento> equipamento) {
		super();
		Laboratorio.id++;
		this.nome = nome;
		this.equipamento = equipamento;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Equipamento> getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(List<Equipamento> equipamento) {
		this.equipamento = equipamento;
	}

}