package aula180325.ex180325;

public class Main {
    public static void main(String[] args) {
        // Instanciando PlaylistCircular
        PlaylistCircular playlist = new PlaylistCircular();

        // Instanciando músicas
        Musica m1 = new Musica("Sweet Child O' Mine", "Guns N Roses", "Apetite for Destruction", 306);
        Musica m2 = new Musica("Samurai", "Djavan", "Luz", 290);
        Musica m3 = new Musica("Que Nem Maré", "Jorge Vercillo", "Elo", 237);
        Musica m4 = new Musica("Papel Machê", "João Bosco", "Gagabirô", 199);

        // Adicionando músicas à playlist
        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);
        playlist.adicionarMusica(m3);
        playlist.adicionarMusica(m4);

        // Exibindo playlist
        System.out.println("Exibindo playlist: ");
        playlist.exibirPlaylist();

        // Vendo qual a música atual
        System.out.println("Música atual: ");
        System.out.println(playlist.getMusicaAtual());

        // Tamanho da playlist
        System.out.println("Exibindo o tamanho da playlist: ");
        System.out.println(playlist.getTamanhoPlaylist());

        // Removendo música pelo nome
        System.out.println("Removendo uma música...");
        playlist.removerMusica("Sweet Child O' Mine");

        // Exibindo playlist
        System.out.println("Exibindo playlist: ");
        playlist.exibirPlaylist();

        // Buscando música
        System.out.println("Buscando música pelo nome: ");
        System.out.println(playlist.buscarMusica("Samurai").getDado());

        // Tamanho da playlist
        System.out.println("Exibindo o tamanho da playlist: ");
        System.out.println(playlist.getTamanhoPlaylist());

        // Pulando para a próxima música
        System.out.println("Pulando para a próxima música: ");
        System.out.println(playlist.pularProxima());
    }
}
