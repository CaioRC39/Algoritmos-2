package aula140325.ex140325;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class SistemasStreaming {
    // Atributos
    private Queue<Requisicao> filaSolicitacoes = new ArrayDeque<>();
    private Deque<Conteudo> pilhaHistorico = new ArrayDeque<>();
    private List<Conteudo> catalogo = new ArrayList<>();

    // Métodos

    // Getters
    public Queue<Requisicao> getFilaSolicitacoes() {
        return filaSolicitacoes;
    }

    public Deque<Conteudo> getPilhaHistorico() {
        return pilhaHistorico;
    }

    public List<Conteudo> getCatalogo() {
        return catalogo;
    }

    public void inserirConteudo(int indice, String titulo, String tipo, String genero) {
        catalogo.add(indice, new Conteudo(titulo, tipo, genero));
    }

    public Conteudo removerConteudo(int indice) {
        return catalogo.remove(indice);
    }

    public boolean removerConteudo(String titulo, String tipo, String genero) {
        Conteudo conteudo = new Conteudo(titulo, tipo, genero);
        for(Conteudo c : catalogo) {
            if(c.equals(conteudo)) {
                return catalogo.remove(c);
            }
        }
        return false;
    }

    public void listarConteudo() {
        for(int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + " - " + catalogo.get(i).toString());
        }
    }

    public void adicionarRequisicao(String nomeUsuario, Conteudo conteudoRequisitado, LocalDateTime horarioPedido) {
        filaSolicitacoes.offer(new Requisicao(nomeUsuario, conteudoRequisitado, horarioPedido));
    }

    public Conteudo processarRequisicao() {
        Conteudo conteudo = filaSolicitacoes.poll().getConteudoRequisitado();
        pilhaHistorico.push(conteudo);
        return conteudo;
    }

    public Conteudo desfazerReproducao() {
        return pilhaHistorico.pop();
    }

    public void exibirHistorico() {
        for(Conteudo c : pilhaHistorico) {
            System.out.println(c);
        }
    }


}
