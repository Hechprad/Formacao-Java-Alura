package br.com.alura.teste;

//Bibliotecas importadas para uso de m�todos na classe
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Classe criada para testar os alunos e m�todos das cole��es, utilizando SET e
 * HashSet (interface irm� de LIST e filha de COLLECTIONS). VANTAGENS: - SETs
 * garantem que s� exista um �nico elemento igual no conjunto - Velocidade de
 * uso desta cole��o.
 * 
 * @author Hech
 */
public class TestaAlunos {

	public static void main(String[] args) {
		/** Utilizando SET, "irm�" de LIST para a cria��o de alunos
		 * Set<String> alunos = new HashSet<>(); 
		 * HashSet implementa o SET que � filha do Collection
		 * Ent�o podemos declarar de maneira mais gen�rica:
		 */
		Collection<String> alunos = new HashSet<>();
		
		// adicionando nome de novos alunos
		alunos.add("Rodrigo Turino");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza"); // s�timo elemento, repetido *N�O ENTRA NO SET*

		// verificando o tamanho do SET ap�s sete elementos adicionados
		System.out.println(alunos.size());
		System.out.println("--------------------");

		// Realizando uma busca no SET
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		System.out.println("--------------------");

		// Removendo um elemento do SET
		alunos.remove("Sergio Lopes");

		/** ----> m�todo "contains" e "remove" s�o muito mais r�pidos quando
		 * vc utiliza "SETs", pq ele utiliza o "HASHSET" (em pt: tabela de espalhamento "hash")
		 */

		// Observe a sa�da fora de ordem do sysout:
		System.out.println(alunos);
		// Em conjuntos (SETs) voc� n�o tem garantia de ordena��o na sa�da
		System.out.println("--------------------");

		// imprimindo cada aluno do SET (conjunto) com FOREACH
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("--------------------");

		// possui m�todo .foreach
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		// Se quiser pegar o segundo elemento ou quinto, algum elemente com posi��o fixa,
		// Transforme o "Set" / "HashSet" em uma "LIST"
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista.get(3)); // m�todo "get" funcionando. 

	}

}
