package br.com.alura.teste;

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
		javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.Adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.Adiciona(new Aula("Modelando com coleções", 24));

		// Criando novos objetos do tipo "Aluno"
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		// Adicionando alunos
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//mostrando cada aluno com "foreach" e lambda
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}

}
