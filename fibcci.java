public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // define o número de termos da sequência
        int primeiro = 0, segundo = 1, proximo;

        System.out.print(primeiro + ", " + segundo); // exibe os dois primeiros termos da sequência

        for (int i = 2; i < n; i++) {
            proximo = primeiro + segundo; // calcula o próximo termo da sequência
            System.out.print(", " + proximo); // exibe o próximo termo da sequência
            primeiro = segundo; // atualiza os valores dos termos anteriores
            segundo = proximo;
        }
    }
}