import java.text.DecimalFormat;

import contaclient.model.Cliente;
import contaclient.model.PessoaFisica;
import contaclient.model.PessoaJuridica;

public class Testa_Cliente {

	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("##,##0.000 KG");
	Cliente  cl = new Cliente ("bruno", "bkauaalves@gmal.com","(11) 9531123","São paulo Capital",19);
	Cliente cliente1 = new Cliente("Pedro da Silva", "joao.silva@gmail.com", "(11) 1234-5678", "Rua X, 123", 35);
	PessoaFisica c2 = new PessoaFisica("Jonatas", "jonao.silva@gmail.com", "(11) 1234-5678", "Rua X, 123",10, 50.10);
	PessoaJuridica c3=new PessoaJuridica("Rafael", "rafael@gmail.com", "(11) 1234-5678", "Rua X, 123", 20, 1234);
		
	
	//Testes
	cl.visualizar();
	
	cl.setNome("Bruno kauã");
	cl.visualizar();
	
	cl.setEmail("bruno@gmail.com");
	cl.visualizar();

	cliente1.visualizar();
	
	c2.getPeso();
	c2.visualizar();
	
	c3.getCNPJ();
	c3.visualizar();
	
	c3.setCNPJ(4321);
	c3.visualizar();
	
	}

}
