package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:

Eu <nome>, modando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Joaquim";
        String endereco = "QN COnj 30 ";
        double salario = 100.00;
        String dataRecebimento = "25/10/2020";
        String relatorio = "Eu "+nome+", modando no endereço "+ endereco +", confirmo que recebi o salário de " + salario +", na data " + dataRecebimento +".";

        System.out.println(System.getProperty("file.encoding"));
        System.out.println("áéíóú ç ã õ ê salário "+ relatorio);



    }
}
