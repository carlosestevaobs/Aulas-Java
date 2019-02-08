package heranca;

public abstract class Pessoa {
    private String nome;
    private String RG;
    private String CPF;

    public Pessoa(String nome, String RG, String CPF){
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getRG(){
        return RG;
    }
    
    public String getCPF(){
        return CPF;
    }
}
