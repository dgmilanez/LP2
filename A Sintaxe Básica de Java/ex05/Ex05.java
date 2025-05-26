package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int t, segundos, minutos, horas;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite os segundos: ");
		t = keyboard.nextInt();
		
		horas = t / 3600; // Quociente dos segundos com a hora.
		minutos = (t % 3600) / 60; // Quociente do, resto da razão dos segundos e horas, com os minutos. 
		segundos = (t % 3600) % 60; // Resto do, resto da razão dos segunos e horas, com os minutos.
		 
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		keyboard.close();
	}
}
