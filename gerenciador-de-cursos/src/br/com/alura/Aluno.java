package br.com.alura;

/**
 * Classe Aula para testar métodos e relacionamentos
 * 
 * @author Hech
 */

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// Construtor com parâmetros para evitar a criação de
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

	// Reescrita do método toString para uma visualização personalizada
	// de acordo com a necessidade
	@Override
	public String toString() {
		return "[Nome do Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
	}
}
