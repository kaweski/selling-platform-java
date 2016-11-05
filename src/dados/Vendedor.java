/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;

/**
 * Classe do Vendedor
 * @author Natasha
 * @version 1.0
 * @since 30 de outubro de 2016
 */
public class Vendedor {
    
    private int codVendedor;
    private String nomeVendedor;
    private Date dataCadVendedor;

    public Vendedor(int codVendedor, String nomeVendedor, java.sql.Date dataCadVendedor) {
        this.codVendedor = codVendedor;
        this.nomeVendedor = nomeVendedor;
        this.dataCadVendedor = dataCadVendedor;
    }
    
    /*
    Getters e Setters
    */
    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Date getDataCadVendedor() {
        return dataCadVendedor;
    }

    public void setDataCadVendedor(Date dataCadVendedor) {
        this.dataCadVendedor = dataCadVendedor;
    }
    
    /*
    Função toString()
    */
    @Override
    public String toString() {       
        
        return 
        "Nome: " + nomeVendedor .trim() + "\n" + 
        "Data de cadastro do vendedor: " + dataCadVendedor;
                
    }
    
}
