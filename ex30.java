public class ex30 {
    public static void main(String[] args) {
        double[] notas = {13, 20, 16, 12, 15};

        double soma = 0, media = 0, contador = 0;

        for(int i = 0; i < notas.length; i++) {
            soma+=notas[i];

            contador++;
        }

     media=soma/contador;

     int media2 =  (int)media;
     System.out.println("Número de alunos: " +notas.length);
     System.out.println("Média das notas (original): " +media);
     System.out.println("Média das notas (convertido para int): " +media2);
    }
}
