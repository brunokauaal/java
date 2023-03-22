package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fprof {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	Set <Integer>numeros=new HashSet<Integer>();

	
	for(int contador= 0; contador < 10 ; contador++) { 
	System.out.println("Digite um numero: ");
		numeros.add(leia.nextInt());
	}
		
	System.out.println("Listar elementos do conjunto");

	
	}

}
