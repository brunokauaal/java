package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03_Aula05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int numero = 0;
        System.out.println("Digite 10 valores inteiros numeros sem repetir os numeros: ");

        // aqui e a entrada que solicita que o usuario digite 10 numeros
        for (int valor = 1; valor < 11; valor++) {
            System.out.println("Digite o " + valor + " numero: ");
            numero = leia.nextInt();
            while (set.contains(numero)) { // aqui vai checar se há numero repitido caso tenho ele da false e pede outro valor
                System.out.println("Valor repetido! Digite outro valor:");
                numero = leia.nextInt();
            }
            set.add(numero); // aqui armazeno no set os numeros armazenados
        }

        System.out.println("\nListar dados do Set:");
        for (Integer n : set) { // aqui criamos um loop para o integer e declaramos um novo nome pra set para listar
            
                System.out.println("O Hashcode do Elemento " + n+ " é " + n.hashCode());
            
        }
    }
}
