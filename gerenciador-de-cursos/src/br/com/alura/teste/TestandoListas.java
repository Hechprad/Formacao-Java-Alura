package br.com.alura.teste;

/**
 * Trabalhando e observando funcionalidades com:
 * ArrayList<> e java.util
 * @author Hech
 */
// Bibliotecas importadas para uso de m�todos na classe
import java.util.ArrayList;
import java.util.Collections;

// usar o DOC do java.util = https://docs.oracle.com/javase/8/docs/api/
public class TestandoListas {

	public static void main(String[] args) {

		// Vari�veis do tipo String
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Criando ArrayList e adicionando vari�veis
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// "sysout"
		System.out.println(aulas);

		// Removendo o primeiro elemento(posi��o 0) de um ArrayList
		aulas.remove(0);

		System.out.println(aulas);

		// "FOREACH" - Para cada String aula, dentro de aulas
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// Pegando um elemento espec�fico
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: " + primeiraAula);

		// Acessando um elemento por vez com "FOR" e formatando a sa�da de dados
		for (int i = 0; i < aulas.size(); i++) {
			int n = i + 1;
			System.out.println("Aula n�mero " + n + ": " + aulas.get(i));
		}

		// "M�todo FOREACH" - Realiza uma a��o para cada elemento
		// dentro dessa cole��o/lista com LAMBDA
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});

		// Ordenando a lista (Ordem alfab�tica)
		aulas.add("Aumentando nosso conhecimento"); // adicionando uma aula
		System.out.println(aulas); // vari�vel "aulas" no console antes da ordena��o
		Collections.sort(aulas); // m�todo sort para ordenar
		
		// Mostrando a sa�da ap�s ordenar
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);

	}
}
