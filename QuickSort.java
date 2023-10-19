public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 7, 6};
        
        System.out.println("Array original:");
        imprimirArray(array);
        
        quickSort(array, 0, array.length - 1); // Chamando o algoritmo Quick Sort
        
        System.out.println("Array ordenado:");
        imprimirArray(array);
    }

    public static void quickSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int indicePivo = particionar(array, esquerda, direita); // Encontra o índice do pivo

            // Chama quickSort recursivamente para as sub-arrays à esquerda e à direita do pivo
            quickSort(array, esquerda, indicePivo - 1);
            quickSort(array, indicePivo + 1, direita);
        }
    }

    public static int particionar(int[] array, int esquerda, int direita) {
        int pivo = array[direita]; // O pivo é o elemento mais à direita
        int i = (esquerda - 1); // Índice do menor elemento

        for (int j = esquerda; j < direita; j++) {
            if (array[j] < pivo) {
                // Troca arr[i] e arr[j]
                int temp = array[i + 1];
                array[i + 1] = array[j];
                array[j] = temp;
                i++;
            }
        }

        // Troca arr[i+1] e arr[direita] (o pivo)
        int temp = array[i + 1];
        array[i + 1] = array[direita];
        array[direita] = temp;

        return i + 1; // Retorna o índice do pivo
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
