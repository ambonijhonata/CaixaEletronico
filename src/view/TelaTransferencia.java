/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import dao.ContaDB;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.entities.Conta;

/**
 *
 * @author User
 */
public class TelaTransferencia extends javax.swing.JFrame {

    /**
     * Creates new form TelaTransferencia
     */
    public TelaTransferencia() {
        initComponents();
        txtCodigoContaOrigem.setEnabled(false);
        txtDVContaOrigem.setEnabled(false);
    }

    Conta contaOrigem = new Conta();

    public void guardarConta(Conta conta) {
        this.contaOrigem.setCodigo(conta.getCodigo());
        this.contaOrigem.setDigitoVerificador(conta.getDigitoVerificador());
        this.contaOrigem.setTipoConta(conta.getTipoConta());
        this.contaOrigem.setAgencia(conta.getAgencia());
        this.contaOrigem.setCliente(conta.getCliente());
        this.contaOrigem.setSaldo(conta.getSaldo());
    }

    public String mensagemSenha() {
        JLabel labelMensagem = new JLabel("Digite a senha: ");
        JPasswordField txtSenha = new JPasswordField();
        JOptionPane.showConfirmDialog(null, new Object[]{labelMensagem, txtSenha}, "Senha: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        txtSenha.requestFocus();
        String senha = new String(txtSenha.getPassword());
        return senha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblContaOrigem = new javax.swing.JLabel();
        txtCodigoContaOrigem = new javax.swing.JTextField();
        txtDVContaOrigem = new javax.swing.JTextField();
        lblHifenSeparadorContaOrigem = new javax.swing.JLabel();
        pnlDadosDestinoTransferencia = new javax.swing.JPanel();
        lblTituloDadosTransferencia = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoContaDestino = new javax.swing.JTextField();
        lblHifenSeparadorContaDestino = new javax.swing.JLabel();
        txtDVContaDestino = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer??ncia");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblContaOrigem.setText("Conta origem: ");

        txtCodigoContaOrigem.setEditable(false);

        txtDVContaOrigem.setEditable(false);

        lblHifenSeparadorContaOrigem.setText("-");

        pnlDadosDestinoTransferencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloDadosTransferencia.setText("Informe os dados da transfer??ncia:");

        lblCodigo.setText("Conta:");

        lblHifenSeparadorContaDestino.setText("-");

        lblValor.setText("Valor:");

        javax.swing.GroupLayout pnlDadosDestinoTransferenciaLayout = new javax.swing.GroupLayout(pnlDadosDestinoTransferencia);
        pnlDadosDestinoTransferencia.setLayout(pnlDadosDestinoTransferenciaLayout);
        pnlDadosDestinoTransferenciaLayout.setHorizontalGroup(
            pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosDestinoTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloDadosTransferencia)
                    .addGroup(pnlDadosDestinoTransferenciaLayout.createSequentialGroup()
                        .addGroup(pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosDestinoTransferenciaLayout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosDestinoTransferenciaLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHifenSeparadorContaDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDVContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlDadosDestinoTransferenciaLayout.setVerticalGroup(
            pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosDestinoTransferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDadosTransferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHifenSeparadorContaDestino)
                    .addComponent(txtDVContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosDestinoTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblContaOrigem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHifenSeparadorContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDVContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDadosDestinoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransferir)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContaOrigem)
                    .addComponent(txtDVContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHifenSeparadorContaOrigem))
                .addGap(18, 18, 18)
                .addComponent(pnlDadosDestinoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransferir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtCodigoContaOrigem.setText(Integer.toString(contaOrigem.getCodigo()));
        txtDVContaOrigem.setText(Integer.toString(contaOrigem.getDigitoVerificador()));
    }//GEN-LAST:event_formWindowOpened

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
        Conexao conexao = new Conexao();

        if (!txtCodigoContaDestino.getText().equals("") && !txtDVContaDestino.getText().equals("")) {
            if (txtValor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor informe o valor da transfer??ncia.", "Aten????o", JOptionPane.WARNING_MESSAGE);
                txtValor.requestFocus();
            } else {
                Integer codigoContaDestino = Integer.parseInt(txtCodigoContaDestino.getText());
                Integer DVContaDestino = Integer.parseInt(txtDVContaDestino.getText());
                Double valor = Double.parseDouble(txtValor.getText());
                Boolean sucesso = false;
                String senha = null;
                ContaDB contaDB = new ContaDB(conexao);
                Conta contaDestino = new Conta();
                contaDestino = contaDB.buscarContaByID(codigoContaDestino, DVContaDestino);

                if (contaDestino.getCodigo() != null && contaDestino.getDigitoVerificador() != null && contaDestino.getAtivo() == 1 && contaOrigem.getCodigo() != contaDestino.getCodigo()) {
                    if (valor > 0) {
                        if (contaOrigem.getSaldo() >= valor) {
                            sucesso = false;
                            senha = new String(mensagemSenha());
                            if (contaDB.validarSenha(senha, contaOrigem.getCodigo())) {
                                sucesso = contaDB.transferencia(contaOrigem.getCodigo(), codigoContaDestino, valor);
                                if (sucesso) {
                                    JOptionPane.showMessageDialog(null, "Transfer??ncia realizada com sucesso.", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro ao realizar a transfer??ncia. Tente novamente mais tarde.", "Erro", JOptionPane.ERROR_MESSAGE);
                                    this.dispose();
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Senha inv??lida.", "Aten????o", JOptionPane.WARNING_MESSAGE);
                            }                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo inv??lido.", "Aten????o", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor informe o valor da transfer??ncia.", "Aten????o", JOptionPane.WARNING_MESSAGE);
                        txtValor.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Conta inv??lida.", "Aten????o", JOptionPane.WARNING_MESSAGE);
                    txtCodigoContaDestino.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor informe os dados da conta de destino.", "Aten????o", JOptionPane.WARNING_MESSAGE);
            txtCodigoContaDestino.requestFocus();
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContaOrigem;
    private javax.swing.JLabel lblHifenSeparadorContaDestino;
    private javax.swing.JLabel lblHifenSeparadorContaOrigem;
    private javax.swing.JLabel lblTituloDadosTransferencia;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlDadosDestinoTransferencia;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtCodigoContaDestino;
    private javax.swing.JTextField txtCodigoContaOrigem;
    private javax.swing.JTextField txtDVContaDestino;
    private javax.swing.JTextField txtDVContaOrigem;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
