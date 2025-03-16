package aula280225.ex280225;

public class AlertaMedicoException extends Exception {
    public String getMessage() {
        return "Atenção! Valores anormais do paciente!";
    }
}
