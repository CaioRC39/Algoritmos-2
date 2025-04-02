package aula010425.ex010425;

public class PartialHeapSort {
    public static void partialHeapSort(int[] vetor, int k) {
        buildMinHeap(vetor, vetor.length);

        for(int i = (vetor.length - 1); i >= (vetor.length - k); i--) {
            trocar(vetor, 0, i);
            minHeapify(vetor, 0, i);
        }
    }

    private static void buildMinHeap(int[] vetor, int n) {
        for(int i = (n/2 - 1); i >= 0; i--) {
            minHeapify(vetor, i, n);
        }
    }

    private static void minHeapify(int[] vetor, int i, int heapSize) {
        int menor = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if((esquerda < heapSize) && (vetor[esquerda] < vetor[menor])) {
            menor = esquerda;
        }

        if((direita < heapSize) && (vetor[direita] < vetor[menor])) {
            menor = direita;
        }

        if(menor != i) {
            trocar(vetor, i, menor);

            minHeapify(vetor, menor, heapSize);
        }
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
    }
}
