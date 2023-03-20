package aula_04;

import java.util.Scanner;

public class ex01_aula4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetoresInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10 };
		int numero;
		boolean encontrado = false;

		System.out.println("Digite o numero do que voce deseja encontrar: ");
		numero = leia.nextInt();

		for (int c = 0; c < vetoresInteiros.length; c++) {
			if (vetoresInteiros[c] == numero) {  //verifica se o numero digitado é true
				System.out.println("O número " + numero + " está localizado na posição: " + c);
				encontrado = true;
				break; // podemos parar de verificar quando encontramos o número
			}
		}

		if (!encontrado) {
			System.out.println("Numero "+ numero + " não encontrado");
		}

	}

}
