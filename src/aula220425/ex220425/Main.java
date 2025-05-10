package aula220425.ex220425;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vetor = new int[25];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(200);
        }

        System.out.println("Vetor antes da ordenação: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        BucketSort.bucketSort(vetor, 0);
        System.out.println("Bucket Sort: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Counting Sort: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Radix Sort: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
