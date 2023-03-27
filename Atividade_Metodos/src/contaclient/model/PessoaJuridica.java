package contaclient.model;

public class PessoaJuridica extends Cliente{
	
	private int CNPJ;

	public PessoaJuridica(String nome, String email, String telefone, String endereço, int idade, int CNPJ) {
		super(nome, email, telefone, endereço, idade);
		this.CNPJ = CNPJ;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}
	@Override
	public void visualizar () {
		super.visualizar();
		System.out.println("Digite o numero da sua CNPJ: " + this.CNPJ);
	}
}
