package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroCorsa {
    public static void main(String[] args) {
        Carro Corsa = new Carro();
        Corsa.nome = "Corsa";
        Corsa.modelo = "Sedan";
        Corsa.ano = 2020;
        Corsa.marca = "Chevrolet";

        System.out.println("Nome: " + Corsa.nome + "\nModelo: " + Corsa.modelo + "\nAno: " + Corsa.ano + "\nMarca: " + Corsa.marca);
    }
}
