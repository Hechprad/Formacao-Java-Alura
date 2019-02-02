package br.com.alura;

/**
 * Classe aula para testar o uso das Collections utilizando as classes.
 * 
 * @author Hech
 */
public class Aula implements Comparable<Aula> {

	private String titulo; // Nome da aula
	private int tempo; // Tempo em mínutos da aula

	// CTRL+3 (Quick Access) Generate Construtors using Fields
	public Aula(String titulo, int tempo) { // Definição de elementos da classe aula
		this.titulo = titulo;
		this.tempo = tempo;
	}

	// Método "get" para retornar a variável privada "titulo" da classe Aula
	public String getTitulo() {
		return titulo;
	}

	// Método "get" para retornar a variável privada "tempo" da classe Aula
	public int getTempo() {
		return tempo;
	}

	// Reescrita do método toString para mostrar uma saída
	// favorável no retorno de conteúdo de uma lista do tipo aula
	@Override
	public String toString() {
		return "\nNome aula: " + this.titulo + ". Duração: " + this.tempo + " minutos";
	}

	// Método reescrito da classe implementada COMPARABLE
	// Define as regras para comparar o conteúdo do objeto aula
	@Override
	public int compareTo(Aula outraAula) {
		// Título como base de comparação e ordenação
		return this.titulo.compareTo(outraAula.getTitulo());
	}

}
