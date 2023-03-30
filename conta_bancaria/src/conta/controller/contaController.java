package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class contaController implements ContaRepository { // VAMOS IMPLEMENTAR OS METODOS AQUI

	private ArrayList<Conta> ListaContas = new ArrayList<Conta>();
	int numero = 0; // vai gurdar numero da conta

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		{

			if (conta != null) // checar se for diferenete de nullo ele mostra
				conta.visualizar();
			else // caso nao ele exibi que a conta nao foi encontrada
				System.out.println("A conta não foi encontrada!");
		}

	}

	@Override
	public void listarTodas() {
		for (var conta : ListaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		ListaContas.add(conta);
		System.out.println("A conta numero: " + conta.getNumero() + " foi criada com sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		{

			if (buscaConta != null) {
				// checar se for diferenete de nullo ele mostra
				ListaContas.set(ListaContas.indexOf(buscaConta), conta); // acha o index do objeto
				System.out.println("Os dados da Conta foram atualizados com sucesso!");
			} else // caso nao ele exibi que a conta nao foi encontrada
				System.out.println("A conta não foi encontrada!");
		}

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		if (conta != null) { // checar se for diferenete de nullo ele mostra
			if (ListaContas.remove(conta) == true)
				;
			System.out.println("A conta foi excluida!");
		} else // caso nao ele exibi que a conta nao foi encontrada
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void sacar(int numero, float valor) {

		var conta = buscarNaCollection(numero); // faz busca
		if (conta != null) { // checar se for diferenete de nullo ele mostra
			if (conta.sacar(valor) == true) // checa se e vdd que deu certo
				System.out.println("O saque foi efetuado com sucesso!");
		} else // caso nao ele exibi que a conta nao foi encontrada
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero); // faz busca

		if (conta != null) {
			conta.depositar(valor); //
			System.out.println("O Deposito foi efetuado com sucesso!");

		} else // caso nao ele exibi que a conta nao foi encontrada
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void transferir(int numeroOrigin, int numeroDestino, float valor) {
		
		var contaOrigem = buscarNaCollection(numeroOrigin); // faz busca
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem != null && contaDestino !=null) {
			if(contaOrigem.sacar(valor)==true) {
				contaDestino.depositar(valor);
				System.out.println("A transferencia foi efetuada com sucesso");
			}
		} else // caso nao ele exibi que a conta nao foi encontrada
			System.out.println("A conta não foi encontrada!");
		
		

	}

	/* Metodos Auxiliares */

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) { // metodo buscar conta vai servi pra varias coisas
		for (var conta : ListaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public int retornaTipo(int numero) { // apartir do numero percorre td achou objeto ele devolve o tipo
		for (var conta : ListaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}

}
