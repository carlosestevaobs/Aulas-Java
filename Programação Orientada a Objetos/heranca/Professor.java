
package heranca;

public class Professor extends Pessoa {
    private String formacao;
    private String nivel;
    
    public Professor(String nome, String RG, String CPF, String formacao, String nivel) {
        super(nome, RG, CPF);
        this.formacao = formacao;
        this.nivel = nivel;
    }
    
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public String getFormacao() {
        return formacao;
    }
    
    public String getNivel(){
        return nivel;
    }
}
