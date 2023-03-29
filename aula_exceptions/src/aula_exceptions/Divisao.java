package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try { //colocar logo onde acontece o erro so no trecho qeu vc sabe que pd dar problema
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);
				loop=false;
			} catch (InputMismatchException e) { // onde eu sei que esta dando erros
				//System.err.println("Exeção: " + e);
				ler.nextLine(); //pra ele ler novamente os valores
				System.out.println("Digite um número inteiro");
			} catch (ArithmeticException e) {
				//System.err.println("Exeção: " + e);
				ler.nextLine();//pra ele ler novamente os valores
				System.out.println("Não existe divisão por zero!");
			}finally {  //é opicional
				System.out.println("Sempre serei executada!");
			}
		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
