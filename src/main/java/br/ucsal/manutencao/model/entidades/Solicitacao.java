package br.ucsal.manutencao.model.entidades;


public class Solicitacao {
    private static Integer id;
    private String nomeSolicitante;
    private String reclamacao;

    public Solicitacao() {
        this.id = id++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }
}
