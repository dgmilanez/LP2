package ex13;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		int n;
		float somatorioNotas = 0f;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		n = keyboard.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite a nota do %dº aluno: ",i);
			somatorioNotas += keyboard.nextFloat();
		}
		
		System.out.printf("A média da turma foi de %.2f.\n", somatorioNotas / n);
		
		keyboard.close();
	}
}