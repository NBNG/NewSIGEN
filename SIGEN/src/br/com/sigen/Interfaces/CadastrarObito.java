/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

import br.com.sigen.Builder.ObitoBuilder;
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Obito;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.dao.DAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

public class CadastrarObito extends javax.swing.JInternalFrame {

    DAO<Quadra> quadradao;
    DAO<Obito> obitodao;
    HashSet hashQuadra = new HashSet();
    HashSet hashLetra = new HashSet();
    List<Chapa> chapas = new ArrayList<>();
    List<Obito> obitos = new ArrayList<>();
    Cliente cliente;
    Obito obito;
    Chapa chapa;
    JDesktopPane painel;

    public CadastrarObito(JDesktopPane painel) throws ParseException {
        super("SIGEN - Cadastro dos Óbitos");
        initComponents();
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        maskCPF.install(jFTCPF);
        this.painel = painel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLProtocolo = new javax.swing.JLabel();
        jLGuia = new javax.swing.JLabel();
        jLFiliacaoM = new javax.swing.JLabel();
        jLFiliacaoP = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLDocumento = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLIdade = new javax.swing.JLabel();
        jLMedico = new javax.swing.JLabel();
        jLCausa = new javax.swing.JLabel();
        jTIdade = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTProtocolo = new javax.swing.JTextField();
        jTDocumento = new javax.swing.JTextField();
        jTGuia = new javax.swing.JTextField();
        jTPai = new javax.swing.JTextField();
        jTMedico = new javax.swing.JTextField();
        jTMae = new javax.swing.JTextField();
        jTCausa = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jDCData = new com.toedter.calendar.JDateChooser();
        jCBUF = new javax.swing.JComboBox();
        jLEstado = new javax.swing.JLabel();
        jLProprietario = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jCBLetra = new javax.swing.JComboBox();
        jLQuadra = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jCBChapa = new javax.swing.JComboBox();
        jCBQuadra = new javax.swing.JComboBox();
        jLDono = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro Obituário");

        jLProtocolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProtocolo.setText("Protocolo:");

        jLGuia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLGuia.setText("Guia:");

        jLFiliacaoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFiliacaoM.setText("Filiação - Mãe:");

        jLFiliacaoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFiliacaoP.setText("Filiação - Pai:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLDocumento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDocumento.setText("Nº Documento:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLIdade.setText("Idade:");

        jLMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMedico.setText("Médico:");

        jLCausa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCausa.setText("Causa da Morte:");

        jTIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTProtocolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTDocumento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTGuia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTPai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMae.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCausa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/limpar.png"))); // NOI18N
        jBCancelar.setText("Limpar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));
        jCBUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUFActionPerformed(evt);
            }
        });

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLProprietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProprietario.setText("Proprietário:");

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Letra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Chapa:");

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        jLDono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDono.setText("    ");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLProprietario)
                        .addGap(18, 18, 18)
                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar))
                    .addComponent(jLDono)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLLetra)
                        .addGap(18, 18, 18)
                        .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLChapa)
                        .addGap(18, 18, 18)
                        .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBCadastrar)
                            .addGap(18, 18, 18)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addGap(10, 10, 10)
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLIdade)
                                .addGap(10, 10, 10)
                                .addComponent(jTIdade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLEstado)
                                .addGap(10, 10, 10)
                                .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLCidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTCidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLProtocolo)
                                .addGap(10, 10, 10)
                                .addComponent(jTProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLGuia)
                                .addGap(10, 10, 10)
                                .addComponent(jTGuia))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLFiliacaoP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTPai))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLFiliacaoM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTMae))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTMedico))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLData)
                                .addGap(10, 10, 10)
                                .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLDocumento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLCabecalho)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLProprietario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBPesquisar))
                .addGap(11, 11, 11)
                .addComponent(jLDono)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQuadra))
                    .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLetra)
                            .addComponent(jLChapa))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome)
                            .addComponent(jLIdade))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstado)
                            .addComponent(jLCidade))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLProtocolo)
                            .addComponent(jLGuia))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLDocumento))
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLMedico))
                    .addComponent(jTMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLCausa))
                    .addComponent(jTCausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLFiliacaoM))
                    .addComponent(jTMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLFiliacaoP))
                    .addComponent(jTPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLEmpresa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLVersao)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        try {
            limpar();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed

        try {
            /*Caso o CPF não seja preenchido o sistema lança um alerta*/
            if (jFTCPF.getText().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(this, "Campos"
                        + " obrigatórios (*) vazios e/ou Informação inválida!",
                        "ERROR 404 - Content not found!",
                        JOptionPane.ERROR_MESSAGE);
                marca();
            } else {
                chapa = chapas.get(jCBChapa.getSelectedIndex());
                obitos.add(obito);
                chapa.setObitos(obitos);
                String cidade = jTCidade.
                        getText() + " - " + (String) jCBUF.getSelectedItem();

                obito = new ObitoBuilder().setCausaMorte(jTCausa.getText()).
                        setChapa(chapa).setCidade(cidade).setData(jDCData.getDate()).
                        setGuia(jTGuia.getText()).setIdade(jTIdade.getText()).
                        setMae(jTMae.getText()).setMedico(jTMedico.getText()).
                        setNome(jTNome.getText()).setPai(jTPai.getText()).
                        setNumeroDocumento(jTDocumento.getText()).
                        setProtocolo(jTProtocolo.getText()).getObito();

                obitodao = new DAO<>(Obito.class);
                obitodao.adicionar(obito);
                obitodao.close();
                JOptionPane.showMessageDialog(this, "Obito"
                        + " adicionado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Campos"
                    + " obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "CPF já cadastrado(s)!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        populateQuadras();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        populateChapas();
    }//GEN-LAST:event_jCBLetraActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        populateLetras();
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jCBUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUFActionPerformed

    }//GEN-LAST:event_jCBUFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private javax.swing.JComboBox jCBUF;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCausa;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLDono;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFiliacaoM;
    private javax.swing.JLabel jLFiliacaoP;
    private javax.swing.JLabel jLGuia;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLMedico;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLProprietario;
    private javax.swing.JLabel jLProtocolo;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JTextField jTCausa;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTGuia;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTMae;
    private javax.swing.JTextField jTMedico;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPai;
    private javax.swing.JTextField jTProtocolo;
    // End of variables declaration//GEN-END:variables

    /*Retorna todas as chapas pertencente ao cliente com cpf x*/
    private String queryQuadra(String cpf) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda"
                + " INNER JOIN venda.cliente as cliente "
                + "WHERE cliente.cpf ='" + cpf + "' "
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    /**
     * ***************************************************
     */
    private String queryLetra(String cpf, String quadra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda"
                + " INNER JOIN venda.cliente as cliente "
                + "WHERE cliente.cpf ='" + cpf + "' AND "
                + "quadra.quadra = '" + quadra + "'"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    /*Retorna a query que busca todas as chapas pertencentes a letra x,
     a letra x por sua vez pertence a quadra y, e a chapa pertence ao cliente
     com cpf z.
     */
    private String queryChapa(String cpf, String quadra, String letra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda"
                + " INNER JOIN venda.cliente as cliente "
                + "WHERE cliente.cpf ='" + cpf + "' AND "
                + "quadra.quadra = '" + quadra + "' AND "
                + "letra.letra = '" + letra + "'"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    /*Preenche o combobox das letras*/
    private void populateLetras() {
        jCBLetra.removeAllItems();
        String cpf = jFTCPF.getText();
        String quadraAux = (String) jCBQuadra.getSelectedItem();

        List<Object[]> list = new DAO<>(Quadra.class).buscaAvançada(queryLetra(cpf, quadraAux));
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

    /*Preenche o combobox das quadras*/
    private void populateQuadras() {
        jCBQuadra.removeAllItems();
        String cpf = jFTCPF.getText();
        List<Object[]> list = new DAO<>(Quadra.class).buscaAvançada(queryQuadra(cpf));
        Object resultado[];
        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Quadra quadra = (Quadra) resultado[2];
            hashQuadra.add(quadra.getQuadra());
            cliente = (Cliente) resultado[4];
            jLDono.setText(cliente.getNome());
        }
        Iterator i = hashQuadra.iterator();
        while (i.hasNext()) {
            jCBQuadra.addItem(i.next());
        }
        hashQuadra.clear();
    }

    /*Preenche o combobox com as chapas pertencentes ao proprietário*/
    private void populateChapas() {
        jCBChapa.removeAllItems();
        String quadraAux = (String) jCBQuadra.getSelectedItem();
        String letraAux = (String) jCBLetra.getSelectedItem();
        String cpf = jFTCPF.getText();
        List<Object[]> list = new DAO<>(Quadra.class).
                buscaAvançada(queryChapa(cpf, quadraAux, letraAux));
        Object resultado[];

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Chapa chapa = (Chapa) resultado[0];
            chapas.add(chapa);
            jCBChapa.addItem(chapa.getChapa());
        }
    }

    /*Limpa a tela fechando a antiga e reabrindo a mesma*/
    private void limpar() throws ParseException {
        CadastrarObito co = new CadastrarObito(painel);
        painel.add(co);
        this.dispose();
        co.show();
    }

    /*Marca todos os campos obrigatórios para realizar a atualização do
     cadastro
     */
    private void marca() {
        jLNome.setText("Nome:*");
        jLProprietario.setText("Proprietário:*");
        jLQuadra.setText("Quadra:*");
        jLLetra.setText("Letra:*");
        jLChapa.setText("Chapa:*");
        jLIdade.setText("Idade:*");
        jLEstado.setText("Estado:*");
        jLCidade.setText("Cidade:*");
        jLProtocolo.setText("Protocolo:*");
        jLGuia.setText("Guia:*");
        jLData.setText("Data:*");
        jLDocumento.setText("Nº Documento:*");
        jLMedico.setText("Medico:*");
        jLCausa.setText("Causa da Morte:*");
    }
}
