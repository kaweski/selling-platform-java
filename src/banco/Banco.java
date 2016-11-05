/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.firebirdsql.jdbc.FBDriver;

/**
 * Classe geral de conexão com banco de dados
 * @author Natasha
 */
public class Banco {
    public static Connection con;
    
    /**
     * Método que abre conexão com banco de dados
     * @throws SQLException 
     */
    public static void abrirConexao() throws SQLException{
        DriverManager.registerDriver(new FBDriver());
        con = DriverManager.getConnection(
            "jdbc:firebirdsql:127.0.0.1/3050:/Users/Natasha/Desktop/VENDAS.FDB", 
            "SYSDBA", "masterkey");
    }
    
    /**
     * Método que fecha conexão com banco de dados
     * @throws SQLException 
     */
    public static void fecharConexao() throws SQLException{
        con.close();
    }
}
