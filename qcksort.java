public class Quicksort {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; 

        quicksort(array, 0, array.length - 1); 

        System.out.print("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
    }

    public static void quicksort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particionar(array, esquerda, direita); 
            quicksort(array, esquerda, p - 1); 
            quicksort(array, p + 1, direita); 
        }
    }

    public static int particionar(int[] array, int esquerda, int direita) {
        int pivo = array[direita]; 
        int i = esquerda - 1; 

        for (int j = esquerda; j < direita; j++) {
            if (array[j] <= pivo) { 
                i++; 
                int temp = array[i]; 
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1]; 
        array[i + 1] = array[direita];
        array[direita] = temp;

        return i + 1; 
    }
}