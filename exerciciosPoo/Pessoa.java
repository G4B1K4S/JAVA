package exerciciosPoo;
public class Pessoa {
    //Variáveis de Instancia
    private String nome;
    private int idade;

    //Métodos de instancia
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    public int getIdade(){
        return this.idade;
    }

}