public class MDC {
    public static void main(String[] args) {
        int a = 15, b = 25; 
        int mdc = calcularMDC(a, b); 

        System.out.println("O mdc de " + a + " e " + b + " é " + mdc); 
    }

    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a; 
        } else {
            return calcularMDC(b, a % b); 
        }
    }
}




