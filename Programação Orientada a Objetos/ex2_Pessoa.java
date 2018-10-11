public class Pessoa {
    private String nome;
    private int idade;

     //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    // métodos getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
