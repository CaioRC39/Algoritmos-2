package aula280325;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 207505400);
        Pessoa p2 = new Pessoa("Beatriz", 388415290);
        Pessoa p3 = new Pessoa("Caio", 226469700);
        Pessoa p4 = new Pessoa("Daniel", 586164560);
        Pessoa p5 = new Pessoa("Erasmo", 118811140);
        Pessoa p6 = new Pessoa("Fabiano", 109308500);
        Pessoa p7 = new Pessoa("Gabriel", 305467790);
        Pessoa p8 = new Pessoa("Hiago", 790906620);
        Pessoa p9 = new Pessoa("Igor", 690186430);
        Pessoa p10 = new Pessoa("João", 449008170);
        Pessoa p11 = new Pessoa("Kauê", 594372200);
        Pessoa p12 = new Pessoa("Leonardo", 118406070);
        Pessoa p13 = new Pessoa("Manuel", 995908340);
        Pessoa p14 = new Pessoa("Natan", 890336340);
        Pessoa p15 = new Pessoa("Otávio", 783996680);
        Pessoa p16 = new Pessoa("Paulo", 229390890);
        Pessoa p17 = new Pessoa("Quentin", 782621490);
        Pessoa p18 = new Pessoa("Ronaldo", 558661890);
        Pessoa p19 = new Pessoa("Sebastião", 215675210);
        Pessoa p20 = new Pessoa("Túlio", 813339800);

        long[] cpfs = {p1.getCpf(), p2.getCpf(), p3.getCpf(), p4.getCpf(), p5.getCpf(), 
            p6.getCpf(), p7.getCpf(), p8.getCpf(), p9.getCpf(), p10.getCpf(), 
            p11.getCpf(), p12.getCpf(), p13.getCpf(), p14.getCpf(), p15.getCpf(), 
            p16.getCpf(), p17.getCpf(), p18.getCpf(), p19.getCpf(), p20.getCpf()};

        System.out.println("Vetor antes da ordenação: ");
        for(int i = 0; i < cpfs.length; i++) {
            System.out.println(cpfs[i]);
        }
        
        heapSort(cpfs, cpfs.length);

        System.out.println("Vetor após a ordenação: ");
        for(int i = 0; i < cpfs.length; i++) {
            System.out.println(cpfs[i]);
        }
    }

    public static void heapSort(long[] vetor, int tamanho) {
        criaHeap(vetor, tamanho);

        int fim = tamanho - 1;

        while(fim > 0) {
            swap(vetor, 0, fim);
            
            fim--;

            arrumaHeap(vetor, 0, fim);
        }
    }

    public static void criaHeap(long[] vetor, int tamanho) {
        int inicio = (tamanho - 1) / 2;

        while(inicio >= 0) {
            arrumaHeap(vetor, inicio, (tamanho - 1));
            
            inicio--;
        }
    }

    private static void swap(long[] vetor, int i, int j) {
        long temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void arrumaHeap(long[] vetor, int inicio, int fim) {
        int raiz = inicio;

        while((raiz * 2 + 1) <= fim) {
            int filho = raiz * 2 + 1;
            int trocar = raiz;

            if(vetor[trocar] < vetor[filho]) {
                trocar = filho;
            }

            if((filho + 1) <= fim && (vetor[trocar] < vetor[(filho + 1)])) {
                trocar = filho + 1;
            }

            if(trocar == raiz) {
                return;
            }

            else {
                swap(vetor, raiz, trocar);
                
                raiz = trocar;
            }
            
        }
    }
}
