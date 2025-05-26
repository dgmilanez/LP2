package ex04;

import java.util.Scanner;

public class Ex04{
	public static void main(String[] args) {
		final float PI = 3.1415f;
		float raio, perimetro, area;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite o raio da circunferênia: ");
		raio = keyboard.nextFloat();
		
		perimetro = 2 * PI * raio;
		area = PI * raio * raio;
		
		System.out.printf("Perimetro: %.2f.\n", perimetro);
		System.out.printf("Area: %.2f².\n", area);
		
		keyboard.close();
	}
}