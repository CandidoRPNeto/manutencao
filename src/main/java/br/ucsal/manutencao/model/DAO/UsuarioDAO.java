package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class UsuarioDAO {
	private static List<Usuario> usuarios = new ArrayList<>();

    public static void conectar(){
		usuarios = BancoDeDados.getUsuarios();
	}

    public boolean add(Usuario usuario){
        conectar();
        boolean value = usuarios.add(usuario);
        BancoDeDados.setUsuarios(usuarios);
		return value;
	}

    public List<Usuario> getTable(){
        conectar();
		return usuarios;
	}
	
	public Usuario getDado(int id){
        conectar();
        Usuario usuario = new Usuario();
        for (Usuario use : usuarios){
            usuario = use;
        }
		return usuario;
	}
	
	public boolean remove(int id){
        conectar();
        Usuario usuario = new Usuario();
        for (Usuario use : usuarios){
            usuario = use;
        }
        boolean value = usuarios.remove(usuario);
        BancoDeDados.setUsuarios(usuarios);
		return value;
	}
	
	public void update(int id){
        conectar();
        Usuario usuario = new Usuario();
        int aux = 0;
        for (Usuario use : usuarios){
            usuario = use;
            aux++;
        }
		usuarios.set(aux, usuario);
        BancoDeDados.setUsuarios(usuarios);
	}
}
