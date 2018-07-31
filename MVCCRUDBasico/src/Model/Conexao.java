package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    // Constante com o endereço do Driver
    private final String driver = "com.mysql.jdbc.Driver";
    // Objetos conexao e statement
    private Connection conexao;
    private Statement statement;
    private ResultSet resultset;

    public void Conectar() {
        try {
            //Busca pelo driver
            Class.forName(driver);
            // Passando os parâmetros da conexão
            conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Cadastros", "root", "");
            // Executar ações no banco de dados
            statement = (Statement) conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        } catch (SQLException | ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "erro ao conectar");

        }
    }

    public void InserirSQL(String SQL) {
        try {
            //insere
            statement.execute(SQL);
        } catch (SQLException ex) {

        }

    }

    public void Desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: " + ex);

        }
    }

    public ResultSet PesquisaSQL(String SQL) {
        try {
            // resultset recebe o retorno da execução do statement
            resultset = statement.executeQuery(SQL);
          
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex);
        }
        return resultset;
    }

}
