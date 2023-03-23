package aula_04;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
	Scanner leia =new Scanner (System.in);
	float [][]  matriz=new float [2][4];
	float [] media =new float [2] ;//criamos um vetor para   armazenar as medias
	float soma=0;
		for(int linha=0 ; linha < matriz.length; linha++) {
			for(int coluna=0 ; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Digite a %d nota  do %d participante: ",coluna+1,linha+1);
				matriz[linha][coluna] = leia.nextFloat();
				soma += matriz[linha][coluna]; //conforme for digitando ele vai somando
			}
			
			media[linha]= soma/matriz[linha].length; // caulculando  media da linha
			soma= 0.0f; // tem que zerar a soma se nao vai somar a do 1 e do segundo aluno
			
		}
		for (float nota : media) {
			System.out.println("A media foi: "+nota);
		}
	}

}
