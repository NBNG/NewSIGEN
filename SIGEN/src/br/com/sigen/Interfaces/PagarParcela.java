/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

import br.com.sigen.Editor.Editor;
import br.com.sigen.Modelo.Parcela;
import br.com.sigen.dao.DAO;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author matteus
 */
public class PagarParcela extends javax.swing.JFrame {

    /**
     * Creates new form PagarParcela
     */
    Parcela parcela;
    private String caracteres = "0987654321.,";
    JDesktopPane painel;
    ListarParcelas lista;
    DAO<Parcela> parceladao;

    public PagarParcela(Parcela parcela, JDesktopPane painel,
            ListarParcelas lista) {
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/br/com/sigen/Imagens/icone.png")));
        this.parcela = parcela;
        this.painel = painel;
        this.lista = lista;
        pupulateFields(this.parcela);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLDataVenda = new javax.swing.JLabel();
        jLValorVenda = new javax.swing.JLabel();
        jLDataParcela = new javax.swing.JLabel();
        jLValorParcela = new javax.swing.JLabel();
        jCBPago = new javax.swing.JCheckBox();
        jRBDesconto = new javax.swing.JRadioButton();
        jRBJuros = new javax.swing.JRadioButton();
        jTValor = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pagamento de Parcela (Carnê)");

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente: ");

        jLDataVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataVenda.setText("Data da Venda:");

        jLValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValorVenda.setText("Valor da Venda: ");

        jLDataParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataParcela.setText("Data da Parcela: ");

        jLValorParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValorParcela.setText("Valor da Parcela:");

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setText("Pago");

        jRBDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBDesconto.setText("Desconto");

        jRBJuros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBJuros.setText("Juros");

        jTValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTValor.setToolTipText("Informar o valor em %");
        jTValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorKeyTyped(evt);
            }
        });

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBJuros)
                                    .addComponent(jRBDesconto)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLDataParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLValorParcela, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBPago)
                                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLCabecalho)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(30, 30, 30)
                .addComponent(jLCliente)
                .addGap(18, 18, 18)
                .addComponent(jLDataVenda)
                .addGap(18, 18, 18)
                .addComponent(jLValorVenda)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataParcela)
                    .addComponent(jLValorParcela))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBDesconto)
                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBJuros)
                    .addComponent(jCBPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTValorKeyTyped

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (jRBDesconto.isSelected()) {
            Double valor = parcela.getValor();
            Double porcentagem = Double.parseDouble(jTValor.getText());
            valor = valor - ((valor * porcentagem) / 100);
            parcela.setValor(valor);
        } else if (jRBJuros.isSelected()) {
            Double valor = parcela.getValor();
            Double porcentagem = Double.parseDouble(jTValor.getText());
            valor = valor + ((valor * porcentagem) / 100);
            parcela.setValor(valor);
        }
        if (jCBPago.isSelected()) {
            parcela.setPago("Pago");
        } else {
            parcela.setPago(null);
        }

        parceladao = new DAO<>(Parcela.class);
        parceladao.atualiza(parcela);
        parceladao.close();
        JOptionPane.showMessageDialog(this, "Pagamento de parcela"
                + " efetuado com sucesso!", "Activity Performed "
                + "Successfully", JOptionPane.INFORMATION_MESSAGE);
        ListarParcelas lp = new ListarParcelas(painel);
        painel.add(lp);
        lp.setVisible(true);


    }//GEN-LAST:event_jBSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCBPago;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLDataParcela;
    private javax.swing.JLabel jLDataVenda;
    private javax.swing.JLabel jLValorParcela;
    private javax.swing.JLabel jLValorVenda;
    private javax.swing.JRadioButton jRBDesconto;
    private javax.swing.JRadioButton jRBJuros;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables

    private void pupulateFields(Parcela parcela) {
        jLCliente.setText("Cliente: " + parcela.getVenda().getCliente().getNome());
        jLDataVenda.setText("Data da Venda:" + Editor.formatData(parcela.getVenda().getData()));
        jLValorVenda.setText("Valor da Venda: " + Editor.formatValor(parcela.getVenda().getValor()));
        jLDataParcela.setText("Data da Parcela: " + Editor.formatData(parcela.getData()));
        jLValorParcela.setText("Valor da Parcela:" + Editor.formatValor(parcela.getValor()));
        if (parcela.getPago() != null) {
            jCBPago.setSelected(true);
        }
    }
}
