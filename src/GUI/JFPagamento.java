/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author luans
 */
public class JFPagamento extends javax.swing.JFrame {

    /**
     * Creates new form JFPagamento
     */
    public JFPagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPagamento = new javax.swing.JPanel();
        lblIcone = new javax.swing.JLabel();
        lblPagamento = new javax.swing.JLabel();
        pnlFormaPagamentp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFormaPagamento = new javax.swing.JTable();
        btnSelecionarPagamento = new javax.swing.JButton();
        txtCartao = new javax.swing.JTextField();
        lblCartao = new javax.swing.JLabel();
        pnlEndereco = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEndereco = new javax.swing.JTable();
        btnSelecionarEndereco = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPagamento.setBackground(new java.awt.Color(93, 172, 189));

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aromayIcon.png"))); // NOI18N

        lblPagamento.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        lblPagamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPagamento.setText("COMO DESEJA PAGAR?");

        pnlFormaPagamentp.setBackground(new java.awt.Color(93, 172, 189));
        pnlFormaPagamentp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Forma de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        tblFormaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero do Cartao", "Codigo Segurança", "Validade", "Titular"
            }
        ));
        tblFormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFormaPagamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFormaPagamento);
        if (tblFormaPagamento.getColumnModel().getColumnCount() > 0) {
            tblFormaPagamento.getColumnModel().getColumn(0).setResizable(false);
            tblFormaPagamento.getColumnModel().getColumn(1).setResizable(false);
            tblFormaPagamento.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSelecionarPagamento.setText("Selecionar");
        btnSelecionarPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecionarPagamentoMouseClicked(evt);
            }
        });

        lblCartao.setText("Escolhido:");

        javax.swing.GroupLayout pnlFormaPagamentpLayout = new javax.swing.GroupLayout(pnlFormaPagamentp);
        pnlFormaPagamentp.setLayout(pnlFormaPagamentpLayout);
        pnlFormaPagamentpLayout.setHorizontalGroup(
            pnlFormaPagamentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormaPagamentpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormaPagamentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormaPagamentpLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormaPagamentpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionarPagamento))))
        );
        pnlFormaPagamentpLayout.setVerticalGroup(
            pnlFormaPagamentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormaPagamentpLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormaPagamentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarPagamento)
                    .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCartao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEndereco.setBackground(new java.awt.Color(93, 172, 189));
        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Endereco para entrega", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        tblEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ));
        tblEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnderecoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEndereco);
        if (tblEndereco.getColumnModel().getColumnCount() > 0) {
            tblEndereco.getColumnModel().getColumn(0).setResizable(false);
            tblEndereco.getColumnModel().getColumn(1).setResizable(false);
            tblEndereco.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSelecionarEndereco.setText("Selecionar");
        btnSelecionarEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecionarEnderecoMouseClicked(evt);
            }
        });

        lblEndereco.setText("Endereco:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco)
                        .addGap(28, 28, 28)
                        .addComponent(btnSelecionarEndereco))))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)))
        );

        btnFinalizar.setText("FINALIZAR");

        javax.swing.GroupLayout pnlPagamentoLayout = new javax.swing.GroupLayout(pnlPagamento);
        pnlPagamento.setLayout(pnlPagamentoLayout);
        pnlPagamentoLayout.setHorizontalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFormaPagamentp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblIcone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPagamento))
                    .addGroup(pnlPagamentoLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPagamentoLayout.setVerticalGroup(
            pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPagamentoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFormaPagamentp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFormaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFormaPagamentoMouseClicked
        // TODO add your handling code here:
        txtCartao.setText((String) tblFormaPagamento.getValueAt(tblFormaPagamento.getSelectedRow(),0));
    }//GEN-LAST:event_tblFormaPagamentoMouseClicked

    private void btnSelecionarPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarPagamentoMouseClicked
        // TODO add your handling code here:
        
        if (txtCartao.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor, selecione uma forma de pagamento!");
        }else{
        
        }
    }//GEN-LAST:event_btnSelecionarPagamentoMouseClicked

    private void tblEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnderecoMouseClicked
        // TODO add your handling code here:
                txtEndereco.setText((String) tblEndereco.getValueAt(tblEndereco.getSelectedRow(),0));
    }//GEN-LAST:event_tblEnderecoMouseClicked

    private void btnSelecionarEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarEnderecoMouseClicked
        // TODO add your handling code here:
                if (txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor, selecione um endereço para a entrega!");
        }else{
        
        }
    }//GEN-LAST:event_btnSelecionarEnderecoMouseClicked

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
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSelecionarEndereco;
    private javax.swing.JButton btnSelecionarPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCartao;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JPanel pnlFormaPagamentp;
    private javax.swing.JPanel pnlPagamento;
    private javax.swing.JTable tblEndereco;
    private javax.swing.JTable tblFormaPagamento;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtEndereco;
    // End of variables declaration//GEN-END:variables
}
