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
public class Conta {

    private Integer codigo;
    private Integer digitoVerificador;
    private TipoConta tipoConta;
    private Agencia agencia;
    private Cliente cliente;
    private Double saldo;
    private Integer ativo;

    public Conta() {
    }

    public Conta(Integer codigo, Integer digitoVerificador, TipoConta tipoConta, Agencia agencia, Cliente cliente, Double saldo) {
        this.codigo = codigo;
        this.digitoVerificador = digitoVerificador;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(Integer digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", digitoVerificador=" + digitoVerificador + ", tipoConta=" + tipoConta + ", agencia=" + agencia + ", cliente=" + cliente + ", saldo=" + saldo + ", ativo=" + ativo + '}';
    }
}
