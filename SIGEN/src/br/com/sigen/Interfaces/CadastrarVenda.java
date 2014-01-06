package br.com.sigen.Interfaces;

import br.com.sigen.Builder.VendaBuilder;
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.Modelo.Venda;
import br.com.sigen.dao.DAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.exception.ConstraintViolationException;

public class CadastrarVenda extends javax.swing.JInternalFrame {

    List<Cliente> clientes;
    List<Quadra> quadras;
    List<Letra> letras = new ArrayList<>();
    List<Chapa> chapas = new ArrayList<>();
    DAO<Cliente> cdao = new DAO<>(Cliente.class);
    DAO<Quadra> qdao = new DAO<>(Quadra.class);
    DAO<Venda> vdao = new DAO<>(Venda.class);
    Venda venda = new Venda();
    Chapa chapa;
    HashSet hashLetra = new HashSet();
    JDesktopPane painel;
    DefaultTableModel tmVenda = new DefaultTableModel(null,
            new String[]{"Nome", "CPF", "RG"}) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

    public CadastrarVenda(JDesktopPane painel) {
        super("SIGEN - Cadastro das Vendas de Túmulos");
        initComponents();
        this.painel = painel;
        populateQuadra();
        tabela.setRowHeight(23);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jLQuadra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jTCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jCBLetra = new javax.swing.JComboBox();
        jCBChapa = new javax.swing.JComboBox();
        jLCabecalho = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jDCData = new com.toedter.calendar.JDateChooser();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jCBQuadra = new javax.swing.JComboBox();

        setClosable(true);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Letra:");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Chapa:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data da Venda:");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmVenda);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Vendas");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLChapa)
                                            .addGap(14, 14, 14)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLLetra)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTCliente))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLCabecalho)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBChapa, jCBLetra});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuadra)
                    .addComponent(jLChapa)
                    .addComponent(jLLetra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLData)
                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmpresa)
                    .addComponent(jLVersao)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jTClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyTyped
        String nome = jTCliente.getText();

        clientes = cdao.buscaPorNome(nome);

        while (tmVenda.getRowCount() > 0) {
            tmVenda.removeRow(0);
        }

        for (int i = 0; i < clientes.size(); i++) {
            tmVenda.addRow(new String[]{null, null, null});
            tmVenda.setValueAt(clientes.get(i).getNome(), i, 0);
            tmVenda.setValueAt(clientes.get(i).getCpf(), i, 1);
            tmVenda.setValueAt(clientes.get(i).getRg(), i, 2);
        }
    }//GEN-LAST:event_jTClienteKeyTyped

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTCliente.setText(clientes.get(tabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        qdao.close();
        try {
            chapa = chapas.get(jCBChapa.getSelectedIndex());
            chapa.setVenda(venda);
            venda = new VendaBuilder().
                    setCliente(clientes.get(tabela.getSelectedRow())).
                    setData(jDCData.getDate()).
                    setChapa(chapa).getVenda();

            vdao.adicionar(venda);
            JOptionPane.showMessageDialog(this, "Venda"
                    + " adicionado com sucesso!", "Activity Performed "
                    + "Successfully", JOptionPane.INFORMATION_MESSAGE);
            limpar();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Campos"
                    + " obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);

        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "CPF, Login e/ou"
                    + " E-mail já cadastrado(s)!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        populateChapas();
    }//GEN-LAST:event_jCBLetraActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        populateLetras();
    }//GEN-LAST:event_jCBQuadraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private String queryLetra(String quadra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    private String queryChapa(String quadra, String letra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
                + "letra.letra ='" + letra + "' AND "
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    private void populateQuadra() {
        jCBQuadra.removeAllItems();
        quadras = qdao.listaTodos();
        for (int i = 0; i < quadras.size(); i++) {
            jCBQuadra.addItem(quadras.get(i).getQuadra());
        }
    }

    private void populateLetras() {
        jCBLetra.removeAllItems();
        String quadra = (String) jCBQuadra.getSelectedItem();
        List<Object[]> list = qdao.buscaAvançada(queryLetra(quadra));
        Object resultado[];
        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Letra letra = (Letra) resultado[1];
            hashLetra.add(letra.getLetra());
        }
        Iterator i = hashLetra.iterator();
        while (i.hasNext()) {
            jCBLetra.addItem(i.next());
        }
        hashLetra.clear();
    }

    private void populateChapas() {
        jCBChapa.removeAllItems();
        String quadraAux = (String) jCBQuadra.getSelectedItem();
        String letraAux = (String) jCBLetra.getSelectedItem();

        List<Object[]> list = qdao.
                buscaAvançada(queryChapa(quadraAux, letraAux));
        Object resultado[];

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Chapa chapa = (Chapa) resultado[0];
            chapas.add(chapa);
            jCBChapa.addItem(chapa.getChapa());
        }
    }

    private void limpar() {
        CadastrarVenda cv = new CadastrarVenda(painel);
        painel.add(cv);
        this.dispose();
        cv.show();
    }
}
