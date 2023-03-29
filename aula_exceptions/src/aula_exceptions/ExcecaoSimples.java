package aula_exceptions;

public class ExcecaoSimples extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //serve para identificar 
	
	public ExcecaoSimples () {}
	//polifomismo assinaturas iguais porem diferentes 
	public ExcecaoSimples (String mensagem) {
		super(mensagem);
	}

}
