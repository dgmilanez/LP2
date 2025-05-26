package ex15;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		char caracter;
		int vogal, digito, outro;
		vogal = digito = outro = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.print("Digite um caracter: ");
			caracter = (keyboard.next()).charAt(0);
			switch(caracter){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': 	vogal++;
							break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9': 	digito++;
							break;
				default: 	outro++;
							break;
			}
		} while (caracter != '.');
		
		System.out.printf("Vogais: %d.\n", vogal);
		System.out.printf("Digitos: %d.\n", digito);
		System.out.printf("Outros: %d.\n", outro);
		
		keyboard.close();
	}
}