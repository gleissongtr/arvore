package arvore;

import java.util.ArrayList;
import java.util.List;

public class Unidade {
	private String nome;
	//ManyToOne
	private Unidade unidadePai;
	
	//OneToMany
	private List<Unidade> filhos = new ArrayList<>();
	
	Unidade(String nome, List<Unidade> filhos){
		this.nome = nome;
		this.filhos = filhos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Unidade> getFilhos() {
		return filhos;
	}
	public void setFilhos(List<Unidade> filhos) {
		this.filhos = filhos;
	}
	public Unidade getUnidadePai() {
		return unidadePai;
	}
	public void setUnidadePai(Unidade unidadePai) {
		this.unidadePai = unidadePai;
	}
}
