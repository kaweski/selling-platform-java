/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;

/**
 * Classe do Cliente
 * @author Natasha
 * @version 1.0
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
    private Date dataCadCliente;
    
    public Cliente(int codCliente, String nome, String endereço, String bairro, String cidade, String uf, String cep, String telefone, String email, java.sql.Date dataCadCliente) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.endereço = endereço;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.dataCadCliente = dataCadCliente;
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
        "Endereço: " + endereço.trim() + "\n" +
        "Bairro: " + bairro.trim() + "\n" +
        "Cidade: " + cidade.trim() + "\n" +
        "UF: " + uf.trim() + "\n" +
        "CEP: " + cep.trim() + "\n" +
        "Telefone: " + telefone.trim() + "\n" + 
        "Email: " + email.trim() + "\n" +
        "Data do Cadastro do Cliente: " + dataCadCliente;
        
    }
    
}
