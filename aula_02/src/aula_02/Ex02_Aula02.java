package aula_02;

import java.util.Scanner;

public class Ex02_Aula02 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	
	System.out.println("Digite um numero: ");
	numero= leia.nextInt();

	
	if (numero %2 == 0) {
	System.out.println("O Numero "+ numero + " é par!");	
	}else  System.out.println("O Numero é impar "+ numero );
	if (numero>=0) {
	System.out.println("O Numero "+ numero + " é positivo!" );
	}else System.out.println("O numero é " + numero+ " negativo!");
	
	}

}
