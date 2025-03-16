package aula070325.ex070325;

public abstract class PlanoStreaming {
    // Atributos
    private String nomePlano;
    private double precoMensal;
    private int numeroDispositivos;

    // Métodos
    
    // Método construtor
    public PlanoStreaming(String nomePlano, double precoMensal, int numeroDispositivos) {
        this.nomePlano = nomePlano;
        this.precoMensal = precoMensal;
        this.numeroDispositivos = numeroDispositivos;
    }

    // Getters e Setters
    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getPrecoMensal() {
        return precoMensal;
    }

    public void setPrecoMensal(double precoMensal) {
        this.precoMensal = precoMensal;
    }

    public int getNumeroDispositivos() {
        return numeroDispositivos;
    }

    public void setNumeroDispositivos(int numeroDispositivos) {
        this.numeroDispositivos = numeroDispositivos;
    }

    // toString
    @Override
    public String toString() {
        return "PlanoStreaming [Nome do plano: '" + nomePlano + "', Preço mensal: R$ " + precoMensal + ", Número de dispositivos: "
                + numeroDispositivos + "]";
    }

    // Método abstrato
    public abstract void exibirBeneficios();
}
