package organizar;

public class Convidado {
	// 1. Atributos:
	private String nome, CPF;
	private float cache;
	private Evento[] eventos;
	private int qtdEventosConf;
	
	// 2. Métodos:
	// 2.1. Construtor:
	Public Convidado(String nome, String CPF, float cache) {
		this.nome = nome;
		this.CPF = CPF;
		this.cache = cache;
		this.eventos = new Evento[10];
	}
	
	// 2.2. Acessos:
	// 2.2.1. Gets:
	public String getCPF() {
		return this.CPF;
	}
	
	public String getCache() {
		return this.cache;
	}
	
	// 2.2.2. Adiciona Evento:
	public boolean adicionarEvento(Evento e) {
		if (qtdEventosConf < eventos.length()) {
			for (int i = 0; i <= qtdEventosConf; i++) {
				if (this.eventos[i].getData().equals(e.getData())) {
					this.eventos[qtdEventosConf] = e;
					this.qtdEventosConf++;
					return true;
				}
			}
		}
		return false;
	}
}
