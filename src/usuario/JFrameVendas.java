package usuario;

import dados.Cliente;
import dados.Item;
import dados.Produto;
import dados.Venda;
import dados.Vendedor;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.LtpUtil;
import utilitarios.LtpUtilException;


/**
 * Classe do JFrameVendas
 * @author Natasha
 * @since 13/11/16
 * @version 1.0
 */
public class JFrameVendas extends javax.swing.JFrame {
    
    /* Cria uma arrayList para a listagem dos produtos a serem cadastrados */
    private ArrayList<Item> listaItens = new ArrayList<>();
    private DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Método que cria um novo jFrame
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     */
    public JFrameVendas() throws SQLException {
        initComponents();
        this.setSize( 600, 400 );
        setLocationRelativeTo(null);
        setVisible(true);
        
        /* Muda os valores dos combobox do formulário de Inclusão de venda */
        buscarVendedores();
        buscarClientes();
        buscarProdutos();
        
        /* Auxilia no cadastro de itens na jTable */
        tableModel.addColumn("Código do Produto");
        tableModel.addColumn("Nome do Produto");
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Valor");
        
        jTableIncluirVenda.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVendas = new javax.swing.JTabbedPane();
        jPanelIncluir = new javax.swing.JPanel();
        jLabelIncluirNomeVendedor = new javax.swing.JLabel();
        jComboBoxIncluirNomeVendedor = new javax.swing.JComboBox<>();
        jLabelIncluirNomeCliente = new javax.swing.JLabel();
        jComboBoxIncluirNomeCliente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelIncluirNomeProduto = new javax.swing.JLabel();
        jComboBoxIncluirNomeProduto = new javax.swing.JComboBox<>();
        jLabelIncluirQtdProduto = new javax.swing.JLabel();
        jTextFieldIncluirQtdProduto = new javax.swing.JTextField();
        jButtonIncluirVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIncluirVenda = new javax.swing.JTable();
        jButtonConcluirCompra = new javax.swing.JButton();
        jPanelPesquisar = new javax.swing.JPanel();
        jLabelPesquisarCodVenda = new javax.swing.JLabel();
        jTextFieldPesquisarCodVenda = new javax.swing.JTextField();
        jButtonPesquisarCodVenda = new javax.swing.JButton();
        jScrollPanePesquisarCodVenda = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelPesquisarPeriodoVenda = new javax.swing.JLabel();
        jLabelPesquisarInicioPeriodoVenda = new javax.swing.JLabel();
        jLabelPesquisarFinalPeriodoVendas = new javax.swing.JLabel();
        jButtonPesquisarPeriodo = new javax.swing.JButton();
        jScrollPanePeriodo = new javax.swing.JScrollPane();
        jTablePesquisarPeriodoVenda = new javax.swing.JTable();
        jDateChooserIni = new com.toedter.calendar.JDateChooser();
        jDateChooserFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelIncluirNomeVendedor.setText("Vendedor");

        jComboBoxIncluirNomeVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelIncluirNomeCliente.setText("Cliente");

        jComboBoxIncluirNomeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelIncluirNomeProduto.setText("Produto");

        jComboBoxIncluirNomeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelIncluirQtdProduto.setText("Quantidade");

        jButtonIncluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/add.png"))); // NOI18N
        jButtonIncluirVenda.setText("Incluir");
        jButtonIncluirVenda.setBorder(null);
        jButtonIncluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirVendaActionPerformed(evt);
            }
        });

        jTableIncluirVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableIncluirVenda);

        jButtonConcluirCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/basket_add.png"))); // NOI18N
        jButtonConcluirCompra.setText("Concluir Compra");
        jButtonConcluirCompra.setBorder(null);
        jButtonConcluirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIncluirLayout = new javax.swing.GroupLayout(jPanelIncluir);
        jPanelIncluir.setLayout(jPanelIncluirLayout);
        jPanelIncluirLayout.setHorizontalGroup(
            jPanelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIncluirLayout.createSequentialGroup()
                        .addComponent(jLabelIncluirNomeVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxIncluirNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelIncluirNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxIncluirNomeCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIncluirLayout.createSequentialGroup()
                        .addComponent(jLabelIncluirNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jComboBoxIncluirNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelIncluirQtdProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIncluirQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIncluirVenda))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIncluirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConcluirCompra)))
                .addContainerGap())
        );
        jPanelIncluirLayout.setVerticalGroup(
            jPanelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIncluirNomeVendedor)
                    .addComponent(jComboBoxIncluirNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIncluirNomeCliente)
                    .addComponent(jComboBoxIncluirNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIncluirNomeProduto)
                    .addComponent(jComboBoxIncluirNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIncluirQtdProduto)
                    .addComponent(jTextFieldIncluirQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIncluirVenda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConcluirCompra)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPaneVendas.addTab("Incluir", jPanelIncluir);

        jLabelPesquisarCodVenda.setText("Código da Venda");

        jButtonPesquisarCodVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/search.png"))); // NOI18N
        jButtonPesquisarCodVenda.setBorder(null);
        jButtonPesquisarCodVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarCodVendaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPanePesquisarCodVenda.setViewportView(jTable1);

        jLabelPesquisarPeriodoVenda.setText("Período da Venda");

        jLabelPesquisarInicioPeriodoVenda.setText("Início");

        jLabelPesquisarFinalPeriodoVendas.setText("Final");

        jButtonPesquisarPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/search.png"))); // NOI18N
        jButtonPesquisarPeriodo.setBorder(null);
        jButtonPesquisarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarPeriodoActionPerformed(evt);
            }
        });

        jTablePesquisarPeriodoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPanePeriodo.setViewportView(jTablePesquisarPeriodoVenda);

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePesquisarCodVenda)
                    .addComponent(jScrollPanePeriodo)
                    .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisarCodVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisarCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarCodVenda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisarPeriodoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jLabelPesquisarInicioPeriodoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelPesquisarFinalPeriodoVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarPeriodo)))
                .addContainerGap())
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisarCodVenda)
                    .addComponent(jTextFieldPesquisarCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarCodVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanePesquisarCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                        .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPesquisarPeriodoVenda)
                            .addComponent(jLabelPesquisarInicioPeriodoVenda)
                            .addComponent(jLabelPesquisarFinalPeriodoVendas)
                            .addComponent(jButtonPesquisarPeriodo)
                            .addComponent(jDateChooserIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPanePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPaneVendas.addTab("Pesquisar", jPanelPesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVendas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVendas)
        );

        getAccessibleContext().setAccessibleName("Vendas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que pesquisa o código da venda
     * @param evt 
     * @author Natasha Kaweski
     * @since 15/11/16
     * @version 1.0
     */
    private void jButtonPesquisarCodVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarCodVendaActionPerformed
        // Captura o que foi digitado no campo de texto de código
        String codigo = jTextFieldPesquisarCodVenda.getText();
        
        // Validação
        if ( codigo.isEmpty() || !codigo.matches("[0-9]{1,5}") ) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números.");
            return;
        }
        
        // Checkpoint!
        try {
            ResultSet resposta = banco.Banco.pesquisarVendaCodigo(Integer.parseInt(codigo));
            
            if ( resposta.next() ) {
                LtpUtil.loadFormatJTable(jScrollPanePesquisarCodVenda, banco.Banco.pesquisarVendaCodigo(Integer.parseInt(codigo)),false);
            } else {
                JOptionPane.showMessageDialog(this, "Não existe venda para o código digitado.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (LtpUtilException ex) {
            Logger.getLogger(JFrameVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarCodVendaActionPerformed

    /**
     * Método que busca as vendas pelo período parametrizado
     * @param evt 
     * @author Natasha Kaweski
     * @since 15/11/16
     * @version 1.0
     */
    private void jButtonPesquisarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarPeriodoActionPerformed
        // Pega as datas inseridas
//        Date data_inicio = (Date) jDateChooserIni.getDate();
//        Date data_final = (Date) jDateChooserFin.getDate();
        
        Date date_inicio = new java.sql.Date(jDateChooserIni.getDate().getTime());
        Date date_final = new java.sql.Date(jDateChooserFin.getDate().getTime());
        
        try {
            ResultSet resposta = banco.Banco.pesquisarVendaPeriodo(data_inicio, data_final);
            
            if ( resposta.next() ) {
                LtpUtil.loadFormatJTable(jScrollPanePeriodo, banco.Banco.pesquisarVendaPeriodo(data_inicio, data_final),false);
            } else {
                JOptionPane.showMessageDialog(this, "Não existe venda para o período.");
            }
        } catch (SQLException | LtpUtilException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarPeriodoActionPerformed
    
    /**
     * Método que inclui os produtos selecionados na jTable
     * @param evt 
     * @author Natasha Kaweski
     * @since 15/11/16
     * @version 1.0
     */
    private void jButtonIncluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirVendaActionPerformed
        /* Declaração das variáveis e armazenamento de dados */
        String auxProduto = (String) jComboBoxIncluirNomeProduto.getSelectedItem();
        int codProduto = Integer.parseInt(auxProduto.split(" - ")[0]);
        int qnt = Integer.parseInt(jTextFieldIncluirQtdProduto.getText());
        double valor = (qnt * Double.parseDouble(auxProduto.split(" - ")[2].replace("R$", "")));
        
        /* Insere cada item adicionado dentro de uma lista de itens */
        Item item = new Item(codProduto, qnt, valor);
        listaItens.add(item);
        Object [] rowdata = new Object[4];
        
        rowdata[0] = codProduto;
        rowdata[1] = auxProduto.split(" - ")[1];
        rowdata[2] = qnt;
        rowdata[3] = valor;
        
        /* Adiciona o novo item na tabela */
        tableModel.addRow(rowdata);

        /* Limpa os campos antes preenchidos */
        jComboBoxIncluirNomeProduto.setSelectedIndex(-1);
        jTextFieldIncluirQtdProduto.setText("");
    }//GEN-LAST:event_jButtonIncluirVendaActionPerformed

    /**
     * Método que insere os produtos adicionados na jTable no banco de dados
     * @param evt 
     * @author Natasha Kaweski
     * @since 15/11/16
     * @version 1.0
     */
    private void jButtonConcluirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirCompraActionPerformed
        String auxVenda = (String) jComboBoxIncluirNomeVendedor.getSelectedItem(); // Pega o nome do vendedor
        int codVendedor = Integer.parseInt(auxVenda.split(" - ")[0]); // Pega o código do vendedor
        
        String auxCliente = (String) jComboBoxIncluirNomeCliente.getSelectedItem(); // Pega o nome do cliente
        int codCliente = Integer.parseInt(auxCliente.split(" - ")[0]); // Pega o código do cliente
        
        Date data = new Date(System.currentTimeMillis()); // Pega a data atual
        
        // Cria um novo objeto Venda
        Venda venda = new Venda(listaItens, codVendedor, codCliente, data);
      
        try {
            banco.Banco.incluirVenda(venda);
            JOptionPane.showMessageDialog(this, "Venda cadastrada com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(JFrameVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConcluirCompraActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameVendas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConcluirCompra;
    private javax.swing.JButton jButtonIncluirVenda;
    private javax.swing.JButton jButtonPesquisarCodVenda;
    private javax.swing.JButton jButtonPesquisarPeriodo;
    private javax.swing.JComboBox<String> jComboBoxIncluirNomeCliente;
    private javax.swing.JComboBox<String> jComboBoxIncluirNomeProduto;
    private javax.swing.JComboBox<String> jComboBoxIncluirNomeVendedor;
    private com.toedter.calendar.JDateChooser jDateChooserFin;
    private com.toedter.calendar.JDateChooser jDateChooserIni;
    private javax.swing.JLabel jLabelIncluirNomeCliente;
    private javax.swing.JLabel jLabelIncluirNomeProduto;
    private javax.swing.JLabel jLabelIncluirNomeVendedor;
    private javax.swing.JLabel jLabelIncluirQtdProduto;
    private javax.swing.JLabel jLabelPesquisarCodVenda;
    private javax.swing.JLabel jLabelPesquisarFinalPeriodoVendas;
    private javax.swing.JLabel jLabelPesquisarInicioPeriodoVenda;
    private javax.swing.JLabel jLabelPesquisarPeriodoVenda;
    private javax.swing.JPanel jPanelIncluir;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePeriodo;
    private javax.swing.JScrollPane jScrollPanePesquisarCodVenda;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneVendas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableIncluirVenda;
    private javax.swing.JTable jTablePesquisarPeriodoVenda;
    private javax.swing.JTextField jTextFieldIncluirQtdProduto;
    private javax.swing.JTextField jTextFieldPesquisarCodVenda;
    // End of variables declaration//GEN-END:variables

    /* ========================================================================================================
     * FUNÇÕES AUXILIARES
     * ===================================================================================================== */
    
    /**
     * Método que lista os vendedores no combobox de Vendedores
     * @throws SQLException 
     */
    private void buscarVendedores() throws SQLException{
        ArrayList<Vendedor> listaVendedores = banco.Banco.buscarVendedores();
        int codVendedor = 0;
        
        jComboBoxIncluirNomeVendedor.removeAllItems();
        for (Vendedor objVendedores : listaVendedores) {
            jComboBoxIncluirNomeVendedor.addItem(objVendedores.getCodigo() + " - " + objVendedores.getNome());
            codVendedor = objVendedores.getCodigo();
        }
        
        jComboBoxIncluirNomeVendedor.setSelectedIndex(-1);
    }
    
    /**
     * Método que lista os clientes no combobox de Clientes
     * @throws SQLException 
     */
    private void buscarClientes() throws SQLException{
        ArrayList<Cliente> listaClientes = banco.Banco.buscarClientes();
        int codCliente;
        
        jComboBoxIncluirNomeCliente.removeAllItems();
        for (Cliente objCliente : listaClientes) {
            jComboBoxIncluirNomeCliente.addItem(objCliente.getCodCliente() + " - " + objCliente.getNome());
            codCliente = objCliente.getCodCliente();
            
        }
        jComboBoxIncluirNomeCliente.setSelectedIndex(-1);
    }
    
    /**
     * Método que lista os produtos no combobox de Produtos
     * @throws SQLException 
     */
    private void buscarProdutos() throws SQLException{
        ArrayList<Produto> listaProduto = banco.Banco.buscarProduto();
        int codProduto;
        
        jComboBoxIncluirNomeProduto.removeAllItems();
        for (Produto objProduto : listaProduto) {
            jComboBoxIncluirNomeProduto.addItem(objProduto.getCodProduto() + " - " + objProduto.getNome() + " - " + objProduto.getPreco());
            codProduto = objProduto.getCodProduto();
            
        }
        jComboBoxIncluirNomeCliente.setSelectedIndex(-1);
    }
}
