package aula070325;

public abstract class Freelancer {
    // Atributos
    private String nome, especialidade;
    private double precoPorHora;
    private int horasTrabalhadas;
    
    // Métodos

    // Método construtor
    public Freelancer(String nome, String especialidade, double precoPorHora) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.precoPorHora = precoPorHora;
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

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract void realizarServico();

    @Override
    public String toString() {
        return "Nome: '" + nome + "'\nEspecialidade: " + especialidade + "\nPreço por hora: " + precoPorHora
                + "\nHoras trabalhadas: " + horasTrabalhadas;
    }

    public double calcularPagamento() {
        return this.getHorasTrabalhadas() * this.getPrecoPorHora();
    }

    public void pagarFreelancer() throws PagamentoInvalidoException {
        if(calcularPagamento() > 0) {
            System.out.println("Pagamento realizado com sucesso");
        } else {
            throw new PagamentoInvalidoException("Pagamento não pôde ser realizado!\nValor a ser pago é negativo!");
        }
    }
}
