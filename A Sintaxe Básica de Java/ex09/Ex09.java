package ex09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		float x, xDecimal;
		int xInteiro;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		x = keyboard.nextFloat();
		
		xInteiro = (int) x;
		xDecimal = x - (int) x;
		
		if (xDecimal < 0.5f) {
			x = xInteiro;
		} else {
			x = xInteiro + 1;
		}
		
		System.out.printf("O número arredondado é %d", (int) x);
		
		keyboard.close();
	}
}
