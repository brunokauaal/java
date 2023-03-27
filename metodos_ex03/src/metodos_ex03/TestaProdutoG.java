package metodos_ex03;

import metodos_ex03.model.Consoleg;
import metodos_ex03.model.Game;
import metodos_ex03.model.Produto;

public class TestaProdutoG {

	public static void main(String[] args) {
	
		  Produto p1 = new Produto("The Last of Us Part II", "PlayStation 4", 2020, 249.90, true);
	      Produto p2 = new Produto("GTA VI", "PC|PSN|XBOX", 2023, 200.90, false);
	      Game  g1=new Game("CSGO", "PC", 2023, 75.90, false,"erroproposital");
	      Consoleg g2=new Consoleg("CSGO", "PC", 2023, 75.90, false,"VALVE");
	      
	      
	      //testes
	      p1.visualizar();
	        System.out.println();
	        p2.visualizar();
	        
	        g1.getGenero();
	        g1.visualizar();
	        
	        g1.setGenero("Ação");
	        g1.visualizar();
	        
	        g2.getAnoLancamento();
	        g2.visualizar();
	}

}
