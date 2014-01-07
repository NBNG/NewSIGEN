package br.com.sigen.Interfaces;

import br.com.sigen.Modelo.Cliente;
import br.com.sigen.dao.DAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class ListarCliente extends javax.swing.JInternalFrame {

    JDesktopPane painel;
    DAO<Cliente> dao = new DAO<>(Cliente.class);
    Cliente cliente;
    String endereco;
    List<Cliente> clientes;
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{
        "Nome", "CPF", "RG", "Telefone", "Celular", "Email", "Endereço"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public ListarCliente(JDesktopPane painel) throws ParseException {
        super("SIGEN - Listagem de Proprietários");
        initComponents();
        this.painel = painel;
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        maskCPF.install(jFTCPF);
        tabela.setRowHeight(23);
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
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLNome = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jBPesquisar = new javax.swing.JButton();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Proprietários");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmCliente);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCabecalho)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLNome)
                            .addComponent(jLCPF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jFTCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar)
                    .addComponent(jLCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVersao)
                    .addComponent(jLEmpresa)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        jFTCPF.setText("");

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }

        clientes = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < clientes.size(); i++) {
            endereco = clientes.get(i).
                    getEndereco().getLogradouro() + " " + clientes.get(i).
                    getNumero() + ", " + clientes.get(i).
                    getEndereco().getBairro() + " - " + clientes.get(i).
                    getEndereco().getCidade() + "/" + clientes.get(i).
                    getEndereco().getEstado() + " - CEP: " + clientes.get(i).
                    getEndereco().getCep() + "("
                    + clientes.get(i).getComplemento() + ")";
            tmCliente.addRow(new String[]{null, null, null, null});
            tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
            tmCliente.setValueAt(clientes.get(i).getCpf(), i, 1);
            tmCliente.setValueAt(clientes.get(i).getRg(), i, 2);
            tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
            tmCliente.setValueAt(clientes.get(i).getCelular(), i, 4);
            tmCliente.setValueAt(clientes.get(i).getEmail(), i, 5);
            tmCliente.setValueAt(endereco, i, 6);
        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        if (!jFTCPF.getText().equals("   .   .   -  ")) {
            jTNome.setText("");

            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            clientes = new ArrayList<>();

            //erro
            /*cliente = (Cliente) dao.buscaPorCPF(jFTCPF.getText());*/
            
            cliente = (Cliente) dao.buscaPorCPF(jFTCPF.getText()).get(0);
            
            clientes.add(cliente);

            endereco = cliente.
                    getEndereco().getLogradouro() + " " + cliente.
                    getNumero() + ", " + cliente.
                    getEndereco().getBairro() + " - " + cliente.
                    getEndereco().getCidade() + "/" + cliente.
                    getEndereco().getEstado() + " - CEP: " + cliente.
                    getEndereco().getCep() + "("
                    + cliente.getComplemento() + ")";
            tmCliente.addRow(new String[]{null, null, null, null});
            tmCliente.setValueAt(cliente.getNome(), 0, 0);
            tmCliente.setValueAt(cliente.getCpf(), 0, 1);
            tmCliente.setValueAt(cliente.getRg(), 0, 2);
            tmCliente.setValueAt(cliente.getTelefone(), 0, 3);
            tmCliente.setValueAt(cliente.getCelular(), 0, 4);
            tmCliente.setValueAt(cliente.getEmail(), 0, 5);
            tmCliente.setValueAt(endereco, 0, 6);
        } else {
            JOptionPane.showMessageDialog(this, "Favor preencher um CPF!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            try {
                AtualizaCliente ac
                        = new AtualizaCliente(clientes.get(tabela.getSelectedRow()), this, painel);
                ac.setVisible(true);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
