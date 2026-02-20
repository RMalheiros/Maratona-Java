package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroExercicio {
    public static void main(String[] args) {

        Carro corolla = new Carro();
        corolla.nome = "Corolla";
        corolla.modelo = "Sedan";
        corolla.ano = 2020;
        corolla.marca = "Toyota";

        Carro corsa = new Carro();
        corsa.nome = "Corsa";
        corsa.modelo = "Sedan";
        corsa.ano = 2020;
        corsa.marca = "Chevrolet";

        corolla = corsa;

        System.out.println("Nome: " + corolla.nome + "\nMarca: " + corolla.marca + "\nAno: " + corolla.ano + "\nModelo: " + corolla.modelo);
        System.out.println("\nNome: " + corsa.nome + "\nModelo: " + corsa.modelo + "\nAno: " + corsa.ano + "\nMarca: " + corsa.marca);
    }
}
