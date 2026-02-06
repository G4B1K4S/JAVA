package ExerciciosPoo;

public class Main {
    public static void main(String[]args){
        //cria um objeto da classe Bolo
        Bolo boloMaria = new Bolo();
        Bolo boloManel = new Bolo();
        Pessoa jão = new Pessoa();

        //define o valor das variaveis
        boloMaria.sabor = "Morangex";
        boloMaria.tamanho = 21;
        boloMaria.cobertura = true;

        boloManel.sabor = "Formiueiro";
        boloManel.tamanho = 47;
        boloManel.cobertura = false;

        boloManel.exibirDetalhes();

    }
}