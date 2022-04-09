package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class SolicitanteDAO {
	private static List<Solicitante> solicitantes = new ArrayList<>();

    public static void conectar(){
		solicitantes = BancoDeDados.getSolicitantes();
	}

    public boolean add(Solicitante usuario){
        conectar();
        boolean value = solicitantes.add(usuario);
        BancoDeDados.setSolicitantes(solicitantes);
		return value;
	}

    public List<Solicitante> getTable(){
        conectar();
		return solicitantes;
	}
	
	public Solicitante getDado(int id){
        conectar();
        Solicitante usuario = new Solicitante();
        for (Solicitante use : solicitantes){
            usuario = use;
        }
		return usuario;
	}
	
	public boolean remove(int id){
        conectar();
        Solicitante usuario = new Solicitante();
        for (Solicitante use : solicitantes){
            usuario = use;
        }
        boolean value = solicitantes.remove(usuario);
        BancoDeDados.setSolicitantes(solicitantes);
		return value;
	}
	
	public void update(int id){
        conectar();
        Solicitante usuario = new Solicitante();
        int aux = 0;
        for (Solicitante use : solicitantes){
            usuario = use;
            aux++;
        }
		solicitantes.set(aux, usuario);
        BancoDeDados.setSolicitantes(solicitantes);
	}
}
