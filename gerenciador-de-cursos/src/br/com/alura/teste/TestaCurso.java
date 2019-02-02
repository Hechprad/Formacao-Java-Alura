package br.com.alura.teste;

//Bibliotecas importadas para uso de métodos na classe
import br.com.alura.Aula;
import br.com.alura.Curso;
import java.util.Collections;
import java.util.List;

/**
 * Classe criada para testar os cursos e métodos das coleções.
 * 
 * @author Hech
 */
public class TestaCurso {

	public static void main(String[] args) {
		// Criando novo objeto Curso
		Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");
/**
		// Criando conteúdo da nova lista, "javaColecoes"
		// Adicionando nova aula na Lista "aulas" do tipo
		// Objeto "Aula" que é uma lista com nome "javaColecoes"
		// do Objeto "Curso"
		
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		// Código a cima não compila devido a mudança efetuada na classe
		// "Curso" = return Collections.unmodifiableList(aulas); no método
		// getAulas
*/		
		// Adicionando aulas com o novo método "Adiciona" da classe Curso
		javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.Adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.Adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();

		// Mesma saida do "System.out.println(aulas);"
		System.out.println(javaColecoes.getAulas());

	}

}
