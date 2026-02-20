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
        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por zero");
        }
    }
}
