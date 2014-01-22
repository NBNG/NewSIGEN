package br.com.sigen.Interfaces;

import br.com.sigen.Builder.ParcelaBuilder;
import br.com.sigen.Builder.VendaBuilder;
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Parcela;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.Modelo.Venda;
import br.com.sigen.dao.DAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.exception.ConstraintViolationException;

public class CadastrarVenda extends javax.swing.JInternalFrame {

    private String caracteres = "0987654321.,";
    List<Cliente> clientes;
    List<Quadra> quadras;
    List<Letra> letras = new ArrayList<>();
    List<Chapa> chapas = new ArrayList<>();
    List<Parcela> parcelas = new ArrayList<>();

    DAO<Cliente> clientedao;
    DAO<Quadra> quadradao;
    DAO<Venda> vendadao;
    DAO<Parcela> parceladao;

    Venda venda = new Venda();
    Chapa chapa;
    Parcela parcela;
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
        jLTipo.setVisible(false);
        jCBTipo.setVisible(false);
        jLParcela.setVisible(false);
        jTParcela.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jLQuadra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jCBLetra = new javax.swing.JComboBox();
        jCBChapa = new javax.swing.JComboBox();
        jLCabecalho = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jDCData = new com.toedter.calendar.JDateChooser();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jCBQuadra = new javax.swing.JComboBox();
        jLTipo = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jCBParcelado = new javax.swing.JCheckBox();
        jLValor = new javax.swing.JLabel();
        jTValor = new javax.swing.JTextField();
        jLDesconto = new javax.swing.JLabel();
        jTDesconto = new javax.swing.JTextField();
        jLParcela = new javax.swing.JLabel();
        jTParcela = new javax.swing.JTextField();
        jLCPF = new javax.swing.JLabel();
        jTCliente = new javax.swing.JTextField();
        jBBusca = new javax.swing.JButton();

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

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo.setText("Tipo:");

        jCBTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Carnê" }));

