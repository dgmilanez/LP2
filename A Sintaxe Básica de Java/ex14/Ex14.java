package ex14;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int aluno = 0;
		float media, maiorNota = 0f, somatorioNotas = 0f, nota = 0f;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (nota != -1) {
			System.out.printf("Digite a nota do %dº aluno: ",aluno+1);
			nota = keyboard.nextFloat();
			somatorioNotas += nota;
			if (nota > maiorNota) {
				maiorNota = nota;
			}
			aluno++;
		} 
		
		media = somatorioNotas / (aluno - 1);
		
		System.out.printf("Foram cadastrados %d alunos.\n", aluno-1);
		System.out.printf("A média das notas foi %.2f.\n", media);
		System.out.printf("A maior nota foi %.2f.\n", maiorNota);
		
		keyboard.close();
	}
}
