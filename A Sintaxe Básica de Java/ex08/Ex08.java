package ex08;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int qtdKWhConsumido;
		float valorKWh, valorAPagar;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Qual foi a quantidade de KWh consumido: ");
		qtdKWhConsumido = keyboard.nextInt();
		System.out.print("Qual o valor do KWh? ");
		valorKWh = keyboard.nextFloat();
		
		valorAPagar = qtdKWhConsumido * valorKWh;
		
		// if (qtdKWhConsumido >= 150)
		// 	valorAPagar *= qtdKWhConsumido * 0,9;
		// }
		
		System.out.printf("O valor (em reais) a ser pago pelo consumo de %d KWh é de R$%.2f.\n",qtdKWhConsumido,(qtdKWhConsumido < 150)?valorAPagar *= 0.9:valorAPagar);
		
		keyboard.close();
	}
}
