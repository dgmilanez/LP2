package ex12;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		int a,b,soma,maior, menor;
		float media;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		a = keyboard.nextInt();
		System.out.print("Digite outro inteiro: ");
		b = keyboard.nextInt();
		
		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}
		
		System.out.printf("Sequência de pares:");
		for (int n = menor; n <= maior; n++) {
			if (n%2 == 0) {
				System.out.printf(" %d",n);
			}
		}
				System.out.printf(".\n");
		
		soma = a + b;
		media = soma / 2f;
		
		System.out.printf("Soma: %d.\n",soma);
		System.out.printf("Média: %.1f.\n",media);
		
		keyboard.close();		
	}
}