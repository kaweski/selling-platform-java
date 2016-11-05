package dados;

import java.sql.Date;

/**
 * Classe do Vendedor
 * @author Natasha Kaweski
 * @version 2.0
 * @since 30 de outubro de 2016
 */
public class Vendedor {
    
    private int codigo;
    private String nome;
    private Date data;

    public Vendedor(int codVendedor, String nomeVendedor, java.sql.Date dataCadVendedor) {
        this.codigo = codVendedor;
        this.nome = nomeVendedor;
        this.data = dataCadVendedor;
    }
    
    /*
    Getters e Setters
    */
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        "Nome: " + nome .trim() + "\n" + 
        "Data de cadastro do vendedor: " + data;
                
    }
    
}
