/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entities.Agencia;
import model.entities.Cliente;
import model.entities.Conta;
import model.entities.TipoConta;

/**
 *
 * @author User
 */
public class ContaDB {

    private Conexao conexao;

    public ContaDB(Conexao conexao) {
        this.conexao = conexao;
    }

    public Conta buscarContaByID(Integer codigo, Integer digitoVerificador) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conexao.getConexao().prepareStatement("SELECT * FROM BANCO.CONTAS "
                    + "WHERE CODIGO = ? AND DIGITO_VERIFICADOR = ?");
            st.setInt(1, codigo);
            st.setInt(2, digitoVerificador);
            rs = st.executeQuery();
            Conta conta = new Conta();
            if (rs.next()) {
                conta.setCodigo(rs.getInt("CODIGO"));
                conta.setDigitoVerificador(rs.getInt("DIGITO_VERIFICADOR"));

                TipoConta tipoConta = new TipoConta();
                tipoConta.setCodigo(rs.getInt("id_tipo_conta"));
                conta.setTipoConta(tipoConta);

                Agencia agencia = new Agencia();
                agencia.setCodigo(rs.getInt("id_agencia"));
                conta.setAgencia(agencia);

                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("id_cliente"));
                conta.setCliente(cliente);
                
                conta.setAtivo(rs.getInt("ativo"));
                conta.setSaldo(rs.getDouble("saldo"));
            }
            return conta;
        } catch (SQLException ex) {
            System.err.println("Erro ao buscar conta: " + ex.getMessage());
            return null;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
    }

    public Double getSaldoConta(Integer codigoConta, Integer digitoVerificadorConta) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conexao.getConexao().prepareStatement("SELECT saldo FROM banco.contas "
                    + "WHERE codigo = ? "
                    + "AND digito_verificador = ? ");

            //setta os parametros na query
            st.setInt(1, codigoConta);
            st.setInt(2, digitoVerificadorConta);
            rs = st.executeQuery();
            rs.next();
            return rs.getDouble("saldo");
        } catch (SQLException ex) {
            System.err.println("Erro ao buscar saldo da conta: " + ex.getMessage());
            return null;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
    }

    public Boolean validarSenha(String senha, Integer codigoConta) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conexao.getConexao().prepareStatement("SELECT senha FROM banco.contas "
                                                        + "WHERE codigo = ? ");
            st.setInt(1, codigoConta);
            rs = st.executeQuery();
            rs.next();
            if (rs.getString("senha").equals(senha)) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao validar senha: " + ex.getMessage());
            return null;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
    }

    public Boolean sacar(Double valorSaque, Integer codigoConta) {
        PreparedStatement st = null;

        try {
            st = conexao.getConexao().prepareStatement("UPDATE banco.contas "
                    + "SET saldo = saldo - ? "
                    + "WHERE codigo = ? ");
            st.setDouble(1, valorSaque);
            st.setInt(2, codigoConta);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao buscar saldo da conta: " + ex.getMessage());
            return false;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }
    }
    
    public Boolean depositar(Double valorDeposito, Integer codigoConta){        
        PreparedStatement st = null;
        
        try {
            st = conexao.getConexao().prepareStatement("UPDATE banco.contas "
                                                     + "SET saldo = saldo + ? "
                                                     + "WHERE codigo = ? ");
            st.setDouble(1, valorDeposito);
            st.setInt(2, codigoConta);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao realizar depósito: " + ex.getMessage());
            return false;
        }
    }
    
    public Boolean transferencia(Integer codigoContaOrigem, Integer codigoContaDestino, Double valor){
        PreparedStatement st = null;
        String sqlOrigem = "UPDATE banco.contas "
                          +" SET saldo = saldo - ? "
                          + " WHERE codigo = ? ";
        
        String sqlDestino = "UPDATE banco.contas "
                          + " SET saldo = saldo + ? "
                          + " WHERE codigo = ? ";
        
        try {
            st = conexao.getConexao().prepareStatement(sqlOrigem);
            st.setDouble(1, valor);
            st.setInt(2, codigoContaOrigem);
            st.executeUpdate();
            
            st = conexao.getConexao().prepareStatement(sqlDestino);
            st.setDouble(1, valor);
            st.setInt(2, codigoContaDestino);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger("Erro ao realizar transferencia: ", ex.getMessage());
            return false;
        }finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex.getMessage());
            }
        }        
    }
}
