public class MergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10}; // Array desordenado
        
        System.out.println("Array antes do Merge Sort:");
        imprimirArray(array);
        
        mergeSort(array); // Chamando o método mergeSort para ordenar o array
        
        System.out.println("Array após o Merge Sort:");
        imprimirArray(array);
    }
    
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int meio = array.length / 2;
            
            // Divide o array em duas metades
            int[] metadeEsquerda = new int[meio];
            int[] metadeDireita = new int[array.length - meio];
            
            for (int i = 0; i < meio; i++) {
                metadeEsquerda[i] = array[i];
            }
            for (int i = meio; i < array.length; i++) {
                metadeDireita[i - meio] = array[i];
            }
            
            // Chama mergeSort recursivamente nas duas metades
            mergeSort(metadeEsquerda);
            mergeSort(metadeDireita);
            
            // Combina as duas metades ordenadas
            merge(array, metadeEsquerda, metadeDireita);
        }
    }
    
    public static void merge(int[] array, int[] metadeEsquerda, int[] metadeDireita) {
        int i = 0, j = 0, k = 0;
        
        // Compara e mescla as duas metades no array principal
        while (i < metadeEsquerda.length && j < metadeDireita.length) {
            if (metadeEsquerda[i] < metadeDireita[j]) {
                array[k] = metadeEsquerda[i];
                i++;
            } else {
                array[k] = metadeDireita[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes da metade esquerda (se houver)
        while (i < metadeEsquerda.length) {
            array[k] = metadeEsquerda[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes da metade direita (se houver)
        while (j < metadeDireita.length) {
            array[k] = metadeDireita[j];
            j++;
            k++;
        }
    }
    
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
