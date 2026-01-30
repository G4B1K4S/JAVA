package exerciciosPoo;

public class Main {
    public static void main(String[] args) {
        //Cria um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //Dar sentido aos métodos da instancia
        pessoa1.setIdade(22);
        System.out.println();

        System.out.println("Obtém a idade da pessoa 1: " + pessoa1.getIdade());

        //Dar sentido aos métodos para a pessoa 2
        pessoa2.setNome("JJ Boce");
        System.out.println("Nome da pessoa 2:" + pessoa2.getNome());

        System.out.println();

        pessoa1.setNome("Jesualdo Ferreira");
        System.out.println("Nome da pessoa 1:" + pessoa1.getNome());
    }
}