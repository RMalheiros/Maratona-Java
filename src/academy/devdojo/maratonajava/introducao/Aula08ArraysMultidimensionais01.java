package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30,31 Qtd dias nos meses
        int[][] dias = new int[3][3]; // É obrigatório apenas informar os arrays da 1ª Posição, que é onde fica o endereço na memória)
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 28;
        dias[1][2] = 31;

        // 1ª Forma de Listar os itens do Array Multidimensional
        for (int i = 0; i < dias.length; i++) { // busca apenas a 1ª Dimentsão do array
            for (int j = 0; j < dias.length; j++) { // busca apenas a 2ª Dimensão do array
                System.out.print(dias[i][j]+"\n");
            }

        }

        System.out.println("-----------------------");

        // 2ª Forma de listar os itens do Array Multidimensional
        for (int[] arrBase: dias){ // tem que criar uma variável que vai acessar o array
            for (int num: arrBase){
                System.out.println(num );
            }
        }
    }
}
