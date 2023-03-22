package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex01_aula05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cor ;
		ArrayList <String> cores = new ArrayList<String>();

			
			for(int c=1;c<6;c++) {//entrada aqui vai ser onde iremos pedir ao usuario que ele coloque as cores que deseja
			System.out.println("Digite a "+c+ " cor: ");
			cor = leia.next();
			cores.add(cor);
			}
			for(int c=1;c<6;c++) { //aqui vai ser onde irei colocar a a lista de cores
				System.out.println("==================");
				System.out.println("Lista de cores");
				System.out.println("==================");
				System.out.println(cores);
				break;
			}
			
			Collections.sort(cores);  //aqui onde peço para que ordene
			System.out.println("\nOrdenar cores");
			for (String cCor : cores) {
	            System.out.println(cCor);
			}
			
			

		leia.close();
	}

}
