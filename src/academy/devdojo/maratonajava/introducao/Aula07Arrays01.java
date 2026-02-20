package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //cria valores armazenados em memória para idades
        //int idade = null(não pode, apenas wrappers como arrays e strings); variáveis primitivos não podem se iniciar com null.

        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
