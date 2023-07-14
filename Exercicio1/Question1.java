package Exercicio1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1 {
	public static void main (String []args ) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("numeros de linhas:");
        int numLinhas = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();

        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numLinhas; i++) {
        	System.out.println("Digite os Numeros para realizar a Operação!\n");
            int valor = scanner.nextInt();
            if(valor < 0) {
            	System.out.println("\n os numeros não pode ser negativos");
            	numLinhas+=1;
            }else {
            	if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }
            
        }

        Collections.sort(pares);

        Collections.sort(impares, Collections.reverseOrder());

        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }
        
        scanner.close();
	}
}
