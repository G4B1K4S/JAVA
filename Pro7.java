import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite 5 numeros consecutivos: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num4 > maior) {
            maior = num4;
        }
        if (num5 > maior) {
            maior = num5;
        }
        System.out.println("O maior número é: "+maior);
    }
}

//Faça um programa que leia 5 números e informe o número maior