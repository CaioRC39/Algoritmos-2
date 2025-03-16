package aula210225.ex210225;

public abstract class Drone {
    // Atributos
    protected int id;
    protected static int contador = 1;
    protected double capacidadeCarga;
    protected double bateria;
    protected String localizacao;
    protected double distanciaMax;
    protected double consumoBateria;

    // Métodos

    // Método construtor
    public Drone(String localizacao) {
        this.id = contador++;
        this.bateria = 100;
        this.localizacao = localizacao;
    }

    public void carregarBateria() {
        this.bateria = 100;
    }

    public String exibirStatus() {
        return "ID: " + this.id +
                "\nCapacidade de carga atual: " + this.capacidadeCarga +
                "\nNível da bateria: " + this.bateria + "%" + 
                "\nLocalização atual: "+ this.localizacao;
    }

    public boolean entregarPacote(double peso) {
        if(peso <= this.capacidadeCarga) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void voar(double distancia, String destino, double peso);

    // Getters
    public int getId() {
        return id;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double getBateria() {
        return bateria;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getDistanciaMax() {
        return distanciaMax;
    }

    

}
