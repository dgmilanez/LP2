package ex5;

import java.util.Scanner;
import formas.Circulo;

public class Ex5 {
	public static void main(String[] args) {
		int x,y,raio;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite o x da posição do Círculo: ");
		x = keyboard.nextInt();
		System.out.print("Digite o y da posição do Círculo: ");
		y = keyboard.nextInt();
		System.out.print("Digite o raio do Círculo: ");
		raio = keyboard.nextInt();
		
		Circulo c1 = new Circulo(x,y,raio);
		
		c1.desenhar();
		int c1X = c1.getX();
		int c1Y = c1.getY();
		int c1raio = c1.getRaio();
		
		System.out.printf("C(%d,%d,%d).\n",c1X,c1Y,c1raio);
		
		c1.setX(3);
		c1.setY(2);
		c1.setRaio(100);
		
		c1.desenhar();
		
		keyboard.close();
	}
}
