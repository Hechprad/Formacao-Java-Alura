package br.com.alura;

//Bibliotecas importadas para uso de métodos na classe
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Classe Curso para testar relacionamento com outras classes.
 * 
 * @author Hech
 */
public class Curso {

	private String nome; // Nome do curso
	private String instrutor; // Nome do instrutor do curso
	/**
	 * // List<E> é uma interface // Utilizando List nós escondemos, // encapsulamos
	 * quem está dentro da lista // Obs1: LinkedList = é melhor e mais rápida para
	 * inserir ou remover elementos, // demora muito para buscar e acessar um
	 * elemento. // Obs2: ArrayList = é melhor e mais rápida para buscar elementos
	 * em uma lista grande, // demora muito para adicionar ou remover elementos.
	 */
	private List<Aula> aulas = new ArrayList<Aula>(); // Aulas que contém em um curso
	private Set<Aluno> alunos = new HashSet<>(); // Alunos que estão matrículados em um curso
	
	// CTRL+3 (Quick Access) Generate Construtors using Fields
	public Curso(String nome, String instrutor) { // Definição de elementos da classe aula
		this.nome = nome;
		this.instrutor = instrutor;
	}

	// Método "get" para retornar a variável privada "nome" da classe Curso
	public String getNome() {
		return nome;
	}

	// Método "get" para retornar a variável privada "instrutor" da classe Curso
	public String getInstrutor() {
		return instrutor;
	}

	// O uso de lista transforma o retorno em algo mais genérico, protegido
	public List<Aula> getAulas() {
		// Programação defenciva, bloqueia o acesso e modificação
		// que não seja um método direto da classe "Curso"
		// devolve uma cópia ou algo imutável
		return Collections.unmodifiableList(aulas);
	}

	// Método da classe "Curso" para adicionar uma aula
	public void Adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// Método da classe "Curso" para remover uma aula
	public void Remova(Aula aula) {
		this.aulas.remove(aula);
	}

	// Método da classe "Curso" para somar todo o tempo de duração das aulas
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		// método antigo, abaixo o método a partir do JAVA 8
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		// Pega todos os elementos da lista "aulas" com o método getTempo, soma e
		// retorna o total de tempo
	}

	// Reescrita do método "toString" para uma saída adequada e adaptada
	// ao nosso programa
	@Override
	public String toString() {
		// Retorna o nome do curso, o tempo total e chama o "toString" do 
		// objeto tipo aula "this.aulas" que é reescrito e apresenta o nome de
		// cada aula e sua duração.
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + 
				" minutos: " + this.aulas + "]";
	}

	// Adiciona um novo aluno à variável "Set<Aluno> alunos"
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	// Envia um "Set" unmodifiable, que não pode ser modificado.
	// Programação defenciva, valores encapsulados.
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
}
