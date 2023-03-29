package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class contaController implements ContaRepository{ //VAMOS IMPLEMENTAR OS METODOS AQUI

	private ArrayList<Conta> ListaContas=new ArrayList <Conta>();
	int numero = 0; // vai gurdar numero da conta
	
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);{
			
			if (conta !=null) //checar se for diferenete de nullo ele mostra 
				conta.visualizar();
			else //caso nao ele exibi que a conta nao foi encontrada
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
		System.out.println("A conta numero: "+ conta.getNumero() + " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigin, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	/*Metodos Auxiliares */
	
	public int gerarNumero() {
		return ++ numero;	
	}
	
	public Conta buscarNaCollection(int numero) { //metodo buscar conta vai servi pra varias coisas
		for (var conta : ListaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
	
	

}
