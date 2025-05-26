package ex10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args){
		int n, inferior, superior;
		String posicao;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um inteiro: ");
		n = keyboard.nextInt();
		System.out.println("Digite um inteiro inferior: ");
		inferior = keyboard.nextInt();
		System.out.println("Digite um inteiro superior: ");
		superior = keyboard.nextInt();
		
		if (n < inferior) {
			posicao = "antes";
		} else if (n >= inferior && n < superior) {
			posicao = "dentro";
		} else {
			posicao = "depois";
		}
		System.out.printf("%d está %s do intervalo.",n,posicao);
		
		keyboard.close();
	}
}
