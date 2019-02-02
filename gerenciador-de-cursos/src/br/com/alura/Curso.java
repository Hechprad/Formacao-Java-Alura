package br.com.alura;

//Bibliotecas importadas para uso de m�todos na classe
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
	 * // List<E> � uma interface // Utilizando List n�s escondemos, // encapsulamos
	 * quem est� dentro da lista // Obs1: LinkedList = � melhor e mais r�pida para
	 * inserir ou remover elementos, // demora muito para buscar e acessar um
	 * elemento. // Obs2: ArrayList = � melhor e mais r�pida para buscar elementos
	 * em uma lista grande, // demora muito para adicionar ou remover elementos.
	 */
	private List<Aula> aulas = new ArrayList<Aula>(); // Aulas que cont�m em um curso
	private Set<Aluno> alunos = new HashSet<>(); // Alunos que est�o matr�culados em um curso
	
	// CTRL+3 (Quick Access) Generate Construtors using Fields
	public Curso(String nome, String instrutor) { // Defini��o de elementos da classe aula
		this.nome = nome;
		this.instrutor = instrutor;
	}

	// M�todo "get" para retornar a vari�vel privada "nome" da classe Curso
	public String getNome() {
		return nome;
	}

	// M�todo "get" para retornar a vari�vel privada "instrutor" da classe Curso
	public String getInstrutor() {
		return instrutor;
	}

	// O uso de lista transforma o retorno em algo mais gen�rico, protegido
	public List<Aula> getAulas() {
		// Programa��o defenciva, bloqueia o acesso e modifica��o
		// que n�o seja um m�todo direto da classe "Curso"
		// devolve uma c�pia ou algo imut�vel
		return Collections.unmodifiableList(aulas);
	}

	// M�todo da classe "Curso" para adicionar uma aula
	public void Adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// M�todo da classe "Curso" para remover uma aula
	public void Remova(Aula aula) {
		this.aulas.remove(aula);
	}

	// M�todo da classe "Curso" para somar todo o tempo de dura��o das aulas
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		// m�todo antigo, abaixo o m�todo a partir do JAVA 8
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		// Pega todos os elementos da lista "aulas" com o m�todo getTempo, soma e
		// retorna o total de tempo
	}

	// Reescrita do m�todo "toString" para uma sa�da adequada e adaptada
	// ao nosso programa
	@Override
	public String toString() {
		// Retorna o nome do curso, o tempo total e chama o "toString" do 
		// objeto tipo aula "this.aulas" que � reescrito e apresenta o nome de
		// cada aula e sua dura��o.
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + 
				" minutos: " + this.aulas + "]";
	}

	// Adiciona um novo aluno � vari�vel "Set<Aluno> alunos"
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	// Envia um "Set" unmodifiable, que n�o pode ser modificado.
	// Programa��o defenciva, valores encapsulados.
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
}
