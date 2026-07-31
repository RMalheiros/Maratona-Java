package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        // calculadora.somaArray(new int[] {1,2,3,4,5}) Outra forma de criar o array
        calculadora.somaVarArgs( 2,4,5,4,6,7); // Com VarArgs(forma de array com(...)) pode adicionar numeros em tempo de execução.

    }
}