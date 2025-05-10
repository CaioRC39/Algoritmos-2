package aula220425.ex220425;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] A, int n) {
        if (A.length <= 0) {
            return;
        }

        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        List<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < A.length; i++) {
            int bucketIndex = (A[i] * n) / (max + 1);
            buckets[bucketIndex].add(A[i]);
        }

        for (int i = 0; i < n; i++) {
            CountingSort.countingSort(buckets[i]);
        }

        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (Integer elemento : buckets[i]) {
                A[pos++] = elemento;
            }
        }
    }
}
