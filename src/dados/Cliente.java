package dados;

import java.sql.Date;

/**
 * Classe do Cliente
 * @author Natasha Kaweski
 * @version 2.0
 * @since 30 de outubro de 2016
 */
public class Cliente {
    
    private int codCliente;
    private String nome;
    private String endereço;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String email;
    private Date data;
    
    /**
     * Método constutor da classe Cliente
     * @param codCliente
     * @param nome
     * @param endereço
     * @param bairro
     * @param cidade
     * @param uf
     * @param cep
     * @param telefone
     * @param email
     * @param dataCadCliente
     */
    
    public Cliente(int codCliente, String nome, String endereço, String bairro, String cidade, String uf, String cep, String telefone, String email, Date dataCadCliente) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.endereço = endereço;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.data = dataCadCliente;
    }
    
    /*
    Getters e Setters
    */
    
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        
        return "Codigo do cliente: " + codCliente+ "\n" +
        "Nome: " + nome.trim() + "\n" + 
        "Endereço: " + endereço.trim() + "\n" +
        "Bairro: " + bairro.trim() + "\n" +
        "Cidade: " + cidade.trim() + "\n" +
        "UF: " + uf.trim() + "\n" +
        "CEP: " + cep.trim() + "\n" +
        "Telefone: " + telefone.trim() + "\n" + 
        "Email: " + email.trim() + "\n" +
        "Data do Cadastro do Cliente: " + data;
        
    }
    
}
