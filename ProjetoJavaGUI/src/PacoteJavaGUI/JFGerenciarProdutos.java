/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJavaGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO_INFO
 */
public class JFGerenciarProdutos extends javax.swing.JFrame {

    /**
     * Creates new form Erro
     */
    public JFGerenciarProdutos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltarProdutos = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnProcurarNome = new javax.swing.JButton();
        txtProcurarNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbtProdutos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Produtos");
        setIconImages(null);

        jLabel1.setText("Cód.Barras:");

        jLabel2.setText("Nome do Produto:");

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnCadastrar.setMnemonic('c');
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setMnemonic('a');
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setMnemonic('e');
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltarProdutos.setMnemonic('v');
        btnVoltarProdutos.setText("Voltar");
        btnVoltarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdutosActionPerformed(evt);
            }
        });

        btnInserir.setMnemonic('i');
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(15, 15, 15)
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btnVoltarProdutos)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltarProdutos)
                    .addComponent(btnInserir))
                .addGap(22, 22, 22))
        );

        jRadioButton1.setText("Cod.Barras");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Por Nome:");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnProcurarNome.setMnemonic('p');
        btnProcurarNome.setText("Procurar");
        btnProcurarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço");

        jLabel5.setText("Marca");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/computador.png"))); // NOI18N

        TbtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod.Barras", "Nome", "Preço", "Marca"
            }
        ));
        jScrollPane2.setViewportView(TbtProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtProcurarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3))
                                        .addGap(10, 10, 10)
                                        .addComponent(btnProcurarNome)))
                                .addGap(65, 65, 65))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMarca))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNome))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProcurarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcurarNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        JOptionPane.showMessageDialog(null, "Deseja Cadastrar um Novo Produto?");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnProcurarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcurarNomeActionPerformed

    private void btnVoltarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdutosActionPerformed
       JFMenuPrincipal voltarmenu = new JFMenuPrincipal();
       
       voltarmenu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnVoltarProdutosActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JOptionPane.showMessageDialog(null, "Deseja Inserir esse Produto ao Sistema?");
        
        String Codigo = txtCodigo.getText();
        String Nome = txtNome.getText();
        String Preco = txtPreco.getText();
        String Marca = txtMarca.getText();
        
        TbtProdutos.setValueAt(Codigo, 0, 0);
        TbtProdutos.setValueAt(Nome, 0, 1);
        TbtProdutos.setValueAt(Preco, 0, 2);
        TbtProdutos.setValueAt(Marca, 0, 3);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        JOptionPane.showMessageDialog(null, "Deseja Excluir esse produto Produto?");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        JOptionPane.showMessageDialog(null, "Deseja Alterar esse Produto?");
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbtProdutos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnProcurarNome;
    private javax.swing.JButton btnVoltarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProcurarNome;
    // End of variables declaration//GEN-END:variables
}
