package ExerciciosPoo;

public class Bolo{
    //variáveis de instância
    public String sabor;
    public int tamanho;
    public boolean cobertura;

    //metodos da instancia
    public void exibirDetalhes(){
        System.out.println("Sabor:" + sabor);
        System.out.println("Tamanho:" + tamanho);
        System.out.println("Cobertura:" + cobertura);
    }

    //Metodo para adicionar cobertura
    public void adicionarcobertura(boolean cobertura){
        this.cobertura = cobertura;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
