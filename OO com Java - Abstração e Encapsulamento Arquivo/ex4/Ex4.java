package ex4;

import java.util.Scanner;
import formas.Retangulo;

public class Ex4 {
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
		int r1X = r1.getX();
		int r1Y = r1.getY();
		int r1Largura = r1.getLargura();
		int r1Altura = r1.getAltura();
		
		System.out.printf("R(%d,%d,%d,%d).\n",r1X,r1Y,r1Largura,r1Altura);
		
		r1.setX(3);
		r1.setY(2);
		r1.setLargura(100);
		r1.setAltura(53);
		
		r1.desenhar();
		
		keyboard.close();
	}
}
