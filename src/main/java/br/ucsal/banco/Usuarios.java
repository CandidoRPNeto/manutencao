package br.ucsal.banco;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.manutencao.model.entidades.*;

public class Usuarios {
	private static List<Usuario> usuarios = new ArrayList<>();

    public boolean add(Usuario usuario){
		return usuarios.add(usuario);
	}

    public List<Usuario> getTable(){
		return usuarios;
	}
	
	public Usuario getDado(int id){
        Usuario usuario = new Usuario();
        for (Usuario use : usuarios){
            usuario = use;
        }
		return usuario;
	}
	
	public boolean remove(int id){
        Usuario usuario = new Usuario();
        for (Usuario use : usuarios){
            usuario = use;
        }
		return usuarios.remove(usuario);
	}
	
	public void update(int id){
        Usuario usuario = new Usuario();
        int aux = 0;
        for (Usuario use : usuarios){
            usuario = use;
            aux++;
        }
		usuarios.set(aux, usuario);
	}
}
