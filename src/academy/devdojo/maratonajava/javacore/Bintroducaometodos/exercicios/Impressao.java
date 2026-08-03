package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

import java.util.Scanner;

public class Impressao {

    Scanner dados = new Scanner(System.in);

    public void lerDados(Funcionario funcionario) {
        System.out.println("Digite o nome do funcionário: ");
            funcionario.setNome(dados.nextLine());
        System.out.println("Digite a idade  do funcionário: ");
            funcionario.setIdade(dados.nextInt());
        System.out.println("Digite quantos empregos tem o funcionário: ");
            funcionario.setQtdEmpregos(dados.nextInt());

            for (int i = 0; i < funcionario.getSalarios().length; i++) {
            System.out.println("Digite o salário do funcionário: ");
            funcionario.getSalarios()[i] = dados.nextDouble();
            }
        dados.close();
    }

    public void imprimir(Funcionario funcionario, Calculos calculos) {
        System.out.println("\nDados do Funcionário: \nNome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("O Funcionário tem " + funcionario.getQtdEmpregos() + " trabalhos com valor total dos salários de R$ " + calculos.getCalcularTotal(funcionario) + ", e a média salárial de R$ " + calculos.getCalcularMedia(funcionario));
    }
}
