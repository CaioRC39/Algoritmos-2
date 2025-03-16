package aula140325.ex140325;

import java.util.Objects;

public class Conteudo {
    // Atributos
    private String titulo, tipo, genero;

    // Métodos

    // Método construtor
    public Conteudo(String titulo, String tipo, String genero) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // toString
    @Override
    public String toString() {
        return "Conteudo [Título: '" + titulo + "', Tipo: '" + tipo + "', Gênero: '" + genero + "']";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Conteudo conteudo = (Conteudo) obj;
        return Objects.equals(titulo, conteudo.titulo) &&
               Objects.equals(tipo, conteudo.tipo) &&
               Objects.equals(genero, conteudo.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, tipo, genero);
    }

    
}
