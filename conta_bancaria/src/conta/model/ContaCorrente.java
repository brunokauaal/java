package conta.model;

public class ContaCorrente extends Conta { // aqui so acrecentamos oque e especifico de conta corrente isso e herança

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	

//get setters so gera oque é especifico de conta corrente
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) { // sobrescrevemos apenas mudamos a implementamos
			System.out.println("\n Saldo é  insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor); // alterando valor do meu saldo
		return true;
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor); // somar novo valor com saldo
	}

	@Override // nao é obrigatorio mas é importante pois avisa que vc ta sobrescrevendo um
				// metodo da super na subclase

	public void visualizar() {
		super.visualizar(); // super chamou visualizar para puxar de outra classe
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
