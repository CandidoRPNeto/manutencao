package br.ucsal.manutencao.model.entidades;

public abstract class Usuario {

	private String email;

	private String senha;

    private static Integer id = 0;

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
		Usuario.id++;
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