package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressaoPessoa {
    public void imprime(Pessoa p) {

        System.out.println("__________________");

        System.out.println(p.nome);
        System.out.println(p.idade);
        System.out.println(p.sexo);
        p.nome = "Gohan"; // Tem que tomar cuidado ao alterar a referÊncia ao objeto, pois pode afetar o objeto que chama ele
        // Boas práticas - Não altere os dados do objeto que você está passando no método.
    }
}
