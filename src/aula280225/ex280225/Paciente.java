package aula280225.ex280225;

public class Paciente {
    // Atributos
    private String nome;
    private int idade;
    private int frequenciaCardiaca;
    private double temperaturaCorporal;
    
    // Métodos

    // Método construtor
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public boolean setFrequenciaCardiaca(int frequenciaCardiaca) {
        if(frequenciaCardiaca < 0) {
            throw new IllegalArgumentException("Frequência cardíaca negativa");
        } else {
            this.frequenciaCardiaca = frequenciaCardiaca;
            return true;
        }
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public boolean setTemperaturaCorporal(double temperaturaCorporal) {
        if(temperaturaCorporal < 0) {
            throw new IllegalArgumentException("Temperatura corporal negativa");
        } else {
            this.temperaturaCorporal = temperaturaCorporal;
            return true;
        }
    }

    public void monitorarPaciente(int frequenciaCardiaca, double temperaturaCorporal) throws AlertaMedicoException {
        if(setFrequenciaCardiaca(frequenciaCardiaca) && setTemperaturaCorporal(temperaturaCorporal)) {
            if((frequenciaCardiaca >= 50 && frequenciaCardiaca <= 120) && (temperaturaCorporal >= 35 && temperaturaCorporal <=38 )) {
                System.out.println("Paciente está estável");
            } else {
                throw new AlertaMedicoException();
            }
        } else {
            throw new AlertaMedicoException();
        }
    }
}
