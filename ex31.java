import java.util.Scanner;

public class ex31 {
    static double calculadora(int num1, int num2){
     double resultado = num1/num2;
     return (double) resultado;

    }
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Insere n1");
        int n1 = teclado.nextInt();
        System.out.println("Insere n2");
        int n2 = teclado.nextInt();
        try {

            System.out.println(calculadora(n1, n2));
        } catch (NullPointerException e) {
            System.out.println("EFN");
        } catch (java.lang.ArithmeticException e){
            System.out.println("Epstein in jail getting graped by diddy");
        }
    }
}
