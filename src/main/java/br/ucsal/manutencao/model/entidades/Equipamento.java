package br.ucsal.manutencao.model.entidades;

public class Equipamento {
    private static Integer id = 0;
    private boolean isBroken = false;

    public Equipamento(boolean isBroken) {
        this.isBroken = isBroken;
		Equipamento.id++;
	}

    public Equipamento() {
	}

    public boolean getIsBroken() {
		return isBroken;
	}

    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
	}

	public int getId() {
		return id;
	}
}