package ex6;

import utilidades.Sequencia;

public class Ex6 {
	public static void main(String[] args){
				
		Sequencia seq1 = new Sequencia(2,6);
		seq1.imprimir();
		Sequencia seq2 = new Sequencia(2,10);
		seq2.imprimir(2);
		Sequencia seq3 = new Sequencia(0,15);
		seq3.imprimir(3);
		Sequencia seq4 = new Sequencia(0,10);
		seq4.imprimir(4);
	}
}