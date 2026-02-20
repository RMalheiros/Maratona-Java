package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) { // Se tiver apenas uma expressão dentro do while, pode-se omitir as {}
            System.out.println("While " + ++count);
            //count++; //count = count + 1; ou count += 5
        }
        count = 0;

        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        for (count = 0; count < 10; count++) {
            System.out.println("For " + count);
        }
    }
}