public class VerificaPrimo {
    public static void main(String[] args) {
       int num = 29; 
       boolean flag = false;
       
       if (num <= 1) { 
          System.out.println(num + " não é um número primo.");
          return;
       }
       
       for (int i = 2; i <= Math.sqrt(num); i++) {
          
          if (num % i == 0) {
             flag = true;
             break;
          }
       }
 
       if (!flag)
          System.out.println(num + " é um número primo.");
       else
          System.out.println(num + " não é um número primo.");
    }
 }