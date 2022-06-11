package br.com.coup;

public class Influencia {

	private int tipo;
	private String descricao;

	public Influencia(int tipo, String descricao) {
		super();
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Influencia [descricao=" + descricao + "]";
	}

}