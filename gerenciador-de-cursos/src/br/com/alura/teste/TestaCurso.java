package br.com.alura.teste;

//Bibliotecas importadas para uso de m�todos na classe
import br.com.alura.Aula;
import br.com.alura.Curso;
import java.util.Collections;
import java.util.List;

/**
 * Classe criada para testar os cursos e m�todos das cole��es.
 * 
 * @author Hech
 */
public class TestaCurso {

	public static void main(String[] args) {
		// Criando novo objeto Curso
		Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");
/**
		// Criando conte�do da nova lista, "javaColecoes"
		// Adicionando nova aula na Lista "aulas" do tipo
		// Objeto "Aula" que � uma lista com nome "javaColecoes"
		// do Objeto "Curso"
		
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		// C�digo a cima n�o compila devido a mudan�a efetuada na classe
		// "Curso" = return Collections.unmodifiableList(aulas); no m�todo
		// getAulas
*/		
		// Adicionando aulas com o novo m�todo "Adiciona" da classe Curso
		javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.Adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.Adiciona(new Aula("Modelando com cole��es", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();

		// Mesma saida do "System.out.println(aulas);"
		System.out.println(javaColecoes.getAulas());

	}

}
