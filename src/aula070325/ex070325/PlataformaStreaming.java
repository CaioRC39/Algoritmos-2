package aula070325.ex070325;

import java.util.ArrayList;

public class PlataformaStreaming {
    // Atributos
    private ArrayList<Usuario> usuarios;

    // Métodos

    // Método construtor
    public PlataformaStreaming() {
        this.usuarios = new ArrayList<>();
    }

    // Getter
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuario() {
        for(int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).toString());
        }
    }
}
