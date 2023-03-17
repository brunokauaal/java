package aula_03;

import java.util.Scanner;

public class Ex02_Aula03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pares = 0, impares = 0, numero = 0;

		for (int c = 1; c <= 10; c++) { //
			System.out.println("Digite o " + c + " numero: ");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				pares++; // acada variavel par que o usuario digitar ele vai incrementar
			} else {
				impares++;
			}
		}
			System.out.println("Total de numeros pares foi de " + pares);
			System.out.println("Total de numeros impar foi de: "+ impares);
			
		}
	
}
