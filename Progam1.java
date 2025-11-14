import java.util.Scanner;
public class Progam1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota de 0 a 10: ");
        double nota = scanner.nextDouble();

        do{
            System.out.println("Insira outro valor:");
            scanner.nextDouble();
        }
        while (nota>10 || nota<0);{
            System.out.println("o seu valor é invalido");
        }
        System.out.println("O seu valor é válido: " + nota);
    }
}