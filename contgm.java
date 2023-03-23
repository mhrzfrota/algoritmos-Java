import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número N: ");
        int N = scanner.nextInt(); 

        int[] dados = {1, 3, 5, 7, 9, 12, 15, 18, 20, 22, 25, 27, 30};
        int contador = 0;

        for (int i = 0; i < dados.length; i++) {
            if (dados[i] >= 1 && dados[i] <= N) { 
                contador++;
            }
        }

        System.out.println("Existem " + contador + " valores inteiros entre o primeiro dado e " + N);
    }
}