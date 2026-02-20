package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[4][]; // Não precisa inicializar a 2ª Posição imediatamente, pode ser depois, conforma abaixo

        // Formas de começar o array,
        // Criando uma variável com os valores entre chaves e informando a variável arrayInt[1]
        int[] array = {3,4,5};

        // Colocando entre chaves após o colchetes, ou colocando a quantidade de itens dentro do colchetes
        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{6,7,8,9,10,11};
        arrayInt[3] = new int[4];

        // trocandos os valores do Array[3]
        arrayInt[3] = new int[]{12, 13, 14, 15};

        // Informando todos os valroes dentro de chaves
        int [] [] arrayInt2 = {{0,0},{1,2,3},{4,5,6,7,8,9}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n----------");
            for(int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
