/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Conexao {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String BD = "jdbc:mysql://localhost:3306/banco";
    private final String USUARIO = "root";
    private final String SENHA = "";

    private static Connection conexao;

    public Conexao() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexao = (Connection) DriverManager.getConnection(BD, USUARIO, SENHA);
        } catch (SQLException ex) {
            conexao = null;
            System.err.println("Erro ao conectar no banco de dados: " + ex.getMessage());
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.err.println("Erro ao fechar conexão com o banco de dados: " + ex.getMessage());
        }
    }
}
