package br.com.alura.teste;

/**
 * Trabalhando e observando funcionalidades com:
 * ArrayList<> e java.util
 * @author Hech
 */
// Bibliotecas importadas para uso de métodos na classe
import java.util.ArrayList;
import java.util.Collections;

// usar o DOC do java.util = https://docs.oracle.com/javase/8/docs/api/
public class TestandoListas {

	public static void main(String[] args) {

		// Variáveis do tipo String
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Criando ArrayList e adicionando variáveis
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// "sysout"
		System.out.println(aulas);

		// Removendo o primeiro elemento(posição 0) de um ArrayList
		aulas.remove(0);

		System.out.println(aulas);

		// "FOREACH" - Para cada String aula, dentro de aulas
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// Pegando um elemento específico
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		// Acessando um elemento por vez com "FOR" e formatando a saída de dados
		for (int i = 0; i < aulas.size(); i++) {
			int n = i + 1;
			System.out.println("Aula número " + n + ": " + aulas.get(i));
		}

		// "Método FOREACH" - Realiza uma ação para cada elemento
		// dentro dessa coleção/lista com LAMBDA
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});

		// Ordenando a lista (Ordem alfabética)
		aulas.add("Aumentando nosso conhecimento"); // adicionando uma aula
		System.out.println(aulas); // variável "aulas" no console antes da ordenação
		Collections.sort(aulas); // método sort para ordenar
		
		// Mostrando a saída após ordenar
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);

	}
}
