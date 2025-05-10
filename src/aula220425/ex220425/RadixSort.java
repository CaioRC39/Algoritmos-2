package aula220425.ex220425;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    public static void radixSort(int[] A) {
        if (A.length == 0) {
            return; // Nada para ordenar
        }

        for (int num : A) {
            if (num < 0) {
                throw new IllegalArgumentException("O array contém números negativos.");
            }
        }

        int maior = encontrarMaior(A);

        for (int digitoPos = 1; maior / digitoPos > 0; digitoPos *= 10) {
            bucketSort(A, digitoPos);
        }
    }

    private static void bucketSort(int[] A, int digitoPos) {
        List<Integer>[] buckets = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Integer num : A) {
            int digitoAtual = (num / digitoPos) % 10;
            buckets[digitoAtual].add(num);
        }

        int index = 0;

        for (List<Integer> bucket : buckets) {
            for (Integer num : bucket) {
                A[index++] = num;
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
