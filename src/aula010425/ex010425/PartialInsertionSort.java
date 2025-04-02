package aula010425.ex010425;

public class PartialInsertionSort {
    public static void partialInsertionSort(int[] vetor, int k) {
        for(int i = 1; i < (k - 1); i++) {
            int chave = vetor[i];
            int j = i - 1;

            while((j >= 0) && vetor[j] > chave) {
                vetor[(j + 1)] = vetor[j];
                j--;
            }

            vetor[(j + 1)] = chave;
        }
    }
}
