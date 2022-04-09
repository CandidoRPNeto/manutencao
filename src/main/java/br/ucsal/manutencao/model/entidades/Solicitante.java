package br.ucsal.manutencao.model.entidades;

public class Solicitante extends Usuario{

	int semestre;
	
	public Solicitante(String email, String senha, int id) {
		super(email, senha, id);
		
	}
    public Solicitante() {
	}
	
	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
}
