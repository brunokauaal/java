package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
	Stack <String> pilha =new Stack <String>();	
	
	pilha.push("Brenda");
	pilha.push("Guilherme");
	pilha.push("Michelle");
	pilha.push("Gabriel Lopes");
	pilha.push("Katarina");
	
	
	for(var elemento : pilha)
		System.out.println(elemento);
	System.out.println("Retirar  elemento: ");
	pilha.pop(); //retira da filla
	System.out.println(pilha);
	
	pilha.push("Reynaldo");
	System.out.println(pilha);
	
	System.out.println(pilha.size()); // mostra tamanho da pilha
	System.out.println(pilha.contains("Reynaldo"));
	

	}

}
