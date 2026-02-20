package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // Estruturas COndicionais
        if (isAutorizadoComprarBebida == true) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida");
        }

        //Negação
        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");

        //Dicas
        boolean c = true; // boolean recebe true, por padrão as variáveis são true
        if(c = false){ // c recebe false, não é comparação, é apenas atribuição do valor falso
            System.out.println("Nunca será executado");
        }

        }

    }
}
