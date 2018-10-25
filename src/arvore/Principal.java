package arvore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Unidade> unidades = new ArrayList<>();
		
		//CRIANDO ARVORE
		unidades.add(
				new Unidade("1", Arrays.asList(
						new Unidade(" 1.1", Arrays.asList(
								new Unidade("  1.1.1", new ArrayList<>()),
								new Unidade("  1.1.2", new ArrayList<>()),
								new Unidade("  1.1.3", new ArrayList<>()))))));
		
		unidades.add(
				new Unidade("2", Arrays.asList(
						new Unidade(" 2.1", Arrays.asList(
								new Unidade("  2.2.1", new ArrayList<>()),
								new Unidade("  2.2.2", new ArrayList<>()),
								new Unidade("  2.2.3", new ArrayList<>()))),
						new Unidade(" 2.2", new ArrayList<>()),
						new Unidade(" 2.3", new ArrayList<>()))));
		
		//PERCORRENDO ARVORE
		for (Unidade unidade : unidades) {
			imprimirUnidade(unidade);
		}

	}

	public static void imprimirUnidade(Unidade unidade) {
		System.out.println(unidade.nome);
		for (Unidade unidadeFilha : unidade.filhos) {
			imprimirUnidade(unidadeFilha);
		}
	}

}
