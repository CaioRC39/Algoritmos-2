package aula130525.ex130525;

import java.io.Serializable;

public class Aluno implements Serializable {
    // Atributos
    private static final long serialVersionUID = 42L;
    private String nome;
    private int idade;
    private String curso;
    private transient String senha;

    // Métodos

    // Método construtor
    public Aluno(String nome, int idade, String curso, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", curso=" + curso + ", senha=" + senha + "]";
    }
}
