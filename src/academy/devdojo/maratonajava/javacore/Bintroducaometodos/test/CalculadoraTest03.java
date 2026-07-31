package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(10,0);
        // Se chamar um metodo com sout que é void (não tem retorno, ocorrerá erro de compilação
    }
}

