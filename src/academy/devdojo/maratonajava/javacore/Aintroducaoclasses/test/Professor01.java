package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Pessoa;

public class Professor01 {
    public static void main(String[] args) {
        Pessoa professor = new Pessoa();
        professor.nome = "Mestre Kami";
        professor.idade = 60;
        professor.sexo = 'M';
        System.out.println("Nome: "+ professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
