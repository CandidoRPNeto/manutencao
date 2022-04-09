package br.ucsal.manutencao.model.entidades;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
	private String id;
	private String nome;
	private List<Equipamento> equipamento = new ArrayList<>();

	public Laboratorio() {

	}

	public Laboratorio(String id, String nome, List<Equipamento> equipamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.equipamento = equipamento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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