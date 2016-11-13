/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erro;

import java.sql.SQLException;

/**
 * Classe para tratamento de erro de exceção
 * @throws SQLException 
 * @author Natasha Kaweski
 * @since 11/11/16
 * @version 1.0
 */
public class SisVendasException extends SQLException {

    /**
     * Metodo construtor que retorna a mensagem de exceção
     * @param motivo
     */
    public SisVendasException(String motivo) {
        super(motivo);
    }
    
}
