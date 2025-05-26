package ex1;

import java.util.Scanner;
import formas.Retangulo;

public class Ex1 {
	public static void main(String[] args) {
		int x,y,largura,altura;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite o x da posição do retângulo: ");
		x = keyboard.nextInt();
		System.out.print("Digite o y da posição do retângulo: ");
		y = keyboard.nextInt();
		System.out.print("Digite a largura do retângulo: ");
		largura = keyboard.nextInt();
		System.out.print("Digite a altura do retângulo: ");
		altura = keyboard.nextInt();
		
		Retangulo r1 = new Retangulo(x,y,largura,altura);
		
		r1.desenhar();
		r1.mover(10,50);
		r1.desenhar();
		r1.redimencionar(50, 50);
		r1.desenhar();
		
		keyboard.close();
	}
}
