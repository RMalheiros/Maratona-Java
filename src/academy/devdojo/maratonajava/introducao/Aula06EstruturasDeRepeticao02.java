package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    // Imprima os primeiros 25 números de uma dado valor. Por exemplo, 50.
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if ( i > 25){
                break; // O break pausa o laço de repetição (For), e não a condicional (if)
            }
            System.out.println("i = " +i);
        }

    }
}
