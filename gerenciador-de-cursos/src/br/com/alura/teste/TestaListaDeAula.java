package br.com.alura.teste;

//Bibliotecas importadas para uso de métodos na classe
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

/**
 * Classe criada para testar as aulas e métodos das coleções.
 * 
 * @author Hech
 */
public class TestaListaDeAula {

	public static void main(String[] args) {
		// Criação de objetos do tipo "Aula"
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		// Criação da lista de aulas e atribuição de referência das aulas
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		// Recuperando e mostrando no console os elementos da ArrayList aulas
		System.out.println(aulas.get(0).getTitulo()); // Primeiro elemento

		// Todos os elementos com o método toString reescrito na classe Aula
		System.out.println(aulas);

		// Classe COLLECTIONS com o método sort, utilizando o
		// compareTo reescrito na classe Aula
		Collections.sort(aulas); // Organiza as aulas em ordem alfabética
		System.out.println(aulas);

		// Ordenando pelo tempo sem precisar reescrever o método na classe Aula
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

		// Classe Aula possui o método SORT então pode trocar o
		// "Collections.sort" por "aulas.sort"
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

	}

}
