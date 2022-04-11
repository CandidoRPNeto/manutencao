package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class EquipamentoDAO {
	private static List<Equipamento> equipamentos = new ArrayList<>();

    public static void conectar(){
		equipamentos = BancoDeDados.getEquipamentos();
	}

    public static boolean add(Equipamento equipamento){
        conectar();
        boolean value = equipamentos.add(equipamento);
        BancoDeDados.setEquipamentos(equipamentos);
		return value;
	}

    public static List<Equipamento> getTable(){
        conectar();
		return equipamentos;
	}
	
	public static Equipamento getDado(int id){
        conectar();
        Equipamento equipamento = new Equipamento();
        for (Equipamento eq : equipamentos){
            if (eq.getId() == id){
                equipamento = eq;
                break;
            }
        }
		return equipamento;
	}
	
	public static boolean remove(int id){
        conectar();
        boolean value = false;
        for (Equipamento eq : equipamentos){
            if (eq.getId() == id){
                value = equipamentos.remove(eq);
                BancoDeDados.setEquipamentos(equipamentos);
                break;
            } 
        }
		return value;
	}
	
	public static void update(Equipamento equipamento){
        conectar();
        int aux = 0;
        for (Equipamento eq : equipamentos){
            if (equipamento.getId() == eq.getId())
                break;
            aux++;
        }
		equipamentos.set(aux, equipamento);
        BancoDeDados.setEquipamentos(equipamentos);
	}
}
