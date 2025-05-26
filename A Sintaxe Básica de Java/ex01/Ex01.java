package ex01;

import java.util.Scanner;

public class Ex01{
	public static void main(String[] args){
		int varA, varB, sum, dif, prd, quo;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		varA = keyboard.nextInt();
		System.out.print("Digite outro inteiro: ");
		varB = keyboard.nextInt();
		
		sum = varA + varB;
		dif = varA - varB;
		prd = varA * varB;
		quo = varA / varB;
		
		System.out.printf("Soma: %d.\n",sum);
		System.out.printf("Diferença: %d.\n",dif);
		System.out.printf("Produto: %d.\n",prd);
		System.out.printf("Quociente: %d.\n",quo);
		
		keyboard.close();
	}
}