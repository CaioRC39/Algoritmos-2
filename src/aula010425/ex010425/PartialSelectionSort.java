package aula010425.ex010425;

public class PartialSelectionSort {
    public static void partialSelectionSort(int[] vetor, int k) {
        for(int i = 0; i <= (k - 1); i++) {
            int minimo = i;

            for(int j = (i + 1); j <= (vetor.length - 1); j++) {
                if(vetor[j] < vetor[minimo]) {
                    minimo = j;
                }
            }

            int temporario = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = temporario;
        }
    }
}
