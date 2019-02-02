package br.com.alura.teste;

//Bibliotecas importadas para uso de métodos na classe
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Classe criada para testar os alunos e métodos das coleções, utilizando SET e
 * HashSet (interface irmã de LIST e filha de COLLECTIONS). VANTAGENS: - SETs
 * garantem que só exista um único elemento igual no conjunto - Velocidade de
 * uso desta coleção.
 * 
 * @author Hech
 */
public class TestaAlunos {

	public static void main(String[] args) {
		/** Utilizando SET, "irmã" de LIST para a criação de alunos
		 * Set<String> alunos = new HashSet<>(); 
		 * HashSet implementa o SET que é filha do Collection
		 * Então podemos declarar de maneira mais genérica:
		 */
		Collection<String> alunos = new HashSet<>();
		
		// adicionando nome de novos alunos
		alunos.add("Rodrigo Turino");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza"); // sétimo elemento, repetido *NÃO ENTRA NO SET*

		// verificando o tamanho do SET após sete elementos adicionados
		System.out.println(alunos.size());
		System.out.println("--------------------");

		// Realizando uma busca no SET
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		System.out.println("--------------------");

		// Removendo um elemento do SET
		alunos.remove("Sergio Lopes");

		/** ----> método "contains" e "remove" são muito mais rápidos quando
		 * vc utiliza "SETs", pq ele utiliza o "HASHSET" (em pt: tabela de espalhamento "hash")
		 */

		// Observe a saída fora de ordem do sysout:
		System.out.println(alunos);
		// Em conjuntos (SETs) você não tem garantia de ordenação na saída
		System.out.println("--------------------");

		// imprimindo cada aluno do SET (conjunto) com FOREACH
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("--------------------");

		// possui método .foreach
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		// Se quiser pegar o segundo elemento ou quinto, algum elemente com posição fixa,
		// Transforme o "Set" / "HashSet" em uma "LIST"
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista.get(3)); // método "get" funcionando. 

	}

}
