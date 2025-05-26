package utilidades;

public class Sequencia {
	// 1. Atributos:
	private int inicio,fim,p;
	
	// 2. Métodos:
	// 2.1.1. Construtor:
	public Sequencia(int inicio, int fim, int p) {
		this.inicio = inicio;
		this.fim = fim;
		this.p = p;
	}
	
	// 2.1.2. Construtor (usando o p padrão):
	public Sequencia(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	
	// 2.2.1. Imprimir:
	public void imprimir() {
		if (inicio < fim) {
			System.out.printf("Sequência de %d a %d:",inicio,fim);
			for (int i = inicio; i <= fim;) {
				System.out.printf(" %d",i);
				i++;
			}
			System.out.print(".\n");
		}
	}
	
	// 2.2.2. Imprimir (especificando o intervalo p):
	public void imprimir(int p) {
		if (inicio < fim && p > 0) {
			System.out.printf("Sequência de %d a %d com p=%d:",inicio,fim,p);
			for (int i = inicio; i <= fim;) {
				System.out.printf(" %d",i);
				i += p;
			}
			System.out.print(".\n");
		}
	}
}