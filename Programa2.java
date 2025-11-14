import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String passe;

        System.out.println("Insira um nome de usuário: ");
        nome = scanner.nextLine();

        System.out.println("Insira uma palavra-passe: ");
        passe = scanner.nextLine();
        while (passe.equals(nome)) {

            System.out.println("A senha tem de ser diferente do seu nome, digite uma senha diferente: ");
            passe = scanner.nextLine();

        }System.out.println("Muito bem, sabes ter criatividade");
        scanner.close();
    }
}
