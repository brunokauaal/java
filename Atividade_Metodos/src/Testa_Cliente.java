import contaclient.model.Cliente;

public class Testa_Cliente {

	public static void main(String[] args) {
	
	Cliente  cl = new Cliente ("bruno", "bkauaalves@gmal.com","(11) 9531123","São paulo Capital",19);
	Cliente cliente1 = new Cliente("Pedro da Silva", "joao.silva@gmail.com", "(11) 1234-5678", "Rua X, 123", 35);
	
	cl.visualizar();
	
	cl.setNome("Bruno kauã");
	cl.visualizar();
	
	cl.setEmail("bruno@gmail.com");
	cl.visualizar();

	
	
	 cliente1.visualizar();
	
	
	}

}
