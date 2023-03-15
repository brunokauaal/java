package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#,##,##0.00");
	Scanner leia = new Scanner (System.in);
	float n1,n2,n3,n4;
	
	
	System.out.println("Digite o primeiro numero: ");
	n1=leia .nextFloat();
	System.out.println("Digite o segundo numero: ");
	n2=leia .nextFloat();
	System.out.println("Digite o terceiro numero: ");
	n3=leia .nextFloat();
	System.out.println("Digite o quarto numero: ");
	n4=leia .nextFloat();
	
	System.out.println("A diferença dos numeros são: " + df.format((n1 * n2) - (n3 * n4)));

	}

}
