package dados;

import java.sql.Date;

/**
 * Classe do Cliente
 * @author Natasha Kaweski
 * @version 2.1
 * @since 30 de outubro de 2016
 */
public class Cliente {
    
    private int codCliente;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String email;
    private Date dataCadCliente;
    
    /**
     * Método constutor da classe Cliente
     * @param codCliente
     * @param nome
     * @param endereco
     * @param bairro
     * @param cidade
     * @param uf
     * @param cep
     * @param telefone
     * @param email
     * @param dataCadCliente
     */
    
    public Cliente(int codCliente, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, Date dataCadCliente) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.dataCadCliente = dataCadCliente;
    }

//    public Cliente(int codigo, String nome, String endereco, String bairro, String cidade, String estado, String cep, Date data) {
//        this.codCliente = codigo;
//        this.nome = nome;
//        this.endereco = endereco;
//        this.bairro = bairro;
//        this.cidade = cidade;
//        this.uf = estado;
//        this.cep = cep;
//        this.dataCadCliente = data;
//    }
    
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public Date getDataCadCliente() {
        return dataCadCliente;
    }

    public void setDataCadCliente(Date dataCadCliente) {
        this.dataCadCliente = dataCadCliente;
    }
    
    /*
    Função toString()
    */
    
    @Override
    public String toString() {
        
        return "Codigo do cliente: " + codCliente+ "\n" +
        "Nome: " + nome.trim() + "\n" + 
        "Endereço: " + endereco.trim() + "\n" +
        "Bairro: " + bairro.trim() + "\n" +
        "Cidade: " + cidade.trim() + "\n" +
        "UF: " + uf.trim() + "\n" +
        "CEP: " + cep.trim() + "\n" +
        "Telefone: " + telefone.trim() + "\n" + 
        "Email: " + email.trim() + "\n" +
        "Data do Cadastro do Cliente: " + dataCadCliente;
        
    }
    
}
