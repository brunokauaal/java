package aula_02;

import java.util.Scanner;

public class Ex01_Aula02 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int a,b,c;
	int soma;
	
	
	System.out.println("Digite um numero A: ");
	a = leia.nextInt();
	System.out.println("Digite um numero B: ");
	b = leia .nextInt();
	System.out.println("Digite um numero C: ");
	c = leia .nextInt();
	soma= a+b;
	if ( soma > c) {
	System.out.println(" A SOMA DE A + B É MAIOR DO QUE C");
	}else if (soma < c ) {
	System.out.println("A SOMA DE A + B É MENOR QUE C");
	}else if (soma == c)						//nunca mais colocar ; em condiçao a nao ser haja 2 ações
	System.out.println("A soma de A + B e IGUAL A C");    
	
	
	
	
	}

}
