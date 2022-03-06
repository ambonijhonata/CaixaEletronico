/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author User
 */
public class Agencia {
    private Integer codigo;
    private String cnpj;
    private String endereco;
    private Banco banco;

    public Agencia() {
    }

    public Agencia(Integer codigo, String cnpj, String endereco, Banco banco) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.banco = banco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Agencia{" + "codigo=" + codigo + ", cnpj=" + cnpj + ", endereco=" + endereco + '}';
    }        
}
