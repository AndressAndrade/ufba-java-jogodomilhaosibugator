package showmilhao.poo.ufba;

import java.sql.*; //Connection,ResultSet,Statement
import javax.swing.JOptionPane;

// @SuppressWarnings("FieldMayBeFinal"), coisa do netbeans
 
public class ConectaBanco {
    
    public Statement statement;   //responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet resultset;   //responsavel por armazenar o resultado de uma pesquisa passada ao statement
    private String driver = "org.postgresql.Driver";        //responsavel por identificar o servico de bnco de dados
    private String caminho = "jdbc:postgresql://localhost:5432/sistemaperguntas" ;       //responsavel por setar o local do banco de dados
    private String usuario = "postgres";       
    private String senha = "5432";        
    public Connection connection; //responsavel por realizar a conexao com o banco de dados

    public void conexao(){ //metodo responsavel por realizar a conexao com o banco
        try {
            System.setProperty("jdbc.Drivers", driver); //seta a propriedade do driver de conexao
            connection = DriverManager.getConnection(caminho, usuario, senha); //realiza a conexao com o banco de dados
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!");
        }
        
    }
    
    public void desconecta(){ //metodo para fechar a conexao com o banco de dados
        try {
            connection.close(); // fecha a conexao
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:" + ex.getMessage());
        }
    }
}


