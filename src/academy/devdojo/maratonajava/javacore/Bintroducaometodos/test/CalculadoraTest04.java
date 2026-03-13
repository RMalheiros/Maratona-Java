package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int x = 1;
        int y = 2;
        calculadora.alteraDoisNumeros(x, y);
        System.out.println("\nDentro CalculadoraTest04 ");
        System.out.println("x "+x);
        System.out.println("y "+y);
    }
}
