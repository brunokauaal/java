package metodos_ex03;

import metodos_ex03.model.Produto;

public class TestaProdutoG {

	public static void main(String[] args) {
	
		  Produto p1 = new Produto("The Last of Us Part II", "PlayStation 4", 2020, 249.90, true);
	      Produto p2 = new Produto("GTA VI", "PC|PSN|XBOX", 2023, 200.90, false);

	      p1.visualizar();
	        System.out.println();
	        p2.visualizar();

	}

}
