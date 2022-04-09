package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class GestorDAO {
	private static List<Gestor> gestores = new ArrayList<>();

    public static void conectar(){
		gestores = BancoDeDados.getGestores();
	}

    public boolean add(Gestor usuario){
        conectar();
        boolean value = gestores.add(usuario);
        BancoDeDados.setGestores(gestores);
		return value;
	}

    public List<Gestor> getTable(){
        conectar();
		return gestores;
	}
	
	public Gestor getDado(int id){
        conectar();
        Gestor usuario = new Gestor();
        for (Gestor use : gestores){
            usuario = use;
        }
		return usuario;
	}
	
	public boolean remove(int id){
        conectar();
        Gestor usuario = new Gestor();
        for (Gestor use : gestores){
            usuario = use;
        }
        boolean value = gestores.remove(usuario);
        BancoDeDados.setGestores(gestores);
		return value;
	}
	
	public void update(int id){
        conectar();
        Gestor usuario = new Gestor();
        int aux = 0;
        for (Gestor use : gestores){
            usuario = use;
            aux++;
        }
		gestores.set(aux, usuario);
        BancoDeDados.setGestores(gestores);
	}
}
