package aula180325.ex180325;

public class Musica {
    // Atributos
    private String titulo, artista, album;
    private int duracaoSegundos;

    // Métodos

    // Método construtor
    public Musica(String titulo, String artista, String album, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracaoSegundos = duracaoSegundos;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    // toString
    @Override
    public String toString() {
        return "Título: '" + titulo + "', Artista: '" + artista + "', Álbum: '" + album + "', Duração em segundos: "
                + duracaoSegundos + "s";
    }

    
}
