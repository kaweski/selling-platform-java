package inicio;

import banco.Banco;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import usuario.JFrameUsuario;

/**
 * Método Main - Principal
 * @author Natasha
 * @version 1.0
 * @since 30 de outubro de 2016
 */
public class Main {

    public static void main(String[] args) {
        try {
            Banco.abrirConexao();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, e.getMessage(), "Controle de Vendas", JOptionPane.ERROR_MESSAGE );
            System.exit(1);
        }
        
        new JFrameUsuario();
    }
    
}
