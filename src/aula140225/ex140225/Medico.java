package aula140225.ex140225;
public class Medico {
    // Atributos
    private String nome, especialidade;

    // Métodos

    // Método construtor
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Médico: '" + nome + "' - Especialidade: " + especialidade;
    }

    
}
