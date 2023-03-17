package aula_03;

import java.util.Scanner;

public class Ex01_Aula03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;

		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		n2 = leia.nextInt();

		if (n1 > n2) {  //regra se o  segundo numero for maior do que o primeiro invalida
			System.out.println("Intervalo invalido!");
			System.exit(0);;// para sair do programa
		}
		System.out.println("No Intervalo entre "+ n1+  " e "+ n2 +":" );

		for (int r = n1; r <= n2; r++) {
			if (r % 3 == 0 && r % 5 == 0) {   //checagem para ver se os numeros eram multiplicos
				System.out.println(r +  " é múltiplo de 3 e 5."); //aqui vai ser a saida
			}

		}
	}
}
