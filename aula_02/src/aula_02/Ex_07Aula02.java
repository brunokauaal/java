package aula_02;

import java.util.Scanner;

public class Ex_07Aula02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		float numero1, numero2; // float numeros infinitos

		System.out.println("Codigo");
		System.out.println("1\tSoma");
		System.out.println("2\tSubtração");
		System.out.println("3\tMultiplicaçao");
		System.out.println("4\tDivisão");
		System.out.println("Digite o codigo da operação.");
		codigo= leia.nextInt();
		System.out.println("Digite um numero: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();

		switch (codigo) {
		case 1:
		System.out.println("A soma é: " + (numero1+numero2));
			break;

		case 2:
			System.out.println("A Subtração é: " + (numero1-numero2) );
			break;

		case 3:
			System.out.println("A Multiplicação é: " + (numero1*numero2));
			break;

		case 4:
			System.out.println("A Divisão é: " + (numero1 / numero2));
			break;
		}

	}

}
