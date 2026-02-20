package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais_exercicio02_switch_case {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana, Utilizando switch

        byte dia = 3;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Dia não Útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
