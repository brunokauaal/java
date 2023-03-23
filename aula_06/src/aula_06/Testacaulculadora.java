package aula_06;

import java.util.Scanner;

import aula_06.calculos.calculos;

public class Testacaulculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		double numero1, numero2;
		calculos calc = new calculos(); // instanciar classe criada e importar

		// menu

		while (true) {
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Multiplicação");
			System.out.println("4-Divisão");

			System.out.println("1-Qual operação voce deseja efetuar: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				sobre();
				leia.close(); 
				System.exit(0); // simplesmente encerra o programa encerra tudo por isso leia.close ta ali
			}

			// dados
			System.out.println("Digite o  1 numero: ");
			numero1 = leia.nextDouble();

			System.out.println("Digite o  2 numero: ");
			numero2 = leia.nextDouble();

			switch (opcao) {
			case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
			case 2 -> System.out.println("Subtração: " + calc.subtração(numero1, numero2));
			case 3 -> System.out.println("Multiplicação: " + calc.Multiplicação(numero1, numero2));
			case 4 -> System.out.println("Divisão: " + calc.Divisão(numero1, numero2));
			default -> System.out.println("Opção invalida!");

			}

		}

	}

	public static void sobre() {// como e void ele so vai retorna a mnsg sem nenhuma valor isso é um metodo
		System.out.println("Calculadora com Métodos");
		System.out.println("Bruno Kauã");
	}
}
