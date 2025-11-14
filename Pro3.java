import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estado_civil;

        do {
            System.out.println("Diga o seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3){
                System.out.println("valor inválido, tente novamente:" );
            }
        } while (nome.length() < 3);

        do {
            System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida, estás realmente vivo/a? Tente novamente:");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Qual é o seu salário?: ");
            salario = scanner.nextDouble();
            if (salario < 0){
                System.out.println("Pobre");
            }
        } while (salario < 0);


        do{
            System.out.println("Qual é o seu sexo?: ");
            sexo = scanner.next().charAt(0);
            if (sexo != 'F' & sexo != 'M'){
            System.out.println("Escolhe um sexo existente tem de estar em maiscula");
            }
        } while (sexo != 'F' & sexo != 'M');

        do {
            System.out.println("Qual é o seu estado civil?: ");
            estado_civil = scanner.next().charAt(0);
            if (estado_civil !='S' & estado_civil !='C' & estado_civil!='V' & estado_civil!='D'){
                System.out.println("Ponha a letra mas tem de ser maiscula do seu estado civil");
            }
        }while (estado_civil !='S' & estado_civil !='C' & estado_civil!='V' & estado_civil!='D');
        scanner.close();

    }
}