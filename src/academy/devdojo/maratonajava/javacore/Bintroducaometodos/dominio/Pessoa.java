package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){ // This - Serve para fazer referÊncia a algo que está dentro do objeto
        System.out.println("======================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        // Não é uma boa prática colocar o método imprime dentro da classe pessoa, pois está deixando o código acoplado,
        //  e a classe está responsável por mais de uma função
    }
}

