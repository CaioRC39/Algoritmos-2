package aula010425.ex010425;

public class PartialQuickSort {
    public static void partialQuickSort(int[] vetor, int menor, int maior, int k) {
        if(menor < maior) {
            int particao = particao(vetor, menor, maior);

            if(particao >= k) {
                partialQuickSort(vetor, menor, (particao - 1), k);
            } else {
                partialQuickSort(vetor, menor, (particao - 1), k);

                if((particao + 1) < k) {
                    partialQuickSort(vetor, (particao + 1), maior, k);
                }
            }

            
        }
    }

    private static int particao(int[] vetor, int menor, int maior) {
        int pivot = vetor[maior];
        int i = (menor - 1);

        for(int j = menor; j <= (maior - 1); j++) {
            if(vetor[j] <= pivot) {
                i++;
                trocar(vetor, i, j);
            }
        }

        trocar(vetor, (i + 1), maior);
        return i + 1;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
    }
}
