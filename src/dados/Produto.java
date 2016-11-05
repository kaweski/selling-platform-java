/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;
import utilitarios.LtpUtil;

/**
 * Classe do Produto
 * @author Natasha
 * @version 1.0
 * @since 30 de outubro de 2016
 */
public class Produto {

    private int codProduto;
    private String nome;
    private int codUnidade;
    private double precoUnit;
    private Date dataPreco;

    public Produto(int codProduto, String nome, int codUnidade, double precoUnit, java.sql.Date dataPreco) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.codUnidade = codUnidade;
        this.precoUnit = precoUnit;
        this.dataPreco = dataPreco;
    }
    
    /*
    Getters e Setters
    */
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public Date getDataPreco() {
        return dataPreco;
    }

    public void setDataPreco(Date dataPreco) {
        this.dataPreco = dataPreco;
    }
    
    /*
    Função toString()
    */
    @Override
    public String toString() {
        
        return 
        "Produto: " + nome.trim() + "\n"    
        + "Preço Unitario: " + LtpUtil.formatarValor(precoUnit, "R$ #,##0.00") + "\n" 
        + "Data de Cadastro: " + dataPreco ;
                
    }
    
}
