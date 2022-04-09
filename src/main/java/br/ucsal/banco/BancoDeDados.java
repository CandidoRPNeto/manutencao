package br.ucsal.banco;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.manutencao.model.entidades.*;

public class BancoDeDados {
	private static List<Equipamento> equipamentos = new ArrayList<>();
	private static List<Laboratorio> laboratorios = new ArrayList<>();
	private static List<Solicitacao> solicitacoes = new ArrayList<>();
	private static List<Gestor> gestores = new ArrayList<>();
	private static List<Solicitante> solicitantes = new ArrayList<>();

    public static List<Equipamento> getEquipamentos(){
        return equipamentos;
    }
    public static List<Gestor> getGestores(){
        return gestores;
    }
    public static List<Solicitante> getSolicitantes(){
        return solicitantes;
    }
    public static List<Laboratorio> getLaboratorios(){
        return laboratorios;
    }
    public static List<Solicitacao> getSolicitacoes(){
        return solicitacoes;
    }

    public static void setEquipamentos(List<Equipamento> lista){
        equipamentos = lista;
    }
    public static void setGestores(List<Gestor> lista){
        gestores = lista;
    }
    public static void setSolicitantes(List<Solicitante> lista){
        solicitantes = lista;
    }
    public static void setLaboratorios(List<Laboratorio> lista){
        laboratorios = lista;
    }
    public static void setSolicitacoes(List<Solicitacao> lista){
        solicitacoes = lista;
    }
}
