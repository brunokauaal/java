package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#,##,##0.00"); 	
	Scanner leia = new Scanner (System.in); 
	float sb,adn,hrex,ds ;
	
	System.out.println("Digite o salario bruto: ");
	sb= leia.nextFloat();

	System.out.println("Digite o Adicional noturno: ");
	adn= leia.nextFloat();
	
	System.out.println("Digite as horas extras: ");
	hrex= leia.nextFloat();
	
	System.out.println("Digite o desconto: ");
	ds = leia.nextFloat();
	
	System.out.println("Seu salario liquido é: " + df.format(sb + adn + (hrex * 5) - ds));

	}

}
