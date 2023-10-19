public class SelectionSort {
    public static void main(String[] args) {
        // Cria um array com os elementos a serem ordenados.
        int[] array = { 64, 25, 12, 22, 11 };

        System.out.println("Array não ordenado:");
        imprimirArray(array); // Chama a função para imprimir o array não ordenado.

        selectionSort(array); // Chama a função para ordenar o array usando o Selection Sort.

        System.out.println("Array ordenado:");
        imprimirArray(array); // Chama a função para imprimir o array ordenado.
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i; // Supõe que o elemento atual é o menor.

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j; // Se um elemento menor for encontrado, atualiza o índice do menor elemento.
                }
            }

            // Troca o elemento atual com o menor elemento encontrado.
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
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
