package br.com.coup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
	
	public static void main(String Args[]) {
		ArrayList<Jogador> jogadores = new ArrayList<>();
		int quantidadeJogadores = 1;
		int modo = 1;
		ArrayList<Influencia> influencias = preencheInfluencias(modo);
		
		for (int iterator = 1; iterator == quantidadeJogadores; iterator++) {
			Jogador jogador = iniciaJogador(1,"Alan");
			
			pegaInfluencias(influencias,jogador);
			
			jogadores.add(jogador);	
		}
		
		System.out.println(jogadores.get(0).toString());
	}
	
	public static Jogador iniciaJogador(int modo, String nome) {
		Jogador jogador = new Jogador();
		jogador.setNome(nome);
		jogador.preencheAcoes(modo);
		jogador.preencheReacoes();
		return jogador;
	}
	
	public static ArrayList<Influencia> preencheInfluencias(int modo) {
		ArrayList<Influencia> influencias = new ArrayList<>();
		influencias.add(new Influencia(1, "Capitão"));
		influencias.add(new Influencia(2, "Capitão"));
		influencias.add(new Influencia(3, "Capitão"));
		influencias.add(new Influencia(4, "Condessa"));
		influencias.add(new Influencia(5, "Condessa"));
		influencias.add(new Influencia(6, "Condessa"));
		influencias.add(new Influencia(7, "Duque"));
		influencias.add(new Influencia(8, "Duque"));
		influencias.add(new Influencia(9, "Duque"));
		influencias.add(new Influencia(10, "Assassino"));
		influencias.add(new Influencia(11, "Assassino"));
		influencias.add(new Influencia(12, "Assassino"));

		if (modo == 1) {
			influencias.add(new Influencia(13, "Embaixador"));
			influencias.add(new Influencia(14, "Embaixador"));
			influencias.add(new Influencia(15, "Embaixador"));
		} else {
			influencias.add(new Influencia(13, "Inquisidor"));
			influencias.add(new Influencia(14, "Inquisidor"));
			influencias.add(new Influencia(15, "Inquisidor"));
		}
		
		return influencias;
	}
	
	public static void pegaInfluencias(ArrayList<Influencia> influencias, Jogador jogador) {
		ArrayList<Influencia> duasinfluencias = new ArrayList<>();
		Random gerador = new Random();

		while (duasinfluencias.size() != 2) {
			int influ = gerador.nextInt(15) + 1;	
			
			for (Iterator iterator = influencias.iterator(); iterator.hasNext();) {
				Influencia influencia = (Influencia) iterator.next();
				if (influencia.getTipo() == influ) {
					duasinfluencias.add(influencia);
					break;
				}
			}
		}
	
		jogador.setInfluencias(duasinfluencias);
	}
}