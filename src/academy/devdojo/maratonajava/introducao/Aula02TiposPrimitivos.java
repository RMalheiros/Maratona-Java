package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (long) 155.23; // long é um int com maior capacidade
        double salarioDouble = 2000;
        float salarioFloat = 2500f; // float sempre tem que colocar o "F", no long = "L", no Double = "D"
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "Goku"; // String é uma classe então se inicia com maiúscula

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("char "+caractere);

        // CAST = força o long (L) a caber no int (ou QQ tipo), o compilador força a redução da variável


    }
}
