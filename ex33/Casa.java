package ex33;

public class Casa {
    private int quartos;
    private int casadb;
    private String rua;

    public void Casa(){
        this.quartos = 3;
        this.casadb = 2;
        this.rua = "Travessa das vinhas";
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return this.rua;
    }
    public void setrQuartos(int quartos){
        this.quartos = quartos;
    }
    public int getQuartos(){
        return this.quartos;
    }
    public void setCasadb(int casadb){
        this.casadb = casadb;
    }
    public int getCasadb(){
        return this.casadb;
    }
}