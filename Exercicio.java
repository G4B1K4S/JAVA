public class Exercicio{

public static void main(String[] args) {
 int numeros[][] = new int[3][3];

{
    numeros[0][0] = 6;
    numeros[0][1] = 5;
    numeros[0][2] = 9;
    numeros[1][0] = 2;
    numeros[2][0] = 4;
    numeros[1][1] = 8;
    numeros[1][2] = 7;
    numeros[2][1] = 15;
    numeros[2][2] = 14;

    for(int i = 0; i < numeros.length; i++){
        for(int j = 0; j < numeros.length; j++){
            System.out.print(numeros[i][j] + " ");
            }
                System.out.println();
            }
        }
    }
}