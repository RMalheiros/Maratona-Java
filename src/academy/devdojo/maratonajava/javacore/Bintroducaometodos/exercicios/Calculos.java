package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Calculos {

    public double calcularTotal(Funcionario funcionario) {
        double totalSalarios = 0;
        for (double salario : funcionario.getSalarios()) {
            totalSalarios += salario;
        }
        return totalSalarios;
    }

    public double calcularMedia(Funcionario funcionario){
        double total = calcularTotal(funcionario);
        return total / funcionario.getQtdEmpregos();
    }
}