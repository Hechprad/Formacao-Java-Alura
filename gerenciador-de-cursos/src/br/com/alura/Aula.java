package br.com.alura;

/**
 * Classe aula para testar o uso das Collections utilizando as classes.
 * 
 * @author Hech
 */
public class Aula implements Comparable<Aula> {

	private String titulo; // Nome da aula
	private int tempo; // Tempo em m�nutos da aula

	// CTRL+3 (Quick Access) Generate Construtors using Fields
	public Aula(String titulo, int tempo) { // Defini��o de elementos da classe aula
		this.titulo = titulo;
		this.tempo = tempo;
	}

	// M�todo "get" para retornar a vari�vel privada "titulo" da classe Aula
	public String getTitulo() {
		return titulo;
	}

	// M�todo "get" para retornar a vari�vel privada "tempo" da classe Aula
	public int getTempo() {
		return tempo;
	}

	// Reescrita do m�todo toString para mostrar uma sa�da
	// favor�vel no retorno de conte�do de uma lista do tipo aula
	@Override
	public String toString() {
		return "\nNome aula: " + this.titulo + ". Dura��o: " + this.tempo + " minutos";
	}

	// M�todo reescrito da classe implementada COMPARABLE
	// Define as regras para comparar o conte�do do objeto aula
	@Override
	public int compareTo(Aula outraAula) {
		// T�tulo como base de compara��o e ordena��o
		return this.titulo.compareTo(outraAula.getTitulo());
	}

}
