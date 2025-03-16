package aula140325.ex140325;

import java.time.LocalDateTime;

public class Requisicao {
    // Atributos
    private String nomeUsuario;
    private Conteudo conteudoRequisitado;
    private LocalDateTime horarioPedido;

    // Métodos
    
    // Método construtor
    public Requisicao(String nomeUsuario, Conteudo conteudoRequisitado, LocalDateTime horarioPedido) {
        this.nomeUsuario = nomeUsuario;
        this.conteudoRequisitado = conteudoRequisitado;
        this.horarioPedido = horarioPedido;
    }

    // Getters e Setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Conteudo getConteudoRequisitado() {
        return conteudoRequisitado;
    }

    public void setConteudoRequisitado(Conteudo conteudoRequisitado) {
        this.conteudoRequisitado = conteudoRequisitado;
    }

    public LocalDateTime getHorarioPedido() {
        return horarioPedido;
    }

    public void setHorarioPedido(LocalDateTime horarioPedido) {
        this.horarioPedido = horarioPedido;
    }

    // to String
    @Override
    public String toString() {
        return "Requisicao [Nome do usuário requerente: '" + nomeUsuario + "', Conteúdo requisitado: '" + conteudoRequisitado
                + "', Horário da requisição: " + horarioPedido + "]";
    }
    
    
}
