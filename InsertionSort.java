public class InsertionSort {
    public static void main(String[] args) {
        // Cria um array com os elementos a serem ordenados.
        int[] array = {12, 11, 13, 5, 6};
        
        System.out.println("Array não ordenado:");
        imprimirArray(array); // Chama a função para imprimir o array não ordenado.
        
        insertionSort(array); // Chama a função para ordenar o array usando o Insertion Sort.
        
        System.out.println("Array ordenado:");
        imprimirArray(array); // Chama a função para imprimir o array ordenado.
    }
    
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int chave = array[i]; // O elemento atual a ser inserido no lugar certo.
            int j = i - 1;
            
            // Move os elementos do array que são maiores que a chave para a direita.
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = chave; // Inserir a chave no lugar correto.
        }
    }
    
    public static void imprimirArray(int[] array) {
        // Função para imprimir os elementos do array.
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
