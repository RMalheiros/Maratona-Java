package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class main {

/*
Crie uma classe Funcionário com os seguintes atributos:
- Nome, Idade, Salário (três salários podem ser guardados)

Crie dois metodos
- Um que imprime dados, Um para tirar a média dos salários e imprimir o resultado
*/

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Impressao impressora = new Impressao();
        Calculos calculos = new Calculos();
        
        impressora.lerDados(funcionario1);

        if (funcionario1.getQtdEmpregos() > 0) {
            impressora.imprimir(funcionario1, calculos);
        }
    }
}
