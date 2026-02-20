package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Pessoa;

public class Estudante01 {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        estudante.nome = "Luffy";
        estudante.idade = 20;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); // Traz apenas o endereço de memória
    }
}
