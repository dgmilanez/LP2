package organizar;

public class Evento {
	// 1. Atributos:
	private String titulo, data;
	private float orcamento;
	private Convidado[] convidados;
	private int qtdConvidadosConf;
	
	// 2. Métodos
	// 2.1. Construtor:
	public Evento(String titulo, String data) {
		this.titulo = titulo;
		this.data = data;
		this.convidados = new Convidado[100];
	}
	
	// 2.2. Acessos:
	// 2.2.1. Gets:
	public String getCPF() {
		return this.CPF;
	}
	
	// 2.2.2. Adiciona Convidado:
	public boolean adicionarConvidado(Convidado c) {
		if (this.qtdConvidadosConf < this.convidados.length) {
			for (int i = 0; i <= qtdConvidadosConf; i++) {
				if !(this.convidados[i].getCPF().equals(c.getCPF())) {
					this.convidados[quantidade] = c;
					this.orcamento += c.getCache();
					this.qtdConvidadosConf++;
					return true;
				}
			}
		}
		return false;
	}
	
	// 2.3. Remove Convidado:
	public boolean removerConvidado(Stringcpf) {
		if () {
			this.cache -= valor;
			return true;
		}
		return false;
	}
	
	// 2.4. Imprime Lista de Convidado:
	public void imprimir() {
		for (Convidado c)
		System.out.print
	}
}
