package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Funcionario {

    private String nome;
    private int idade;
    private int qtdEmpregos;
    private double[] salarios;


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

    public int getQtdEmpregos() {
        if (qtdEmpregos <= 1){
            System.out.println("O funcionÁRIO está desempREgado.");
        }
        return qtdEmpregos;
    }

    public double [] getSalarios() {
        return salarios;
    }

    public void setQtdEmpregos(int qtdEmpregos) {
        this.qtdEmpregos = qtdEmpregos;
        this.salarios = new double[qtdEmpregos];
    }

}
