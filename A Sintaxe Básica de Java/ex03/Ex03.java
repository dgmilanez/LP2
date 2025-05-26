package ex03;

import java.util.Scanner;

public class Ex03{
	public static void main(String[] args){
		float salario, novoSalario;
		int percentualDoAumento;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite o salário: R$");
		salario = keyboard.nextFloat();
		System.out.print("Digite o percentual de aumento: ");
		percentualDoAumento = keyboard.nextInt();
		
		novoSalario = salario + (salario / 100 * percentualDoAumento);
		
		System.out.printf("Novo Salário: R$%.2f.\n", novoSalario);
		
		keyboard.close();
	}
}