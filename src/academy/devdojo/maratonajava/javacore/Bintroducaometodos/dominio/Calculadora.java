package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int x, float y) { // X e Y são parametros (variável que recebe o valor)
        System.out.println(x * y);
    }

    public double divideDoisNumeros(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por zero");
            return; // Esse return no método void é como se fosse um break no laço de repetição.
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArray (int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
