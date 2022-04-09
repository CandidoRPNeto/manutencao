package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class LaboratorioDAO {
	private static List<Laboratorio> laboratorios = new ArrayList<>();

    public static void conectar(){
		laboratorios = BancoDeDados.getLaboratorios();
	}
    
    public boolean add(Laboratorio laboratorio){
        conectar();
        boolean value = laboratorios.add(laboratorio);
        BancoDeDados.setLaboratorios(laboratorios);
		return value;
	}
    
    public List<Laboratorio> getTable(){
        conectar();
		return laboratorios;
	}
	
	public Laboratorio getDado(int id){
        conectar();
        Laboratorio laboratorio = new Laboratorio();
        for (Laboratorio eq : laboratorios){
            if (eq.getId() == id){
                laboratorio = eq;
                break;
            }
        }
		return laboratorio;
	}
	
	public boolean remove(int id){
        conectar();
        boolean value = false;
        for (Laboratorio eq : laboratorios){
            if (eq.getId() == id){
                value = laboratorios.remove(eq);
                BancoDeDados.setLaboratorios(laboratorios);
                break;
            }
        }
		return value;
	}
	
	public void update(Laboratorio laboratorio){
        conectar();
        int aux = 0;
        for (Laboratorio lab : laboratorios){
            if (laboratorio.getId() == lab.getId())
                break;
            aux++;
        }
		laboratorios.set(aux, laboratorio);
        BancoDeDados.setLaboratorios(laboratorios);
	}
}
