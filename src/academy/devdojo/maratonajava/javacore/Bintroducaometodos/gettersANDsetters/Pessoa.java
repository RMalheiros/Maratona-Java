package academy.devdojo.maratonajava.javacore.Bintroducaometodos.gettersANDsetters;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
}
