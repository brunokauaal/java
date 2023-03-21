package aula_04;

import java.util.Scanner;

public class ex04_aula04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float[][] matrizNotas = new float[10][4];
		float[] vetorMedias = new float[10];
		float soma = 0, media = 0;

		// Entrada de dados
		for (int i = 0; i < matrizNotas.length; i++) {
			System.out.println("Aluno " + (i + 1));

			for (int j = 0; j < matrizNotas[i].length; j++) { // Nome e condição da variável fixa
				System.out.println("Digite a nota do " + (j + 1) + "º Semestre: ");
				matrizNotas[i][j] = leia.nextFloat();
			}
		}
		
		// Calcular media
		for (int i = 0; i < matrizNotas.length; i++) {
			// resetar variaveis
			soma = 0;
			media = 0;

			for (int j = 0; j < matrizNotas[i].length; j++) { // Nome e condição da variável fixa
				soma += matrizNotas[i][j];
			}
			
			media = soma / 4; // Calcula media
			vetorMedias[i] = media; // Adicionada a média calculada à matriz vetorMedias
		}
		
		System.out.println("\nMedias: ");
		for (int i = 0; i < vetorMedias.length; i++) { //Nome e condição da variável fixa
			System.out.println("Aluno " + (i + 1) + ": " + vetorMedias[i]); // Imprimiu as médias
		}
	}
}
