package optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (var n : numeros) {
			System.out.println(n);
		}

		List<Integer> numerosStream = numeros.stream().map(n -> n * n * n).collect(Collectors.toList());

		System.out.println(numerosStream);

		for (var n : numeros) {
			System.out.println(n);
		}

		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0) // como se fosse um if se for satisfeita
																				// ele joga na colletionc
				.collect(Collectors.toList());

		System.out.println(numerosPares);

		
		
		
		List<Integer> numerosOrdenadosDesc = numeros.stream()
				 .sorted(Comparator.reverseOrder())
				 .collect(Collectors.toList());

		 System.out.println("\nExibir os Numeros em Ordem Decrescente: " + numerosOrdenadosDesc);
		 
		 
		 
		 
		 
	}
		 
		 
		 
		 
		 
	}
	




	
		
	

