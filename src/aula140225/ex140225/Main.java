package aula140225.ex140225;
public class Main {
    public static void main(String[] args) {
        DepartamentoMedico cardiologia = new DepartamentoMedico("Cardiologia");
        DepartamentoMedico neurologia = new DepartamentoMedico("Neurologia");

        Medico joao = new Medico("João", "Cardiologia");
        Medico maria = new Medico("Maria", "Neurologia");

        cardiologia.detalhes();

        System.out.println("\nAdicionando médicos ao departamento de cardiologia");
        cardiologia.adicionar(maria);
        cardiologia.adicionar(joao);
        
        cardiologia.detalhes();

        System.out.println("\nRemovendo Maria do departamento de cardiologia");
        cardiologia.remover(maria);
        
        cardiologia.detalhes();

        neurologia.detalhes();

        System.out.println("\nAdicionando Maria ao departamento de neurologia");
        neurologia.adicionar(maria);
        
        neurologia.detalhes();

    }
}
