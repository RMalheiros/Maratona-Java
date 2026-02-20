package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // char, int, byte, short, enum, String - tipos que aceitam o switch
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break; // O break é utilizado para parar de rodar o método quando atingir o caso, senão ele segue rodando
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: // pode ficar em qualquer lugar no switch case
                System.out.println("Digite um número entre 1 e 7");
                break;
        }
    }
}
