package aula_03;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,contador=1 ;

		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		while(contador <= 10){
			System.out.println(numero+" X "+ contador + "=" + (numero * contador));
			contador ++; //pra fazer um incremento
		}
	}

}
