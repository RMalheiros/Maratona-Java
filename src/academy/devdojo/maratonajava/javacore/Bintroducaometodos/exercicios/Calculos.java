package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Calculos {

    private double calcularTotal(Funcionario funcionario) {
        double totalSalarios = 0;
        for (double salario : funcionario.getSalarios()) {
            totalSalarios += salario;
        }
        return totalSalarios;
    }

    private double calcularMedia(Funcionario funcionario){
        double total = calcularTotal(funcionario);
        return total / funcionario.getQtdEmpregos();
    }

    public double getCalcularTotal(Funcionario funcionario){
        return calcularTotal(funcionario);
    }

    public double getCalcularMedia(Funcionario funcionario){
        return calcularMedia(funcionario);
    }
}