package br.ucsal.banco;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.manutencao.model.entidades.*;

public class Solicitacoes {
	private static List<Solicitacao> solicitacoes = new ArrayList<>();
    
    public boolean add(Solicitacao solicitacao){
		return solicitacoes.add(solicitacao);
	}

    public List<Solicitacao> getTable(){
		return solicitacoes;
	}
	
	public Solicitacao getDado(int id){
        Solicitacao solicitacao = new Solicitacao();
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
        }
		return solicitacao;
	}
	
	public boolean remove(int id){
        Solicitacao solicitacao = new Solicitacao();
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
        }
		return solicitacoes.remove(solicitacao);
	}
	
	public void update(int id){
        Solicitacao solicitacao = new Solicitacao();
        int aux = 0;
        for (Solicitacao sol : solicitacoes){
            solicitacao = sol;
            aux++;
        }
		solicitacoes.set(aux, solicitacao);
	}
}
