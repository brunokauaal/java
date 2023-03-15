package aula_01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	float nota1,nota2,nota3,nota4 ;
	
	System.out.println("Digite sua primeira nota: " );
	nota1= leia.nextFloat();
	System.out.println("Digite sua segunda nota: " );
	nota2= leia.nextFloat();
	System.out.println("Digite sua Terceira nota: " );
	nota3= leia.nextFloat();
	System.out.println("Digite sua quarta nota:  " );
	nota4= leia.nextFloat();
	System.out.println("Sua media foi: "+ (nota1+nota2+nota3+nota4)/4);
	}

}
