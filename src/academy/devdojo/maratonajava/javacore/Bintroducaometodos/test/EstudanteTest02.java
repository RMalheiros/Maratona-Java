package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressaoPessoa;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        ImpressaoPessoa impressora = new ImpressaoPessoa();
        /** Quando você passa objetos como parametros, você busca a referência ao local do objeto,
         *  o impressora.imprime busca  a referência os atributos e métodos da classe ImpressaoPessoa, assim como o p1 que busca os atributos de pessoa
         */
        p1.nome = "Midoriya";
        p1.idade = 15;
        p1.sexo = 'M';

        p2.nome = "Sakura";
        p2.idade = 16;
        p2.sexo = 'F';

        p1.imprime();
        p2.imprime();
        impressora.imprime(p1);
        impressora.imprime(p2);


    }
}