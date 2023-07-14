package Exercicio4;
import java.util.Scanner;

public class Question4 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite o texto a ser decifrado: \n");
		for (int i = 0; i < n; i++) {
			String linhas = scanner.nextLine();
            String fraseDecifrada = decifrarFrase(linhas);
            System.out.println("\n"+fraseDecifrada);
        }
		
		scanner.close();
	}
	
	private static String decifrarFrase(String linha) {
		int meio = linha.length() / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = linha.length() - 1; i >= meio; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
