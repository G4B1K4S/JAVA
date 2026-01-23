public class ex28 {
    public static void main(String[] args) {
        int idade = 30;
        double tempo = 30.5;
        float farenheit = 305.9f;

        String idade2 = Integer.toString(idade);
        System.out.println("Valor int idade em string: " + idade2);

        String tempo2 = Double.toString(tempo);
        System.out.println("Valor double tempo em string: " + tempo2);

        String farenheit2 = Float.toString(farenheit);
        System.out.println("Valor de float tempo em string: " + farenheit2);
    }
}
