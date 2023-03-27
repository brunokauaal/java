package metodos_ex03.model;

public class Game extends Produto{
	
	private String Genero;

	public Game(String nome, String plataforma, int anoLancamento, double preco, boolean disponivel, String genero) {
		super(nome, plataforma, anoLancamento, preco, disponivel);
		Genero = genero;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Genero: "+ this.Genero);
	}
	
	

}
