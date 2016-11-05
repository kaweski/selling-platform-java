package banco;

import dados.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.firebirdsql.jdbc.FBDriver;

/**
 * Classe geral de conexão com banco de dados
 * @author Natasha
 * @version 2.0
 * @since 30/10/16
 */
public class Banco {
    private Connection con;
    
    public Connection getConnection() {
        return con;
    }
    
    public void setConnection( Connection con ) {
        this.con = con;
    }
    
    private String banco = "jdbc:firebirdsql:127.0.0.1/3050:/Users/Natasha/Desktop/VENDAS.FDB";
    private String usuario = "SYSDBA";
    private String senha = "masterkey";
    
    /**
     * Método que abre conexão com banco de dados
     * @throws SQLException
     * @version 2.0
     */
    public Connection abrirConexao() throws SQLException {
        // Registrando driver
        DriverManager.registerDriver( new FBDriver() );
        
        // Estabelecendo conexão
        this.con = DriverManager.getConnection(this.banco, this.usuario, this.senha);
        
        return this.con;
    }
    
    /**
     * Método que fecha conexão com banco de dados
     * @throws SQLException 
     */
    public void fecharConexao() throws SQLException{
        this.con.close();
    }
    
    /**
     * Método que pesquisa o cliente pelo código parametrizado
     * @author Natasha
     * @since 5/11/16
     * @version 1.0
     */
    public static Cliente pesquisarClienteCodigo(int codigo) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM TabClientes WHERE CODIGO = ?";
        PreparedStatement objSQLSelect = con.prepareStatement(selectQuerySQL);

        // Executa a query
        objSQLSelect.setInt(1, codigo);
        ResultSet resposta = objSQLSelect.executeQuery();

        if ( resposta.next() )
            return new Cliente(
                resposta.getInt("CodCliente"),
                resposta.getString("NOME"),
                resposta.getString("ENDERECO"),
                resposta.getString("BAIRRO"),
                resposta.getString("CIDADE"),
                resposta.getString("UF"),
                resposta.getString("CEP"),
                resposta.getString("Telefone"),
                resposta.getString("E_Mail"),
                resposta.getDate("Data_Cad_Cliente")
            );

        else
            throw new SQLException("Não existe Cliente para o código informado.");
    }
}
