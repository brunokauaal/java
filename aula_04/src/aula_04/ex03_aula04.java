package aula_04;

import java.util.Scanner;

public class ex03_aula04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int somaP = 0, somaS = 0;
		String diagonalP="",diagonalS="";

		for(int il=0; il < matriz.length;il++) {
			for(int cl=0; cl < matriz.length;cl++) {
				System.out.println("Digite um numero: ");
				matriz[il][cl]=leia.nextInt();  //primeiro for para inserir dados
			}
		}
		for(int il=0; il < matriz.length;il++) {
			diagonalP += matriz[il][il]+ " "; //verificar diagonal principal 1 loppin so ja  resolve //vai pegar so oque é igual
			somaP+= matriz[il][il];
		
			diagonalS += matriz[il][matriz.length - 1 - il]+ " "; //verificar diagonal principal 1 loppin so ja  resolve //vai pegar so oque é igual
			somaS+= matriz[il][matriz.length - 1 - il];
		
		}
		
		
	}

}
