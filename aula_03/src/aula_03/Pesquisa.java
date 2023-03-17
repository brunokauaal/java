package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, sexo = 0, genero = 0, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0,gamesTNBF=0;
		char continua = 'S';

		while (continua == 'S') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
			System.out.println("Digite o sexo (1-M/2-F/3-T/4-NB: "); // entrada de dados
			sexo = leia.nextInt();
		
			}while(sexo < 1 || sexo >4 );

			if (sexo == 3 || sexo == 4) {
				System.out.println("Digite o genero com qual se identifica (1-M/2-F): ");
				genero = leia.nextInt();
			}

			sexo = leia.nextInt();
			System.out.println("Digite seu esporte favorito (1-Futebol\2-Volei/3-Basquete/4-Games): ");
			esporte = leia.nextInt();

			contador++; // mostrar  quantas fichas  
			if (sexo == 2 && esporte == 1) // para realizar a estatisca
				futebolFeminino++;

			if (idade >= 18 && esporte == 2)
				maiores18Volei++;
			
			if ((sexo == 3 || sexo == 4) && genero == 2 && esporte == 4)
				gamesTNBF++;
			
			genero = 0;

			System.out.println("Deseja refazer (S/N)? ");
			continua = leia.next().charAt(0); // .charAt pra pegar 1 caractere e ja o next permite mais que um caracter
												// entao tem que refoçar

		}

		System.out.println("Total de fichas prenchidas: " + contador);
		System.out.println("Total de Pessoas do sexo feminino que gostam de futebol: " + futebolFeminino);
		System.out.println("Total de Pessoas maiores de 18 que gostam de volei: " + maiores18Volei);
		System.out.println("Total de Pessoas  Trans e Não binarias que se identifica com genero feminino"+ "Se identificam com o genero feminino"
				+ "e gostam de  Games: "+ gamesTNBF );

	}

}
