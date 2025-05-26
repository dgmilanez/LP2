package ex11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		String op;
		float a,b,resultado = 0f;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite um operador matemático (+, -, *, /): ");
		op = keyboard.next();
		System.out.print("Digite um número real: ");
		a = keyboard.nextFloat();
		System.out.print("Digite outro número real: ");
		b = keyboard.nextFloat();
		
		switch(op){
			case "+": resultado = a + b;
			break;
			case "-": resultado = a - b;
			break;
			case "*": resultado = a * b;
			break;
			case "/": resultado = a / b;
			break;
		}
		
		System.out.printf("%.2f %s %.2f = %.2f",a,op,b,resultado);
		
		keyboard.close();
	}		
}
