package aula_04;

public class Matriz {

	public static void main(String[] args) {
	int [][] matrizInteiros= {{10,16,35},{70,120,140},{50,100,150}};
	float matrizFloat[][] =new float [2][3] ;
	
	
	for (int ilinha=0 ; ilinha< matrizInteiros.length; ilinha++) {
		for (int iColuna=0 ; iColuna< matrizInteiros.length; ilinha++) {
			System.out.println(matrizInteiros[ilinha][iColuna]);
		}
	}
	

	}

}
