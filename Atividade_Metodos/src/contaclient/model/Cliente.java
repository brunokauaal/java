package contaclient.model;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private String endereço;
	private int idade;

	public Cliente(String nome, String email, String telefone, String endereço, int idade) { //metodo construtor
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereço = endereço;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//fazer o negocio do get e set
	public void visualizar () {
		
		
		
		
		
		System.out.println("**********************************************");
		System.out.println("              DADOS D0(A) CLIENTE                ");
		System.out.println("**********************************************");	
		System.out.println("Nome do cliente é: " + this.nome );
		System.out.println("Email do cliente:   "+ this.email);
		System.out.println("Telefone do cliente: "+ this.telefone);
		System.out.println("Endereço: "+ this.endereço);
		
		
	}
	
	
}