        jCBParcelado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBParcelado.setText("Parcelado");
        jCBParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBParceladoActionPerformed(evt);
            }
        });

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor:");

        jTValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorKeyTyped(evt);
            }
        });

        jLDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDesconto.setText("Desconto:");

        jTDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLParcela.setText("Parcelas:");

        jTParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF: ");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBBusca.setText("...");
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLCabecalho))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBusca))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLData)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLValor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLParcela)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBParcelado)
                                            .addComponent(jLQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLTipo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCBLetra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLChapa)
                                                        .addGap(14, 14, 14)))
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLLetra)))))
                                    .addComponent(jLCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLDesconto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBChapa, jCBLetra});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTDesconto, jTParcela});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBusca))
                .addGap(18, 18, 18)
                .addComponent(jLCPF)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuadra)
                    .addComponent(jLChapa)
                    .addComponent(jLLetra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBParcelado)
                    .addComponent(jLTipo)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLParcela)
                    .addComponent(jTParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDesconto)
                    .addComponent(jTDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLData)
                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 29, Short.MAX_VALUE)
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

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        String valor = "";
        if (!jTDesconto.getText().equals("")) {
            Double valorAux = Double.parseDouble(jTValor.getText())
                    - (((Double.parseDouble(jTValor.getText())
                    * Double.parseDouble(jTDesconto.getText()))) / 100);
            valor = String.valueOf(valorAux);
        } else {
            valor = jTValor.getText();
        }
        if (jCBParcelado.isSelected()) {
            try {
                for (int i = 0; i < Integer.parseInt(jTParcela.getText()); i++) {
                    parcela = new ParcelaBuilder().setCodigo(i + 1).
                            setData(jDCData.getDate()).
                            setTipo((String) jCBTipo.getSelectedItem()).
                            setValor(valor,
                                    Integer.parseInt(jTParcela.getText())).
                            getParcela();
                    parcelas.add(parcela);
                }
                chapa = chapas.get(jCBChapa.getSelectedIndex());
                chapa.setVenda(venda);
                venda = new VendaBuilder().
                        setCliente(cliente).
                        setData(jDCData.getDate()).setChapa(chapa).
                        setValor(valor).
                        setParcelas(parcelas).
                        getVenda();
                for (int i = 0; i < parcelas.size(); i++) {
                    parcelas.get(i).setVenda(venda);
                }
                vendadao = new DAO<>(Venda.class);
                vendadao.adicionar(venda);

                JOptionPane.showMessageDialog(this, "Venda"
                        + " adicionado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                vendadao.close();
            } catch (IllegalArgumentException | ConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, "Campos"
                        + " obrigatórios (*) vazios e/ou Informação inválida!",
                        "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                chapa = chapas.get(jCBChapa.getSelectedIndex());
                chapa.setVenda(venda);
                venda = new VendaBuilder().
                        setCliente(cliente).
                        setData(jDCData.getDate()).setChapa(chapa).
                        setValor(jTValor.getText()).
                        getVenda();
                vendadao = new DAO<>(Venda.class);
                vendadao.adicionar(venda);

                JOptionPane.showMessageDialog(this, "Venda"
                        + " adicionado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                vendadao.close();

            } catch (IllegalArgumentException | ConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, "Campos"
                        + " obrigatórios (*) vazios e/ou Informação inválida!",
                        "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        populateChapas();
    }//GEN-LAST:event_jCBLetraActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        populateLetras();
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jCBParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBParceladoActionPerformed
        if (jCBParcelado.isSelected()) {
            jLTipo.setVisible(true);
            jCBTipo.setVisible(true);
            jLParcela.setVisible(true);
            jTParcela.setVisible(true);
        } else {
            jLTipo.setVisible(false);
            jCBTipo.setVisible(false);
            jLParcela.setVisible(false);
            jTParcela.setVisible(false);
        }
    }//GEN-LAST:event_jCBParceladoActionPerformed

    private void jTValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTValorKeyTyped

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        try {
            ListarCliente lc = new ListarCliente(this, painel);
            painel.add(lc);
            lc.setVisible(true);

        } catch (ParseException ex) {
            Logger.getLogger(CadastrarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBBuscaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JCheckBox jCBParcelado;
    private javax.swing.JComboBox jCBQuadra;
    private javax.swing.JComboBox jCBTipo;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLDesconto;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLParcela;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTDesconto;
    private javax.swing.JTextField jTParcela;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables

    /*Query que retorna todas as chapas que não foram vendidas e que pertencem
     a uma quadra x
     */
    private String queryLetra(String quadra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    /*Query que retorna todas as chapas que não foram vendidas que pertencem
     a uma letra x e por sua vez pertence a uma quadra y.
     */
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
        quadradao = new DAO<>(Quadra.class);
        quadras = quadradao.listaTodos();
        quadradao.close();
        for (int i = 0; i < quadras.size(); i++) {
            jCBQuadra.addItem(quadras.get(i).getQuadra());
        }
    }

    private void populateLetras() {
        jCBLetra.removeAllItems();
        String quadra = (String) jCBQuadra.getSelectedItem();
        quadradao = new DAO<>(Quadra.class);
        List<Object[]> list = quadradao.buscaAvançada(queryLetra(quadra));
        quadradao.close();
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

        DAO<Chapa> chapadao = new DAO<>(Chapa.class);
        List<Object[]> list = chapadao.
                buscaAvançada(queryChapa(quadraAux, letraAux));
        Object resultado[];

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Chapa chapa = (Chapa) resultado[0];
            chapas.add(chapa);
            jCBChapa.addItem(chapa.getChapa());
        }
        chapadao.close();
    }

    private void limpar() {
        CadastrarVenda cv = new CadastrarVenda(painel);
        painel.add(cv);
        this.dispose();
        cv.show();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        jTCliente.setText(cliente.getNome());
        jLCPF.setText(cliente.getCpf());
    }

    private Cliente cliente;
}
