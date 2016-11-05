package dados;

import java.sql.Date;
import utilitarios.LtpUtil;

/**
 * Classe do Produto
 * @author Natasha Kaweski
 * @version 2.1
 * @since 30 de outubro de 2016
 */
public class Produto {

    private int codProduto;
    private String nome;
    private int unidade;
    private double preco;
    private Date data;
    
    /**
     * Método construtor da classe Produto
     * @param codProduto
     * @param nome
     * @param codUnidade
     * @param precoUnit
     * @param dataPreco 
     */
    
    public Produto(int codProduto, String nome, int codUnidade, double precoUnit, java.sql.Date dataPreco) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.unidade = codUnidade;
        this.preco = precoUnit;
        this.data = dataPreco;
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

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    /*
    Função toString()
    */
    
    @Override
    public String toString() {
        
        return 
        "Produto: " + nome.trim() + "\n"    
        + "Preço Unitario: " + LtpUtil.formatarValor(preco, "R$ #,##0.00") + "\n" 
        + "Data de Cadastro: " + data ;
                
    }
    
}
