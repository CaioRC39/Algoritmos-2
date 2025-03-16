package aula070325.ex070325;

public class Usuario {
    // Atributos
    private String nome;
    private PlanoStreaming planoAssinado;
    private static int id, contador = 1;
    
    // Métodos

    // Método construtor
    public Usuario(String nome, PlanoStreaming planoAssinado) {
        this.nome = nome;
        this.planoAssinado = planoAssinado;
        id = contador++;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PlanoStreaming getPlanoAssinado() {
        return planoAssinado;
    }

    public static int getId() {
        return id;
    }

    public void alterarPlano(PlanoStreaming planoAssinado) {
        this.planoAssinado = planoAssinado;
    }

    public void exibirFatura() {
        System.out.println("R$ " + planoAssinado.getPrecoMensal());
    }

    // toString
    @Override
    public String toString() {
        return "Nome: '" + nome + "'\nPlano assinado: " + planoAssinado.getNomePlano();
    }

    

}
