package arvore;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Unidade unidadePrincipal = criarArvore();
		
		//PERCORRENDO ARVORE
		imprimirUnidade(unidadePrincipal,"-");

	}

	public static void imprimirUnidade(Unidade unidade, String tracos) {
		System.out.println(tracos + unidade.getNome());
		for (Unidade unidadeFilha : unidade.getFilhos()) {
			imprimirUnidade(unidadeFilha,tracos+"-");
		}
	}
	
	private static Unidade criarArvore() {
		return new Unidade(
				"CD.UT", Arrays.asList(
						new Unidade("1", Arrays.asList(
								new Unidade("1.1", Arrays.asList(
										new Unidade("1.1.1", new ArrayList<>()),
										new Unidade("1.1.2", Arrays.asList(
												new Unidade("1.1.2.1", new ArrayList<>()),
												new Unidade("1.1.2.2", new ArrayList<>()),
												new Unidade("1.1.2.3", new ArrayList<>()))),
										new Unidade("1.1.3", new ArrayList<>()))))),
						new Unidade("2", Arrays.asList(
								new Unidade("2.1", Arrays.asList(
										new Unidade("2.2.1", new ArrayList<>()),
										new Unidade("2.2.2", new ArrayList<>()),
										new Unidade("2.2.3", new ArrayList<>()))),
								new Unidade("2.2", new ArrayList<>()),
								new Unidade("2.3", new ArrayList<>()))),
						new Unidade("3", new ArrayList<>())
						));
	}

}
