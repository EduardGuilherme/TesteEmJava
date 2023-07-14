package Exercicio2;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Valor monetário");
        double valor = scanner.nextDouble();
        
        while(valor < 0) {
        	System.out.print("\n O valor não pode ser negativo! \n");
        	System.out.print("Digite o Valor monetário");
			 valor = scanner.nextDouble();
        }
        
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
            valor %= moeda;
        }
        
        scanner.close();
    }
}
