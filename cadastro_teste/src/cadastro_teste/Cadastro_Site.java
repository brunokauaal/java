package cadastro_teste;

import java.util.Scanner;

public class Cadastro_Site {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, opçao;
		String nome;

		System.out.println("Digite seu nome:");
		nome = leia.next();

		System.out.println(nome + " Digite sua idade: ");
		idade = leia.nextInt();

		if (idade < 18) {
			System.out.println("Acesso negado!");
			return;
		} else
			System.out.println("Bem vinde!");

		
		
		System.out.println("\t\t\tOpções");
		System.out.println("=================================================================");
		System.out.println("1\tComo fazer 1 milhão em apenas 1 Mês");
		System.out.println("2\tComo Ser um Bruno spcter");
		System.out.println("3\tDeixe de ser um walker em 1  ano");
		System.out.println("=================================================================");
		System.out.println("Digite o numero do ebook que deseja: ");
		opçao=leia.nextInt();
		
		
		
		
		switch (opçao) {

		case 1:
			System.out.println("Como fazer 1 milhão em apenas 1 Mês");
			break;
		case 2:
			System.out.println("Como Ser um Bruno spcter");
			break;
		case 3:
			System.out.println("Deixe de ser um walker em 1  ano");
			break;
		}
		System.out.println("Obrigado pela compra do ebook!!!" + opçao +"  Volte sempre :D ");
	}

}
