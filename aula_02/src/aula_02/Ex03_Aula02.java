package aula_02;

import java.util.Scanner;

public class Ex03_Aula02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean sangue = false;
		char doacao;

		System.out.println("Digite nome: ");
		nome = leia.next();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação: ");
		leia.skip("\\R?");
		doacao = leia.nextLine().charAt(0);

		if (doacao == 's')
			sangue = true;

		if (idade >= 60 && idade <= 69) {
			if (sangue)
				System.out.println("Não Apto");
			else
				System.out.println("Apto");
		} else if (idade < 18 || idade > 69)
			System.out.println("Não Apto");
		else
			System.out.println("Apto");

	}

}