package br.ucsal.banco;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.manutencao.model.entidades.*;

public class Equipamentos {
	private static List<Equipamento> equipamentos = new ArrayList<>();
    
    public boolean add(Equipamento equipamento){
		return equipamentos.add(equipamento);
	}

    public List<Equipamento> getTable(){
		return equipamentos;
	}
	
	public Equipamento getDado(int id){
        Equipamento equipamento = new Equipamento();
        for (Equipamento eq : equipamentos){
            equipamento = eq;
        }
		return equipamento;
	}
	
	public boolean remove(int id){
        Equipamento equipamento = new Equipamento();
        for (Equipamento eq : equipamentos){
            equipamento = eq;
        }
		return equipamentos.remove(equipamento);
	}
	
	public void update(int id){
        Equipamento equipamento = new Equipamento();
        int aux = 0;
        for (Equipamento eq : equipamentos){
            equipamento = eq;
            aux++;
        }
		equipamentos.set(aux, equipamento);
	}
}
