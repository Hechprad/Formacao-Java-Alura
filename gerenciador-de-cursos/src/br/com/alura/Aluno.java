package br.com.alura;

/**
 * Class "Aula" to test methods and relationships
 * 
 * @author Hech
 */

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// Constructor with parameters to avoid creation of void objects
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	/**
	 * Overriding the method "equals()" to compare two "alunos" by name. Every time
	 * that we override "equals()", we need to override "hashCode()" method too, this
	 * method will "put together" the objects according to the parameters.
	 */
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome == outro.nome;
	}

	/**
	 * Overriding the method "hashCode()" to use hashCode() from "String" class.
	 */
	@Override
	public int hashCode() {
		/**
		 * Sorting the objects according to the first letter. 
		 * return this.nome.charAt(0); 
		 * -------------------- 
		 * To do a better job, we will use the "hashCode()" from "String" class.
		 */
		return this.nome.hashCode();
	}

	/**
	 * Overriding the method "toString()" to receive a personal visualization
	 * according to the necessity
	 */
	@Override
	public String toString() {
		return "[Nome do Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
	}
}
