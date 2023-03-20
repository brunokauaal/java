package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 4, 5, 7, 6, 10, 1, 3, 2, 9, 8 };
		int numero;
		float[] vetorFloat = new float[5];

		System.out.println("Digite um numero: ");
		numero = leia.nextInt();

		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			if (vetorInteiros[contador] == numero)
				System.out.println("Posição [" + contador + "] =" + vetorInteiros[contador]);
		}

		for (int contador = 0; contador < vetorFloat.length; contador++) {
			System.out.println("Digite uma valor para a posição[" + contador + "]: ");
			vetorFloat[contador] = leia.nextFloat();
		}
		for (float vfloat : vetorFloat) {      //nao fica bonitinho mais diminui
			System.out.println(vfloat);
		}
		
		Arrays.sort(vetorInteiros);
		for (int vInt : vetorInteiros) {      
			System.out.println(vInt);
		}
		
	}

}
