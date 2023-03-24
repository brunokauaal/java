import contaclient.model.Cliente;

public class Testa_Cliente {

	public static void main(String[] args) {
	
	Cliente  cl = new Cliente ("bruno", "bkauaalves@gmal.com","9531123","São paulo Capital",19);
	cl.visualizar();
	
	cl.setNome("Bruno kauã");
	cl.visualizar();
	
	cl.setEmail("bruno@gmail.com");
	cl.visualizar();

	}

}
