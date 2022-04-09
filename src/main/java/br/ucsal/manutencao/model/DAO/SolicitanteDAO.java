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
            if (use.getId() == id){
                usuario = use;
                break;
            }
        }
		return usuario;
	}
	
	public boolean remove(int id){
        conectar();
        boolean value = false;
        for (Solicitante use : solicitantes){
            if (use.getId() == id){
                value = solicitantes.remove(use);
                BancoDeDados.setSolicitantes(solicitantes);
                break;
            }
        }
		return value;
	}
	
	public void update(Solicitante usuario){
        conectar();
        int aux = 0;
        for (Solicitante use : solicitantes){
            if (usuario.getId() == use.getId())
                break;
            aux++;
        }
		solicitantes.set(aux, usuario);
        BancoDeDados.setSolicitantes(solicitantes);
	}
}
