package br.com.sigen.Interfaces;

import br.com.sigen.Dao.ParcelaDAO;
import br.com.sigen.Editor.Editor;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Parcela;
import br.com.sigen.dao.DAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public class ListarParcelas extends javax.swing.JInternalFrame {

    //listas e daos utilizadas na classe
    List<Cliente> clientes;
    List<Parcela> parcelas;
    DAO<Cliente> clientedao;
    ParcelaDAO parceladao;
    private String caracteres = "0987654321.,";
    JDesktopPane painel;
    //tabela default(trocar)
    DefaultTableModel tmParcela = new DefaultTableModel(null, new String[]{""
        + "Parcelas", "Cliente", "Valor Total", "Data da Compra",
        "Valor da Parcela", "Data da Parcela", "Tipo", "Pago"}) {
        boolean[] canEdit = new boolean[]{
            /*
             *canEdit diz quais as tebelas podem ou não ser editadas,
             *neste caso nenhum
             */
            false, false, false, false, false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public ListarParcelas(JDesktopPane painel) {
        initComponents();
        //metodo para deixar o combobox autocomplementavel
        //setando barra de rolagem horizontal na tabela
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        //setando tamalho das colunas
        tabela.getColumnModel().getColumn(0).setPreferredWidth(65);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(290);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(65);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(85);
        this.painel = painel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jCBPago = new javax.swing.JComboBox();
        jTValorInicial = new javax.swing.JTextField();
        jTValorFinal = new javax.swing.JTextField();
        jDCInicial = new com.toedter.calendar.JDateChooser();
        jDCFinal = new com.toedter.calendar.JDateChooser();
        jLate = new javax.swing.JLabel();
        jLAte2 = new javax.swing.JLabel();
        jLCabecalho = new javax.swing.JLabel();
        jRBValor = new javax.swing.JRadioButton();
        jRBTipo = new javax.swing.JRadioButton();
        jRBCliente = new javax.swing.JRadioButton();
        jRBPago = new javax.swing.JRadioButton();
        jRBData = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jBPesquisar = new javax.swing.JButton();
        jTBSeleciona = new javax.swing.JToggleButton();
        jLVencimento = new javax.swing.JLabel();
        jRBVencimento = new javax.swing.JRadioButton();
        jDCInicial_Vencimento = new com.toedter.calendar.JDateChooser();
        jDCFinal_Vencimento = new com.toedter.calendar.JDateChooser();
        jLate1 = new javax.swing.JLabel();
        jBBusca = new javax.swing.JButton();
        jTCliente = new javax.swing.JTextField();

        setClosable(true);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Venda:");

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor Inicial:");

        jCBTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Carnê" }));

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pago", "Em Aberto" }));

        jTValorInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTValorInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorInicialKeyTyped(evt);
            }
        });

        jTValorFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTValorFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorFinalKeyTyped(evt);
            }
        });

        jDCInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLate.setText("Até");

        jLAte2.setText("Até");

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Parcelas");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmParcela);
        tabela.setRowHeight(23);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTBSeleciona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBSeleciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/editar.png"))); // NOI18N
        jTBSeleciona.setText("Selecionar Todos");
        jTBSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBSelecionaActionPerformed(evt);
            }
        });

        jLVencimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLVencimento.setText("Vencimento:");

        jDCInicial_Vencimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCFinal_Vencimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLate1.setText("Até");

        jBBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBBusca.setText("...");
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jLCabecalho)
                        .addGap(802, 802, 802))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBData, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLData)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLate)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBusca)))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBValor)
                                    .addComponent(jRBTipo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBVencimento)
                                .addGap(18, 18, 18)
                                .addComponent(jLVencimento)
                                .addGap(18, 18, 18)
                                .addComponent(jDCInicial_Vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLate1)
                                .addGap(18, 18, 18)
                                .addComponent(jDCFinal_Vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLValor)
                                .addGap(18, 18, 18)
                                .addComponent(jTValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLAte2)
                                .addGap(18, 18, 18)
                                .addComponent(jTValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBPago)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBSeleciona)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDCFinal, jDCInicial});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTValorFinal, jTValorInicial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCliente)
                                .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBusca))
                            .addComponent(jRBCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLate)
                            .addComponent(jLData)
                            .addComponent(jRBData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLValor)
                                .addComponent(jTValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLAte2)
                                .addComponent(jTValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jRBValor)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBTipo)
                            .addComponent(jCBPago)
                            .addComponent(jRBPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBPesquisar)
                        .addComponent(jTBSeleciona))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDCFinal_Vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDCInicial_Vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLate1)
                        .addComponent(jLVencimento)
                        .addComponent(jRBVencimento)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        /*
         *enquanto ouver linhas na coluna,
         *esta linha é removida (limpando a tabela)
         */

        while (tmParcela.getRowCount() > 0) {
            tmParcela.removeRow(0);
        }

        /*
         *parceladao utilizando o metodo buscaAvancada da classe parcela 
         *para listar todos os clientes orndenados pelo nome, logo após
         *a pesquisa a sessão é fechada
         */
        parceladao = new ParcelaDAO();
        parcelas = parceladao.buscaAvancada(montaQuery());
        parceladao.close();

        /*
         *enquanto ouver dados na lista parcelas o mesmo é insero na tabela
         */
        for (int i = 0; i < parcelas.size(); i++) {
            tmParcela.addRow(new String[]{null, null, null, null});
            tmParcela.setValueAt(parcelas.get(i).getCodigo(), i, 0);
            tmParcela.setValueAt(parcelas.get(i).getVenda().getCliente().getNome(), i, 1);
            tmParcela.setValueAt(Editor.formatValor(parcelas.get(i).getVenda().getValor()), i, 2);
            tmParcela.setValueAt(Editor.formatData(parcelas.get(i).getVenda().getData()), i, 3);
            tmParcela.setValueAt(Editor.formatValor(parcelas.get(i).getValor()), i, 4);
            tmParcela.setValueAt(Editor.formatData(parcelas.get(i).getData()), i, 5);
            tmParcela.setValueAt(parcelas.get(i).getTipo(), i, 6);
            tmParcela.setValueAt(parcelas.get(i).getPago(), i, 7);
        }

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        //selecionando a linhas com o botão direito do mouse
        if (evt.getButton() == MouseEvent.BUTTON3) {
            //pegando a linha e a coluna clicada
            int col = tabela.columnAtPoint(evt.getPoint());
            int row = tabela.rowAtPoint(evt.getPoint());
            if (col != -1 && row != -1) {
                //selecionando a linha
                tabela.setColumnSelectionInterval(col, col);
                tabela.setRowSelectionInterval(row, row);
            }
        }

        //Verificando se o botão direito foi pressionado  
        if (evt.getButton() == MouseEvent.BUTTON3) {
            //cria o menu
            JPopupMenu menu = new JPopupMenu();
            //item do menu
            JMenuItem pagar = new JMenuItem("Efetuar Pagamento");
            //função no menu para abrir janela de pagamento de parcelas
            pagar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    //apenas parcelas no carnê podem ser pagas pelo sistema
                    if (parcelas.get(tabela.getSelectedRow()).getTipo().equals("Cartão")) {
                        JOptionPane.showMessageDialog(ListarParcelas.this,
                                "Parcelas no cartão são creditadas diretamente "
                                + "na conta!",
                                "ERROR 404 - Content not found!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        //explicação em comentário acima do metodo
                        if (pagar(parcelas.get(tabela.getSelectedRow()).getVenda().
                                getCodigo(), parcelas.get(tabela.getSelectedRow()).
                                getCodigo())) {
                            PagarParcela pagar = new PagarParcela(parcelas.
                                    get(tabela.getSelectedRow()),
                                    painel, ListarParcelas.this);
                            pagar.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(ListarParcelas.this,
                                    "Há parcela(s) em aberto com data "
                                    + "inferior a data desejada!",
                                    "ERROR 404 - Content not found!",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            //adicionando o submenu pagar
            menu.add(pagar);
            //mostrando o menu
            menu.show(this, evt.getX(), evt.getY() + 291);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void jTValorInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorInicialKeyTyped
        //metodo para não aceitar letras no campo de dinheiro
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTValorInicialKeyTyped

    private void jTValorFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorFinalKeyTyped
        //metodo para não aceitar letras no campo de dinheiro
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTValorFinalKeyTyped

    private void jTBSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBSelecionaActionPerformed
        if (jTBSeleciona.isSelected()) {
            jRBCliente.setSelected(true);
            jRBData.setSelected(true);
            jRBPago.setSelected(true);
            jRBTipo.setSelected(true);
            jRBValor.setSelected(true);
            jRBVencimento.setSelected(true);
        } else {
            jRBCliente.setSelected(false);
            jRBData.setSelected(false);
            jRBPago.setSelected(false);
            jRBTipo.setSelected(false);
            jRBValor.setSelected(false);
            jRBVencimento.setSelected(false);
        }
    }//GEN-LAST:event_jTBSelecionaActionPerformed

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        try {
            ListarCliente lc = new ListarCliente(this, painel);
            painel.add(lc);
            lc.setVisible(true);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBBuscaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBPago;
    private javax.swing.JComboBox jCBTipo;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCFinal_Vencimento;
    private com.toedter.calendar.JDateChooser jDCInicial;
    private com.toedter.calendar.JDateChooser jDCInicial_Vencimento;
    private javax.swing.JLabel jLAte2;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLVencimento;
    private javax.swing.JLabel jLate;
    private javax.swing.JLabel jLate1;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBPago;
    private javax.swing.JRadioButton jRBTipo;
    private javax.swing.JRadioButton jRBValor;
    private javax.swing.JRadioButton jRBVencimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBSeleciona;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTValorFinal;
    private javax.swing.JTextField jTValorInicial;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    /*O metodo é utilizado para montar queries avançadas de pesquisa onde há
     *ifs "externos" para marcar quais os tipos de pesquisas devem ser escolhidas
     *e assim montadas de acordo com os valores pegos dos componentes e ifs
     *"internos" para fazer a verificação dos campos de data e valor. Tais verifi-
     *-cações são utilizadas para evitar erros no sistema podendo ter uma maior
     *facilidade no uso das funcionaliaddes*/

    private String montaQuery() {
        String query = "From Parcela parcela where 1=1";

        if (jRBCliente.isSelected()) {
            //adiciona o nome do cliente a pesquisa
            query += " AND parcela.venda.cliente.nome = '"
                    + (String) jTCliente.getText() + "'";
        }
        //adiciona a data da venda na pesquisa
        if (jRBData.isSelected()) {
            /*
             *caso a data tenha sido escolhida como parametro mas seus valores
             *não tenhos sido especificados é retornado uma mensagem
             */
            if (jDCInicial.getDate() == null && jDCFinal.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Pesquisa efetuada sem datas"
                        + "(venda), valores não especificados!",
                        "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            }
            //pesquisa de data de venda efetuada apenas com a data inicial
            if (jDCInicial.getDate() != null && jDCFinal.getDate() == null) {
                query += " AND parcela.venda.data >= '" + jDCInicial.getDate() + "'";
                //pesquisa só com o começo
            }
            //pesquisa de data de venda efetuada apenas com a data final
            if (jDCInicial.getDate() == null && jDCFinal.getDate() != null) {
                query += " AND parcela.venda.data <= '" + jDCFinal.getDate() + "'";

            }
            //pesquisa de data de venda efetuada com um range de datas
            if (jDCInicial.getDate() != null && jDCFinal.getDate() != null) {
                query += " AND parcela.venda.data BETWEEN '"
                        + jDCInicial.getDate() + "' AND '" + jDCFinal.getDate() + "'";
            }
        }
        //adiciona se uma parcela esta paga ou não na query
        if (jRBPago.isSelected()) {
            query += " AND parcela.pago = '" + (String) jCBPago.getSelectedItem() + "'";
        }
        //adiciona o tipo de parcela (carne ou cartão)
        if (jRBTipo.isSelected()) {
            query += " AND parcela.tipo = '" + (String) jCBTipo.getSelectedItem() + "'";
        }
        //adiciona os valores da venda na pesquisa
        if (jRBValor.isSelected()) {
            /*
             *caso o valor tenha sido escolhida como parametro mas seus valores
             *não tenhos sido especificados é retornado uma mensagem
             */
            if (jTValorInicial.getText().equals("") && jTValorFinal.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Pesquisa efetuada sem valores"
                        + "(venda), valores não especificados!",
                        "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            }
            //pesquisa de valor de venda efetuada apenas com a valor inicial
            if (!jTValorInicial.getText().equals("") && jTValorFinal.getText().equals("")) {
                query += " AND parcela.venda.valor >='" + jTValorInicial.getText() + "'";
            }
            //pesquisa de valor de venda efetuada apenas com a valor final
            if (jTValorInicial.getText().equals("") && !jTValorFinal.getText().equals("")) {
                query += " AND parcela.venda.valor <='" + jTValorFinal.getText() + "'";
            }
            //pesquisa de data de venda efetuada com um range de valores
            if (!jTValorInicial.getText().equals("") && !jTValorFinal.getText().equals("")) {
                query += " AND parcela.venda.valor >='" + jTValorInicial.getText() + "'"
                        + " AND parcela.venda.valor <='" + jTValorFinal.getText() + "'";
            }
        }
        //adiciona as datas da parcela na pesquisa
        if (jRBVencimento.isSelected()) {
            /*
             *caso a data tenha sido escolhida como parametro mas seus valores
             *não tenhos sido especificados é retornado uma mensagem
             */
            if (jDCInicial_Vencimento.getDate() == null && jDCFinal_Vencimento.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Pesquisa efetuada sem datas"
                        + "(vencimento de parcela), valores não especificados!",
                        "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            }
            //pesquisa de data de venda efetuada apenas com a data inicial
            if (jDCInicial_Vencimento.getDate() != null && jDCFinal_Vencimento.getDate() == null) {
                query += " AND parcela.data >= '" + jDCInicial_Vencimento.getDate() + "'";

            }
            //pesquisa de data de venda efetuada apenas com a data final
            if (jDCInicial_Vencimento.getDate() == null && jDCFinal_Vencimento.getDate() != null) {
                query += " AND parcela.data <= '" + jDCFinal_Vencimento.getDate() + "'";

            }
            //pesquisa de data de parcela efetuada com um range de datas
            if (jDCInicial_Vencimento.getDate() != null && jDCFinal_Vencimento.getDate() != null) {
                query += " AND parcela.data BETWEEN '"
                        + jDCInicial_Vencimento.getDate() + "' AND '" + jDCFinal_Vencimento.getDate() + "'";
            }
        }
        //ordena a lista de acordo com a venda após esta ordenação as parcelas
        //para que fique tudo organizado
        query += " order by parcela.venda,parcela.codigo asc";
        return query;
    }

    /*
     *Metodo para verificar se há parcelas em aberto que tenham data menor
     *que a escolhida para pagamento
     */
    private Boolean pagar(Long venda, int parc) {
        //Lista auxiliar para "filtrar" as parcelas de apenas UMA venda
        List<Parcela> parcAux = new ArrayList<>();
        for (int i = 0; i < parcelas.size(); i++) {
            if (parcelas.get(i).getVenda().getCodigo().equals(venda)) {
                parcAux.add(parcelas.get(i));
            }
        }
        for (int i = 0; i < parcAux.size(); i++) {
            if (parcAux.get(i).getCodigo() < parc) {
                if (parcAux.get(i).getPago() == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        jTCliente.setText(cliente.getNome());
    }

    private Cliente cliente;
}
