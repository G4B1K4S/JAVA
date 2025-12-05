import java.util.Scanner;
public class Exerv2 {
    static void criarMatriz(){

        int numeros [][]= new int [3][3];
        numeros[0][0] = 6;
        numeros[0][1] = 5;
        numeros[0][2] = 9;
        numeros[1][0] = 2;
        numeros[2][0] = 4;
        numeros[1][1] = 8;
        numeros[1][2] = 7;
        numeros[2][1] = 15;
        numeros[2][2] = 14;

        for(int i = 0; i<numeros.length;i++){
            for(int j=0;j<numeros.length;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void criarMatriz (int linhas, int colunas){
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[linhas][colunas];

        for(int i = 0; i <matriz.length; i++) {
            for(int j = 0; j<matriz.length;j++) {
                System.out.printf("posição [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();

            }
        }
        teclado.close();
    }
    public static void main (String [] args){
        criarMatriz();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas: ");
        int linhas = teclado.nextInt();
        System.out.println("Colunas: ");
        int colunas = teclado.nextInt();

        criarMatriz(linhas, colunas);

        teclado.close();
    }
}