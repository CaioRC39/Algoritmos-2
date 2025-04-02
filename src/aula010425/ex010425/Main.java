package aula010425.ex010425;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int[] vetor = new int[10];

        int k = 5;
        
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(101);
        }

        System.out.println("Exibindo o vetor antes de ser ordenado");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("====================");

        System.out.println("Partial Selection Sort");
        PartialSelectionSort.partialSelectionSort(vetor, k);
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("====================");

        System.out.println("Partial Insertion Sort");
        PartialInsertionSort.partialInsertionSort(vetor, k);
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("====================");

        System.out.println("Partial Heap Sort");
        PartialHeapSort.partialHeapSort(vetor, k);
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("====================");

        System.out.println("Partial Quick Sort");
        PartialQuickSort.partialQuickSort(vetor, 0, (vetor.length - 1), k);
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("====================");
    }
}
