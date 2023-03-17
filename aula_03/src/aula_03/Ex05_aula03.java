package aula_03;

import java.util.Scanner;

public class Ex05_aula03 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int numero= 0, soma= 0 ;
	
	do {
	System.out.println("Digite um numero: ");
	numero=leia.nextInt();
	if (soma  > 0)
		soma += numero; //operador de atribuição
	
	}while(numero != 0);
	
	System.out.println("Soma dos numeros positivos: " + soma);
	
		 
	}

}
