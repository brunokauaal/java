package metodos_ex03.model;

public class Consoleg extends Produto{ //herança produto 
	
	private String Fabricante;

	public Consoleg(String nome, String plataforma, int anoLancamento, double preco, boolean disponivel,
			String fabricante) {
		super(nome, plataforma, anoLancamento, preco, disponivel);
		Fabricante = fabricante;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	@Override
	public void visualizar () {
		super.visualizar();
		System.out.println("Fabricante do jogo: "+ this.Fabricante);
	}
	
	

}
