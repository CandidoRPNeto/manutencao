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
            equipamento = eq;
        }
		return equipamento;
	}
	
	public static boolean remove(int id){
        conectar();
        Equipamento equipamento = new Equipamento();
        for (Equipamento eq : equipamentos){
            equipamento = eq;
        }
        boolean value = equipamentos.remove(equipamento);
        BancoDeDados.setEquipamentos(equipamentos);
		return value;
	}
	
	public static void update(int id){
        conectar();
        Equipamento equipamento = new Equipamento();
        int aux = 0;
        for (Equipamento eq : equipamentos){
            equipamento = eq;
            aux++;
        }
		equipamentos.set(aux, equipamento);
        BancoDeDados.setEquipamentos(equipamentos);
	}
}
