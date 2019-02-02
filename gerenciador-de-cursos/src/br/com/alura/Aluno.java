package br.com.alura;

/**
 * Classe Aula para testar m�todos e relacionamentos
 * 
 * @author Hech
 */

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// Construtor com par�metros para evitar a cria��o de
	// objetos vazios
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	// Reescrita do m�todo toString para uma visualiza��o personalizada
	// de acordo com a necessidade
	@Override
	public String toString() {
		return "[Nome do Aluno: " + this.nome + ", matr�cula: " + this.numeroMatricula + "]";
	}
}
