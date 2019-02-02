package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

/**
 * Classe para testar a busca de alunos
 * 
 * @author Hech
 */
public class TestaBuscaAlunosNoCurso {

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
		
		// Criando e testando a busca de aluno pela matrícula
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
	}

}