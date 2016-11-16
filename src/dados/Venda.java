package dados;

import java.sql.Date;
import java.util.ArrayList;
import utilitarios.LtpUtil;

/**
 * Classe de Venda
 * @author Natasha Kaweski
 * @version 2.0
 * @since 30 de outubro de 2016
 */
public class Venda {

    private int codVenda;
    private int codVendedor;
    private int codCliente;
    private Date dataVenda;
    private ArrayList<Item> listaItem = new ArrayList<>();

    /**
     * Método construtor normal
     * @param codVenda
     * @param codVendedor
     * @param codCliente
     * @param dataVenda 
     */
    public Venda(int codVenda, int codVendedor, int codCliente, Date dataVenda) {
        this.codVenda = codVenda;
        this.codVendedor = codVendedor;
        this.codCliente = codCliente;
        this.dataVenda = dataVenda;
    }
    
    /**
     * Método construtor com arrayList
     * @param listaItem
     * @param codVendedor
     * @param codCliente
     * @param dataVenda 
     */
    public Venda(ArrayList<Item> listaItem, int codVendedor, int codCliente, Date dataVenda) {
        this.listaItem = listaItem;
        this.codVendedor = codVendedor;
        this.codCliente = codCliente;
        this.dataVenda = dataVenda;
    }
    
    /*
    Getters e Setters
    */
    
    public ArrayList<Item> getListaItem() {
        return listaItem;
    }

    public void setListaItem(ArrayList<Item> listaItem) {
        this.listaItem = listaItem;
    }
    
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
        "Data da Venda: " + LtpUtil.formatarData(dataVenda, "dd/MM/YYYY");

    }
    
}
