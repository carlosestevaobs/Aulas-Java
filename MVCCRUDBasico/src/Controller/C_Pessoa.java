package Controller;

import Model.Conexao;
import Model.M_Pessoa;
import java.sql.ResultSet;

public class C_Pessoa {
    M_Pessoa mPessoa = new M_Pessoa(0, null);
    Conexao conexao = new Conexao();
    ResultSet resultset;
    
    public void Salvar(String nome){
        mPessoa.setNome(nome);
      
        conexao.InserirSQL("INSERT INTO tb_pessoa(pes_nome)"
                + " values ('"+mPessoa.getNome()+"')");
      
    }
    
      public void Deletar(int id){
        mPessoa.setCodigo(id);
        conexao.InserirSQL("DELETE FROM `tb_pessoa` "
                + "WHERE `tb_pessoa`.`pes_id` = "
                +mPessoa.getCodigo());
      
    }
      
      public void Atualizar(int id, String nome){
        mPessoa.setCodigo(id);
        mPessoa.setNome(nome);
        conexao.InserirSQL("UPDATE `tb_pessoa` SET "
                + "`pes_nome` = '"+mPessoa.getNome()+"' "
                + "WHERE `tb_pessoa`.`pes_id` = "+mPessoa.getCodigo());
      
    }
    
    public ResultSet Pesquisar(String pesquisa) {
        mPessoa.setNome(pesquisa);
       
        //pesquisa tudo
        resultset = conexao.PesquisaSQL("Select * from tb_pessoa "
                + "where pes_nome like '%"+mPessoa.getNome()+"%'");        
      
        return resultset;   
    }
    
    public void Conectar() {
        conexao.Conectar();
    }
    
    public void Desconectar() {
        conexao.Desconectar();
    }
}



