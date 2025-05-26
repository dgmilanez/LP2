package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		int distancia, tempo, qtdGasolinaConsumida;
		float velocidadeMedia, consumoCombustivel; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Qual foi a distância (quilometros) percorrida pelo carro? ");
		distancia = keyboard.nextInt();
		System.out.print("Qual foi o tempo (horas) gasto? ");
		tempo = keyboard.nextInt();
		System.out.print("Qual foi a quantidade (litros) de gasolina consumida? ");
		qtdGasolinaConsumida = keyboard.nextInt();
		
		velocidadeMedia = distancia / tempo;
		consumoCombustivel = distancia / qtdGasolinaConsumida;
		
		System.out.printf("Velocidade Média: %.2f Km/h.\n", velocidadeMedia);
		System.out.printf("Consumo de Combustível: %.2f Km/l.\n", consumoCombustivel);
		
		keyboard.close();
	}
}
