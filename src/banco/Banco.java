package banco;

import dados.Cliente;
import dados.Produto;
import dados.Vendedor;
import erro.SisVendasException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.firebirdsql.jdbc.FBDriver;

/**
 * Classe geral de conexão com banco de dados
 * @author Natasha
 * @version 2.1
 * @since 30/10/16
 * 
 * Índice:
 * 1. BANCO DE DADOS
 * 2. CLIENTE
 * 3. VENDEDOR
 * 4. PRODUTO
 * 5. VENDAS
 */

public class Banco {
    
    /* ========================================================================================================
     * 1. BANCO DE DADOS
     * ===================================================================================================== */
    
    public static Connection con;
    
    private static String banco = "jdbc:firebirdsql:127.0.0.1/3050:/Users/Natasha/Desktop/VENDAS.FDB";
    private static String usuario = "SYSDBA";
    private static String senha = "masterkey";
    
    /**
     * Método que abre conexão com banco de dados
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 30/10/16
     * @version 2.1
     */
    public static void abrirConexao() throws SQLException {
        // Registrando driver
        DriverManager.registerDriver( new FBDriver() );
        
        // Estabelecendo conexão
        con = DriverManager.getConnection(banco, usuario, senha);
    }
    
    /**
     * Método que fecha conexão com banco de dados
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 5/11/16
     * @version 2.0
     */
    public static void fecharConexao() throws SQLException{
        con.close();
    }
    
    /* ========================================================================================================
     * 2. CLIENTE
     * ===================================================================================================== */
    
    /**
     * Método que pesquisa o cliente pelo código parametrizado
     * @param codigo
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 5/11/16
     * @version 2.2
     */
    public static ResultSet pesquisarClienteCodigo(int codigo) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM CLIENTES WHERE CODCLIENTE = ?";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);

