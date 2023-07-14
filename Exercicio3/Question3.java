package Exercicio3;

import java.util.Arrays;
import java.util.Scanner;


public class Question3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de n:");
        int n = scanner.nextInt();
        System.out.println("Valor de k:");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.print("Informe o valor para o índice: ");
            arr[i] = scanner.nextInt();
        }


        int count = contarParesDiferenca(arr, k);
        System.out.println("O resultado é "+count);

        scanner.close();
    }

    private static int contarParesDiferenca(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == k) {
                    count++;
                } else if (arr[j] - arr[i] > k) {
                    break;
                }
            }
        }

        return count;
    }
     
   
}
