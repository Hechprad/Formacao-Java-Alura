package br.com.alura.teste;

import java.util.Iterator;
import java.util.Set;
import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

/**
 * Classe para testar alunos com a CLASSE "Aluno"
 * 
 * @author Hech
 */

public class TestaCursoComAluno {

	public static void main(String[] args) {
		// Criando novo objeto "Curso"
		Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");

		// Adicionando aulas com o novo método "Adiciona" da classe "Curso"
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		// Criando novos objetos do tipo "Aluno"
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		// Adicionando alunos
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("-----Mostrando alunos com foreach e lambda-----");
		//mostrando cada aluno com "foreach" e lambda
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		// Entendendo "iterators"
		System.out.println("-----Iterators-----");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		/**
		 * Iterator possui dois métodos mais utilizados:
		 * iterator.hasNext(); // Tem próximo?
		 * iterator.next(); // Devolve o próximo
		 */
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
		System.out.println("-----Verificando matrícula-----");
		// Verificando se um aluno está matriculado
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("-----Testando 'equals()' e 'hashCode' reescritos-----");
		//testando "equals()" reescrito com o "hashCode() também reescrito"
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E este Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("o a1 é == ao Turini?");
		System.out.println(a1.equals(turini));
		
		/**
		 * If two objects are equals, their hashCode must be equal.
		 * If a1 = turini, necessarily:
		 */
		System.out.println(a1.hashCode() == turini.hashCode()); // true
	}

}