        // Executa a query
        objSQL.setInt(1, codigo);
        return objSQL.executeQuery();
    }
    
    /**
     * Método que pesquisa o cliente pelo nome parametrizado
     * @param nome
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 5/11/16
     * @version 1.0
     */
    public static ResultSet pesquisarClienteNome(String nome) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM CLIENTES WHERE UPPER(NOME) LIKE '%' || ? || '%' ORDER BY NOME";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);
        
        // Executa a query
        objSQL.setString(1, "%" + nome.toUpperCase() + "%");
        return objSQL.executeQuery();
    }
    
    /**
     * Método que insere um novo cliente no banco
     * @param cliente
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 6/11/16
     * @version 1.0
     */
    public static void incluirCliente(Cliente cliente) throws SQLException {
        String insertQuerySQL = "INSERT INTO CLIENTES(NOME, ENDERECO, BAIRRO, CIDADE, UF, CEP, TELEFONE, E_MAIL, DATA_CAD_CLIENTE) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement objSQL = con.prepareStatement(insertQuerySQL);
        objSQL.setString(1, cliente.getNome());
        objSQL.setString(2, cliente.getEndereco());
        objSQL.setString(3, cliente.getBairro());
        objSQL.setString(4, cliente.getCidade());
        objSQL.setString(5, cliente.getUf());
        objSQL.setString(6, cliente.getCep());
        objSQL.setString(7, cliente.getTelefone());
        objSQL.setString(8, cliente.getEmail());
        objSQL.setDate(9, cliente.getDataCadCliente());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que atualiza os dados de um cliente existente no banco
     * @param cliente
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 10/11/16
     * @version 1.1
     */
    public static void alterarCliente(Cliente cliente) throws SQLException {
//        String updateQuerySQL = "UPDATE CLIENTES SET NOME = ?, ENDERECO = ?, BAIRRO = ?, CIDADE = ?, UF = ?, CEP = ? WHERE CODCLIENTE = ?";
        String updateQuerySQL = "UPDATE CLIENTES SET NOME = ?, ENDERECO = ?, BAIRRO = ?, CIDADE = ?, UF = ?, CEP = ?, TELEFONE = ?, E_MAIL = ? WHERE CODCLIENTE = ?";
        PreparedStatement objSQL = con.prepareStatement(updateQuerySQL);
        objSQL.setString(1, cliente.getNome());
        objSQL.setString(2, cliente.getEndereco());
        objSQL.setString(3, cliente.getBairro());
        objSQL.setString(4, cliente.getCidade());
        objSQL.setString(5, cliente.getUf());
        objSQL.setString(6, cliente.getCep());
        objSQL.setString(7, cliente.getTelefone());
        objSQL.setString(8, cliente.getEmail());
        objSQL.setInt(9, cliente.getCodCliente());
//        objSQL.setInt(7, cliente.getCodCliente());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que exclui um cliente no banco
     * @param codigo
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 10/11/16
     * @version 2.0
     */
    public static void excluirCliente(int codigo) throws SQLException {
        
        // Verifica se possui vendas para o cliente
        PreparedStatement selectQuerySQL = con.prepareStatement("SELECT * FROM VENDAS WHERE CODCLIENTE = ?");
        selectQuerySQL.setInt(1, codigo);
        ResultSet resposta = selectQuerySQL.executeQuery();
        
        // Se possuir vendas vinculadas, retorna um erro de exceção
        if ( resposta.next() ) {
            throw new SisVendasException("Esse cliente possui vendas vinculadas e não poderá ser excluído.");
        } else {
            
            // Se não possuir vendas vinculadas ao cliente, exclui-se o cliente
            String deleteQuerySQL = "DELETE FROM CLIENTES WHERE CODCLIENTE = ?";
            PreparedStatement objSQL = con.prepareStatement(deleteQuerySQL);
            objSQL.setInt(1, codigo);
            objSQL.executeUpdate();
        }
    }
    
    /* ========================================================================================================
     * 3. VENDEDOR
     * ===================================================================================================== */
    
    /**
     * Método que lista todos os vendedores
     * @return objSQL
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static ResultSet listaTodosVendedores() throws SQLException {
        // Query de Busca
        String selectQuerySQL = "SELECT * FROM VENDEDORES";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);
        
        // Executa a query
        return objSQL.executeQuery();
    }
    
    /**
     * Método que pesquisa o vendedor pelo código parametrizado
     * @param codigo
     * @return objSQL
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static ResultSet pesquisarVendedorCodigo(int codigo) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM VENDEDORES WHERE COD_VENDEDOR = ?";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);

        // Executa a query
        objSQL.setInt(1, codigo);
        return objSQL.executeQuery();
    }
    
    /**
     * Método que pesquisa o vendedor pelo nome parametrizado
     * @param nome
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static ResultSet pesquisarVendedorNome(String nome) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM VENDEDORES WHERE UPPER(NOME_VENDEDOR) LIKE '%' || ? || '%' ORDER BY NOME_VENDEDOR";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);
        
        // Executa a query
        objSQL.setString(1, "%" + nome.toUpperCase() + "%");
        return objSQL.executeQuery();
    }
    
    /**
     * Método que insere um novo vendedor no banco
     * @param vendedor
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static void incluirVendedor(Vendedor vendedor) throws SQLException {
        String insertQuerySQL = "INSERT INTO VENDEDORES(NOME_VENDEDOR, DATA_CAD_VENDEDOR) VALUES(?, ?)";
        PreparedStatement objSQL = con.prepareStatement(insertQuerySQL);
        objSQL.setString(1, vendedor.getNome());
        objSQL.setDate(2, vendedor.getData());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que atualiza os dados de um vendedor existente no banco
     * @param vendedor
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 2.0
     */
    public static void alterarVendedor(Vendedor vendedor) throws SQLException {
        String updateQuerySQL = "UPDATE VENDEDORES SET NOME_VENDEDOR = ? WHERE COD_VENDEDOR = ?";
        PreparedStatement objSQL = con.prepareStatement(updateQuerySQL);
        objSQL.setString(1, vendedor.getNome());
        objSQL.setInt(2, vendedor.getCodigo());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que exclui um vendedor no banco
     * @param codigo
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static void excluirVendedor(int codigo) throws SQLException {
        
        // Verifica se possui vendas para o vendedor
        PreparedStatement selectQuerySQL = con.prepareStatement("SELECT * FROM VENDAS WHERE CODCLIENTE = ?");
        selectQuerySQL.setInt(1, codigo);
        ResultSet resposta = selectQuerySQL.executeQuery();
        
        // Se possuir vendas vinculadas, retorna um erro de exceção
        if ( resposta.next() ) {
            throw new SisVendasException("Esse vendedor possui vendas vinculadas e não poderá ser excluído.");
        } else {
            // Se não possuir vendas vinculadas ao vendedor, exclui-se o vendedor
            String deleteQuerySQL = "DELETE FROM VENDEDORES WHERE COD_VENDEDOR = ?";
            PreparedStatement objSQL = con.prepareStatement(deleteQuerySQL);
            objSQL.setInt(1, codigo);
            objSQL.executeUpdate();
        }
    }
    
    /* ========================================================================================================
     * 4. PRODUTO
     * ===================================================================================================== */
    
    /**
     * Método que pesquisa o produto pelo código parametrizado
     * @param codigo
     * @return objSQL
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static ResultSet pesquisarProdutoCodigo(int codigo) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM TABPRODUTOS WHERE CODPRODUTO = ?";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);

        // Executa a query
        objSQL.setInt(1, codigo);
        return objSQL.executeQuery();
    }
    
    /**
     * Método que pesquisa o produto pelo nome parametrizado
     * @param nome
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static ResultSet pesquisarProdutoNome(String nome) throws SQLException {
        // Query de busca
        String selectQuerySQL = "SELECT * FROM TABPRODUTOS WHERE UPPER(PRODUTO) LIKE '%' || ? || '%' ORDER BY PRODUTO";
        PreparedStatement objSQL = con.prepareStatement(selectQuerySQL);
        
        // Executa a query
        objSQL.setString(1, "%" + nome.toUpperCase() + "%");
        return objSQL.executeQuery();
    }
    
    /**
     * Método que insere um novo produto no banco
     * @param produto
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public static void incluirProduto(Produto produto) throws SQLException {
        String insertQuerySQL = "INSERT INTO TABPRODUTOS(PRODUTO, CODUNIDADE, PRECO, DATAPRECO) VALUES(?, ?, ?, ?)";
        PreparedStatement objSQL = con.prepareStatement(insertQuerySQL);
        objSQL.setString(1, produto.getNome());
        objSQL.setInt(2, produto.getUnidade());
        objSQL.setDouble(3, produto.getPreco());
        objSQL.setDate(4, produto.getData());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que atualiza os dados de um produto existente no banco
     * @param produto
     * @throws SQLException
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     */
    public static void alterarProduto(Produto produto) throws SQLException {
        String updateQuerySQL = "UPDATE TABPRODUTOS SET PRODUTO = ?, CODUNIDADE = ?, PRECO = ? WHERE CODPRODUTO = ?";
        PreparedStatement objSQL = con.prepareStatement(updateQuerySQL);
        objSQL.setString(1, produto.getNome());
        objSQL.setInt(2, produto.getUnidade());
        objSQL.setDouble(3, produto.getPreco());
        objSQL.setDouble(4, produto.getCodProduto());
        objSQL.executeUpdate();
    }
    
    /**
     * Método que exclui um produto no banco
     * @param codigo
     * @throws SQLException 
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     */
    public static void excluirProduto(int codigo) throws SQLException {
        
        // Verifica se possui vendas para o vendedor
        PreparedStatement selectQuerySQL = con.prepareStatement("SELECT * FROM ITENS WHERE CODPRODUTO = ?");
        selectQuerySQL.setInt(1, codigo);
        ResultSet resposta = selectQuerySQL.executeQuery();
        
        // Se possuir vendas vinculadas, retorna um erro de exceção
        if ( resposta.next() ) {
            throw new SisVendasException("Esse produto possui vendas vinculadas e não poderá ser excluído.");
        } else {
            // Se não possuir vendas vinculadas ao vendedor, exclui-se o vendedor
            String deleteQuerySQL = "DELETE FROM TABPRODUTOS WHERE CODPRODUTO = ?";
            PreparedStatement objSQL = con.prepareStatement(deleteQuerySQL);
            objSQL.setInt(1, codigo);
            objSQL.executeUpdate();
        }
    }
    
    /* ========================================================================================================
     * 5. VENDAS
     * ===================================================================================================== */
}
