package aula210325.ex210325;

public class Main {
    public static void main(String[] args) {
        // Instanciando a lista duplamente encadeada
        ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();

        System.out.println("Inserindo elementos na lista...");
        lde.inserirNoFim(78);
        lde.inserirNoInicio(12);
        lde.inserirNoFim(5);
        lde.inserirNoInicio(42);
        lde.inserirNoFim(54);
        lde.inserirNoInicio(9);

        System.out.println("Mostrando a lista: ");
        lde.mostrar();

        lde.excluirNo(9);
        System.out.println("Mostrando a lista após excluir do início: ");
        lde.mostrar();

        lde.excluirNo(78);
        System.out.println("Mostrando a lista após excluir do meio: ");
        lde.mostrar();

        lde.excluirNo(54);
        System.out.println("Mostrando a lista após excluir do final: ");
        lde.mostrar();

        System.out.println("Tentando excluir um elemento que não exise na lista: ");
        lde.excluirNo(2);

        System.out.println("O tamanho da lista é: " + lde.tamanho());

        System.out.println("Mostrando os elementos da lista invertido: ");
        lde.mostrarInvertido();

        System.out.println("Invertendo de fato a lista...");
        lde.inverter();

        System.out.println("Mostrando o resultado: ");
        lde.mostrar();

        System.out.println("O maior número da lista é: " + lde.maximo());

        System.out.println("O menor número da lista é: " + lde.minimo());
    }
}
