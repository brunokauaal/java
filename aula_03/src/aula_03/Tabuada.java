package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
	int numero;
	
	
	System.out.println("Mostre a Tabuada do numero: ");
	numero= leia.nextInt();
	
	System.out.println("Tabuada completa");
	for (int contador = 1 ; contador<= 10; contador ++)     //valor inicial|Condiçao de parada|incremento
	System.out.println(numero+" X "+ contador + "=" + (numero * contador));
	System.out.println("Tabuada dos pares");
	for (int contador = 1 ; contador<= 10; contador ++) {  
		if(contador %2==0 )//valor inicial|Condiçao de parada|incremento
		System.out.println(numero+" X "+ contador + "=" + (numero * contador));
	}

	}

}
