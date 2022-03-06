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
public class Cliente {

    private Integer codigo;
    private String nome;
    private String cpf;

    public Cliente() {
    }

    public Cliente(Integer codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

}
