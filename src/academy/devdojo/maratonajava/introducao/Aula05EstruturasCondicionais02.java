package academy.devdojo.maratonajava.introducao;

/**
 // idade < 15 categoria Infantil
 // idade >= 15 && idade <18 categoria juvenil
 // idade >= 18 categoria Adulto
 */

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        // Ternário - categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto"
        System.out.println(categoria);

    }
}
