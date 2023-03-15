package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#,##,##0.00"); 
	Scanner leia = new Scanner (System.in);   
	float salario, abono;
	String nome;
	
	System.out.println("Digite seu nome: ");
	nome = leia.nextLine();
	System.out.println("Digite seu Salario: ");
	salario= leia.nextFloat();
	System.out.println("Digite seu Abono:  ");
	abono= leia .nextFloat();
	System.out.println("Novo Salario: " + df.format(salario + abono));
	}

}
