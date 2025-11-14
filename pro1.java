import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Insira um valor de 0 a 10: ");
            nota = scanner.nextDouble();

            if (nota > 10 || nota < 0) {
                System.out.println("Valor inválido! Tente novamente.\n");
            }
        } while (nota > 10 || nota < 0);

        System.out.println("Você inseriu um valor válido: " + nota);
        scanner.close();
    }
}