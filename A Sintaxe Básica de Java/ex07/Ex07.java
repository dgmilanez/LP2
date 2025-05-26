package ex07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int n;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		n = keyboard.nextInt();
		
		System.out.printf("%d é %s!", n, n % 2 == 0 ? "par" : "ímpar");
		
		keyboard.close();
	}
}
