package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Aritméticos (+ - * /)
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02; // O Resultado de dois valores inteiros sempre resultara em um valor int, opção é fazer o cast(double) no numero02
        System.out.println(resultado);
        System.out.println(numero02 + numero01);
        System.out.println("Valor "+ numero02 + numero01); // Com String antes, vai haver uma concatenação.
        System.out.println(numero02 + numero01 + " Valor "+ numero02 + numero01+"\n"); // Soma antes, e com String antes, o restante vai haver uma concatenação.

        // % = resto da divisão (saber se o resto é par ou impar)
        int resto = 21 % 2;
        System.out.println(resto+"\n");

        // Relacionais (< > <= >= == <> !=) - retorna valor booleano

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezIgualaDez = 10 == 10;
        boolean isDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualaVinte "+ isDezIgualaVinte);
        System.out.println("isDezIgualaDez "+ isDezIgualaDez);
        System.out.println("isDiferenteDez "+ isDiferenteDez+"\n");

        // Lógicos (AND(&&) OR(||) NOT(!)) - retorna valores booleanos
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta + "\n");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayCompravel " + isPlayCompravel +"\n");

        //Atribuição (= += *= /= %=)
        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println(bonus + "\n");

        // Unários

        int contador =0;
        contador += 1; //contador = contador + 1;
        contador++; //pós-incremento
        contador--; //pós-decremento
        ++contador; //pré-incremento
        --contador; //pré-decremento
        int contador2 =0;
        System.out.println(contador2++); // Primeiro lÊ variável depois incrementa
        System.out.println(contador2);
        System.out.println(++contador2); // Primeiro Incrementa e depois lê a variável

    }
}
