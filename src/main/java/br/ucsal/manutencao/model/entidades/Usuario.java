package br.ucsal.manutencao.model.entidades;

public abstract class Usuario {

	private String email;

	private String senha;

	private int id;

	public Usuario(String email, String senha, int id) {
		super();
		this.email = email;
		this.senha = senha;
		this.id = id;
	}

    public Usuario() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
}