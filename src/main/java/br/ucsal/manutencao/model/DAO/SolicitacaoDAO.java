package br.ucsal.manutencao.model.DAO;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.banco.BancoDeDados;
import br.ucsal.manutencao.model.entidades.*;

public class SolicitacaoDAO {
	private static List<Solicitacao> solicitacoes = new ArrayList<>();
    
    public static void conectar(){
		solicitacoes = BancoDeDados.getSolicitacoes();
	}

    public boolean add(Solicitacao solicitacao){
        conectar();
        boolean value = solicitacoes.add(solicitacao);
        BancoDeDados.setSolicitacoes(solicitacoes);
		return value;
	}

    public List<Solicitacao> getTable(){
        conectar();
		return solicitacoes;
	}
	
	public Solicitacao getDado(int id){
        conectar();
        Solicitacao solicitacao = new Solicitacao();
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
        }
		return solicitacao;
	}
	
	public boolean remove(int id){
        conectar();
        Solicitacao solicitacao = new Solicitacao();
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
        }
        boolean value = solicitacoes.remove(solicitacao);
        BancoDeDados.setSolicitacoes(solicitacoes);
		return value;
	}
	
	public void update(int id){
        conectar();
        Solicitacao solicitacao = new Solicitacao();
        int aux = 0;
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
            aux++;
        }
		solicitacoes.set(aux, solicitacao);
        BancoDeDados.setSolicitacoes(solicitacoes);
	}
}
