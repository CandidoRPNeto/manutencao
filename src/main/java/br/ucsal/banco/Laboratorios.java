package br.ucsal.banco;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.manutencao.model.entidades.*;

public class Laboratorios {
	private static List<Laboratorio> laboratorios = new ArrayList<>();
    
    public boolean add(Laboratorio laboratorio){
		return laboratorios.add(laboratorio);
	}
    
    public List<Laboratorio> getTable(){
		return laboratorios;
	}
	
	public Laboratorio getDado(int id){
        Laboratorio laboratorio = new Laboratorio();
        for (Laboratorio eq : laboratorios){
            laboratorio = eq;
        }
		return laboratorio;
	}
	
	public boolean remove(int id){
        Laboratorio laboratorio = new Laboratorio();
        for (Laboratorio eq : laboratorios){
            laboratorio = eq;
        }
		return laboratorios.remove(laboratorio);
	}
	
	public void update(int id){
        Laboratorio laboratorio = new Laboratorio();
        int aux = 0;
        for (Laboratorio lab : laboratorios){
            laboratorio = lab;
            aux++;
        }
		laboratorios.set(aux, laboratorio);
	}
}
