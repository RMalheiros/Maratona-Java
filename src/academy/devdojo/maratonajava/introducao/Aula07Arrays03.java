package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03{
    public static void main(String[] args) {

        //FORMAS DE INICIAR OS ARRAYS
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[] {1,2,3,4,5}; // Nesse caso não pode colocar numeros dentro do int[], da erro de compilação

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        // FOR-EACH
        // for (int numero : numeros3) {
        // System.out.println(numero);
        //  }
        //  }
        //}

        for(int num : numeros3){ // FOR EACH = TIPO NOME:VARIÁVEL DE REFERÊNCIA
            System.out.println(num);
        }
    }
}
