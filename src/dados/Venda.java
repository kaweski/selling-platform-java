/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;

/**
 * Classe de Venda
 * @author Natasha
 * @version 1.0
 * @since 30 de outubro de 2016
 */
public class Venda {

    private int codVenda;
    private int codVendedor;
    private int codCliente;
    private Date dataVenda;

    public Venda(int codVenda, int codVendedor, int codCliente, java.sql.Date dataVenda) {
        this.codVenda = codVenda;
        this.codVendedor = codVendedor;
        this.codCliente = codCliente;
        this.dataVenda = dataVenda;
    }
    
    /*
    Getters e Setters
    */
    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    /*
    Função toString()
    */
    @Override
    public String toString() {
        return
        "Código da venda: " + codVenda + "\n"+
        "Código da venda: " + codVendedor + "\n"+
        "Código da venda: " + codCliente+ "\n"+
        "Data da Venda: " + dataVenda;

    }
    
}
