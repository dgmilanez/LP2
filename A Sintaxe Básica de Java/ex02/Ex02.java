package ex02;

import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){
		float varA, varB, sum, dif, prd, quo;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite um decimal: ");
		varA = keyboard.nextFloat();
		System.out.printf("Digite outro decimal: ");
		varB = keyboard.nextFloat();
		
		sum = varA + varB;
		dif = varA - varB;
		prd = varA * varB;
		quo = varA / varB;
		
		System.out.printf("Soma: %.2f.\n", sum);
		System.out.printf("Diferença: %.2f.\n", dif);
		System.out.printf("Produto: %.2f.\n", prd);
		System.out.printf("Quociente: %.2f.\n", quo);
		
		keyboard.close();
	}
}