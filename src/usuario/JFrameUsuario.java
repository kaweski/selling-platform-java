/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author Natasha
 */
public class JFrameUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFrameUsuario
     */
    public JFrameUsuario() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize( 600, 400 );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVendas = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemArquivoSobre = new javax.swing.JMenuItem();
        jMenuItemArquivoSair = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatoriosVendas = new javax.swing.JMenuItem();
        jMenuItemRelatoriosProdutos = new javax.swing.JMenuItem();
        jMenuItemRelatoriosClientes = new javax.swing.JMenuItem();
        jMenuItemRelatoriosVendedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        jButtonVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/basket.png"))); // NOI18N
        jButtonVendas.setText("Vendas");
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });

        jButtonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/book_bookmarks.png"))); // NOI18N
        jButtonProdutos.setText("Produtos");

        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/users.png"))); // NOI18N
        jButtonClientes.setText("Clientes");
        jButtonClientes.setToolTipText("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/user_business.png"))); // NOI18N
        jButton1.setText("Vendedores");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel1.setText("Naweskil © Copyright 2016");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema de Vendas");

        jMenuArquivo.setText("Arquivo");

        jMenuItemArquivoSobre.setText("Sobre");
        jMenuItemArquivoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArquivoSobreActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemArquivoSobre);

        jMenuItemArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.META_MASK));
        jMenuItemArquivoSair.setText("Sair");
        jMenuItemArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArquivoSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemArquivoSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemRelatoriosVendas.setText("Vendas");
        jMenuRelatorios.add(jMenuItemRelatoriosVendas);

        jMenuItemRelatoriosProdutos.setText("Produtos");
        jMenuRelatorios.add(jMenuItemRelatoriosProdutos);

        jMenuItemRelatoriosClientes.setText("Clientes");
        jMenuRelatorios.add(jMenuItemRelatoriosClientes);

        jMenuItemRelatoriosVendedores.setText("Vendedores");
        jMenuRelatorios.add(jMenuItemRelatoriosVendedores);

        jMenuBar1.add(jMenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addComponent(jButtonVendas)
                .addGap(18, 18, 18)
                .addComponent(jButtonProdutos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClientes)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArquivoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemArquivoSairActionPerformed

    private void jMenuItemArquivoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArquivoSobreActionPerformed
        JDialogUsuarioSobre sobre = new JDialogUsuarioSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemArquivoSobreActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed

    }//GEN-LAST:event_jButtonVendasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemArquivoSair;
    private javax.swing.JMenuItem jMenuItemArquivoSobre;
    private javax.swing.JMenuItem jMenuItemRelatoriosClientes;
    private javax.swing.JMenuItem jMenuItemRelatoriosProdutos;
    private javax.swing.JMenuItem jMenuItemRelatoriosVendas;
    private javax.swing.JMenuItem jMenuItemRelatoriosVendedores;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables
}
