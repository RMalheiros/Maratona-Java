package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // VALORES PADRÃO DOS TIPOS DE VARIÁVEIS
        // byte, short, int, long, float e double -  0
        //char '\u0000' - ' '
        // boolean - false
        // String - null

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) { // length itera sobre o tamanho do array
            System.out.println(nomes[i]);
        }
    }
}
