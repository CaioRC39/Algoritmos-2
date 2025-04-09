package P1.Exercicio01;
public abstract class Curso {
    // Atributos
    private String titulo;
    private int cargaHoraria;

    // Métodos

    // Método construtor
    public Curso(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método para exibir as informações do curso
    public String exibirInformacoes() {
        return "Título: '" + titulo + "'\n" + 
                "Carga Horária: " + cargaHoraria + "h";
    }

    // Método abstrato para emitir o certificado de acordo com o curso
    public abstract void emitirCertificado();
}
