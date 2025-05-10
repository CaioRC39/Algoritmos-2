package aula220425.ex220425;

public class CountingSort {
    public static void countingSort(int[] A) {
        if (A.length == 0) {
            return; // nada para ordenar
        }
        
        int maior = encontrarMaior(A);

        int[] count = new int[maior + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                throw new IllegalArgumentException("O array contém números negativos.");
            }
            count[A[i]]++;
        }

        int indice = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                A[indice] = i;
                indice++;
                count[i]--;
            }
        }
    }

    private static int encontrarMaior(int[] A) {
        int maior = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maior) {
                maior = A[i];
            }
        }
        return maior;
    }
}
