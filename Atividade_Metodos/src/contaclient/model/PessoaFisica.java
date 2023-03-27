package contaclient.model;

public class PessoaFisica extends Cliente{
	
	private double peso;

	public PessoaFisica(String nome, String email, String telefone, String endereço, int idade, double peso) {
		super(nome, email, telefone, endereço, idade);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void visualizar () {
		super.visualizar();
		System.out.println("O Peso do cliente é: " + this.peso);
	}

}
