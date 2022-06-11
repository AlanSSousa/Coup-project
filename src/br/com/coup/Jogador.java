package br.com.coup;

import java.util.ArrayList;

public class Jogador {

	private String nome = "Jogador";
	private int moedas = 2;
	private ArrayList<Influencia> influencias = new ArrayList<>();
	private ArrayList<Acoes> acoes = new ArrayList<>();
	private ArrayList<Acoes> reacoes = new ArrayList<>();

	public Jogador() {
		super();
	}

	public Jogador(String nome, int moedas, ArrayList<Influencia> influencias, ArrayList<Acoes> acoes,
			ArrayList<Acoes> reacoes) {
		super();
		this.nome = nome;
		this.moedas = moedas;
		this.influencias = influencias;
		this.acoes = acoes;
		this.reacoes = reacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMoedas() {
		return moedas;
	}

	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}

	public ArrayList<Influencia> getInfluencias() {
		return influencias;
	}

	public void setInfluencias(ArrayList<Influencia> influencias) {
		this.influencias = influencias;
	}

	public ArrayList<Acoes> getAcoes() {
		return acoes;
	}

	public void setAcoes(ArrayList<Acoes> acoes) {
		this.acoes = acoes;
	}

	public ArrayList<Acoes> getReacoes() {
		return reacoes;
	}

	public void setReacoes(ArrayList<Acoes> reacoes) {
		this.reacoes = reacoes;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", moedas=" + moedas + ", influencias=" + influencias + ", acoes=" + acoes
				+ ", reacoes=" + reacoes + "]";
	}

	public void preencheAcoes(int modo) {
		acoes.add(new Acoes(1, "Renda", false));
		acoes.add(new Acoes(2, "Ajuda externa", true));
		acoes.add(new Acoes(3, "Golpe de estado", true));
		acoes.add(new Acoes(4, "Roubar", true));
		acoes.add(new Acoes(5, "Assassinar", true));
		acoes.add(new Acoes(6, "Pegar 3 moedas", true));

		if (modo == 1) {
			acoes.add(new Acoes(7, "Trocar", true));
		} else {
			acoes.add(new Acoes(7, "Trocar", true));
			acoes.add(new Acoes(8, "Visualizar carta", true));
		}
	}

	public void preencheReacoes() {
		reacoes.add(new Acoes(1, "Contestar", true));
		reacoes.add(new Acoes(2, "Bloquear", true));
		reacoes.add(new Acoes(3, "Passar", false));
	}
}