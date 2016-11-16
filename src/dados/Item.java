package dados;

/**
 * Classe do Cliente
 * @author Natasha Kaweski
 * @version 1.0
 * @since 15/11/16
 */
public class Item {
    
    private int cod_item;
    private int codVenda;
    private int codProduto;
    private int quantidade;
    private double valor;

    /**
     * Método construtor da classe Item
     * @param codProduto
     * @param quantidade
     * @param valor 
     */
    public Item(int codProduto, int quantidade, double valor) {
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    /*
    Getters e Setters
    */
    
    public int getCod_item() {
        return cod_item;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /*
    Função toString()
    */
    @Override
    public String toString() {
        return "Item{" + "cod_item=" + cod_item + ", codVenda=" + codVenda + ", codProduto=" + codProduto + ", quantidade=" + quantidade + ", valor=" + valor + '}';
    }
    
    
    
}
