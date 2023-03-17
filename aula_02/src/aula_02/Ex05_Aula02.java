package aula_02;

import java.util.Scanner;

public class Ex05_Aula02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float cq = 10, xsalada = 15, xbacon = 18, bauru = 12, refrigerante = 8, suco = 13;
		int opcao, quantidade;

		System.out.println("Produtos \t\t Preço");
		System.out.println("1\t Cachorro quemte\t\t 10,00");
		System.out.println("2\t Xsalada  \t\t 15,00");
		System.out.println("3\t Xbacon \t\t 18,00");
		System.out.println("4\t Bauru  \t\t 12,00");
		System.out.println("5\t Refrigerante \t\t  8,00");
		System.out.println("6\t Suco   \t\t 13,00 ");
		System.out.println("=======================================");
		System.out.println("Digite a opção: ");
		opcao = leia.nextInt();
		System.out.println("Digite quantidade: ");
		quantidade = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Valor total= " + (quantidade * cq));
			break;
		case 2:
			System.out.println("Valor total= " + (quantidade *xsalada));
			break;
		case 3:
			System.out.println("Valor total= " + (quantidade * xbacon));
			break;
		case 4:
			System.out.println("Valor total= " + (quantidade * bauru));
			break;
		case 5:
			System.out.println("Valor total= " + (quantidade * refrigerante));
			break;
		case 6:
			System.out.println("Valor total= " + (quantidade * suco));
			break;
		}

	}

}
