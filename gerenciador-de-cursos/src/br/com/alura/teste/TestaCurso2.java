package br.com.alura.teste;

//Bibliotecas importadas para uso de m�todos na classe
import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe criada para testar
 * 
 * @author Hech
 */

public class TestaCurso2 {

	public static void main(String[] arg) {
		// Criando novo objeto Curso
		Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");

		// Adicionando aulas com o novo m�todo "Adiciona" da classe Curso
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		// Lista "aulasImutaveis" � imut�vel, pelo encapsulamento no retorno
		// do m�todo "getAulas" = "return Collections.unmodifiableList(aulas);"
		// portanto, n�o consegue utilizar o "Collections.sort".
		// Para resolver isso, a list "aulasImutaveis" ser� transformada em uma
		// "ARRAYLIST".
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);

		//Testanto o "getTempoTotal" da Classe Curso
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
