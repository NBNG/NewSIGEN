/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

import br.com.sigen.Builder.ClienteBuilder;
import br.com.sigen.Builder.EnderecoBuilder;
import br.com.sigen.Dao.EnderecoDAO;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.dao.DAO;
import java.text.ParseException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author user
 */
public class CadastrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Proprietarios
     */
    Cliente cliente;
    Endereco endereco;
    DAO<Cliente> cdao = new DAO<>(Cliente.class);
    EnderecoDAO edao;
    Boolean verifica;
    JDesktopPane painel;

    public CadastrarCliente(JDesktopPane painel) throws ParseException {
        super("SIGEN - Cadastro de Proprietários");
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        MaskFormatter maskCEP = new MaskFormatter("#####-###");
        maskTelefone.install(jFTTelefone);
        maskCelular.install(jFTCelular);
        maskCPF.install(jFTCPF);
        maskCEP.install(jFTCEP);
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

        jLCabecalho = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTRG = new javax.swing.JTextField();
        jTLogradouro = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTComplemento = new javax.swing.JTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jFTCelular = new javax.swing.JFormattedTextField();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jDCNascimento = new com.toedter.calendar.JDateChooser();
        jLData = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jFTCEP = new javax.swing.JFormattedTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jCBEstado = new javax.swing.JComboBox();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Clientes");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jLLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogradouro.setText("Logradouro:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Número:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jDCNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Nascimento:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTCEPFocusLost(evt);
            }
        });

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCPF)
                        .addGap(18, 18, 18)
                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLCelular)
                            .addGap(18, 18, 18)
                            .addComponent(jFTCelular))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTEmail))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCadastrar)
                                .addGap(29, 29, 29)
                                .addComponent(jBLimpar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLLogradouro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTLogradouro)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLEstado)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCBEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCEP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLComplemento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLBairro)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jLRG)
                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLData)
                    .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCEP)
                    .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEstado)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro)
                    .addComponent(jTLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLComplemento)
                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        try {
            edao = new EnderecoDAO();
            cdao = new DAO<>(Cliente.class);
            if (verifica == null) {
                /*Caso não foi realizado a busca pelo CEP, o sistema lança um
                alerta, e só prossegue quando a operação for realizada
                */
                JOptionPane.showMessageDialog(CadastrarCliente.this, "Faça a "
                        + "pesquisa do CEP antes de confirmar um cadastro!",
                        "Invalid Operation!", JOptionPane.ERROR_MESSAGE);
            } else {
                /*Caso o CEP foi pesquisado é verificado no banco de o CEP 
                ja existe na base de dados, senão existe ele é cadastrado.
                É necessário que o endereço novo ou ja cadastrado,
                pois um cliente possui um endereço, assim é preciso que 
                ja exista no banco para realizar o cadastro do cliente.
                */
                if (verifica == false) {
                    endereco = new EnderecoBuilder().setBairro(jTBairro.getText()).
                            setCep(jFTCEP.getText()).setCidade(jTCidade.getText()).
                            setEstado((String) jCBEstado.getSelectedItem()).
                            setLogradouro(jTLogradouro.getText()).getEndereco();
                    edao.adiciona(endereco);
                }
                cliente = new ClienteBuilder().setNome(jTNome.getText()).
                        setData(jDCNascimento.getDate()).setCpf(jFTCPF.getText()).
                        setRg(jTRG.getText()).setTelefone(jFTTelefone.getText()).
                        setCelular(jFTCelular.getText()).setEmail(jTEmail.getText()).
                        setComplemento(jTComplemento.getText()).
                        setNumero(jTNumero.getText()).getCliente();

                cliente.setEndereco(endereco);
                cdao.adicionar(cliente);
                JOptionPane.showMessageDialog(CadastrarCliente.this, "Cliente"
                        + " adicionado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(CadastrarCliente.this, "Campos"
                    + " obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(CadastrarCliente.this, "CPF e/ou"
                    + " E-mail já cadastrado(s)!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            cdao = new DAO<>(Cliente.class);
        } catch (Error er) {
            JOptionPane.showMessageDialog(this, "CPF inválido!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "E-mail inválido!",
                    "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        }
        cdao.close();
        edao.close();
    }//GEN-LAST:event_jBCadastrarActionPerformed
    
    /*Depois de digitar o cep e clicar fora do campo JFTCEP é realizado 
    uma busca no banco do endereço correspondente, caso encontre os campos
    serão populados, caso contrário nada acontece.
    */
    private void jFTCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTCEPFocusLost
        this.endereco = new EnderecoDAO().buscaPorCEP(jFTCEP.getText());

        if (this.endereco != null) {
            verifica = true;
            jTBairro.setText(this.endereco.getBairro());
            jTCidade.setText(this.endereco.getCidade());
            jTLogradouro.setText(this.endereco.getLogradouro());
            jTNumero.setText("");
            jTComplemento.setText("");
            for (int i = 0; i < 27; i++) {
                if (endereco.getEstado().equals(jCBEstado.getItemAt(i))) {
                    jCBEstado.setSelectedIndex(i);
                }
            }
        } else {
            jTBairro.setText("");
            jTCidade.setText("");
            jTLogradouro.setText("");
            jCBEstado.setSelectedIndex(0);
            jTNumero.setText("");
            jTComplemento.setText("");
            verifica = false;
            JOptionPane.showMessageDialog(CadastrarCliente.this,
                    " Endereço não cadastrado!", "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jFTCEPFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBEstado;
    private com.toedter.calendar.JDateChooser jDCNascimento;
    private javax.swing.JFormattedTextField jFTCEP;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTLogradouro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRG;
    // End of variables declaration//GEN-END:variables
    
    /*Limpa a tela fechando a antiga e reabrindo a mesma*/
    private void limpar() {
        try {
            CadastrarCliente cp = new CadastrarCliente(painel);
            painel.add(cp);
            this.dispose();
            cp.show();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /*Marca todos os campos obrigatórios para realizar a atualização do
    cadastro
    */
    private void marca() {
        jLNome.setText("Nome:*");
        jLData.setText("Data:");
        jLCPF.setText("CPF:*");
        jLRG.setText("RG:*");
        jLCEP.setText("CEP:*");
        jLBairro.setText("Bairro:*");
        jLLogradouro.setText("Logradouro:*");
        jLNumero.setText("Numero*");
        jLEstado.setText("Estado:*");
        jLCidade.setText("Cidade:*");
    }
    
    /*Cria a query responsavel por realizar uma consulta no banco que 
    retorna o cpf do cliente
    */
    private String queryCPF(String cpf) {
        return "SELECT cliente.cpf FROM Cliente cliente"
                + " WHERE cliente.cpf = '" + cpf + "'";
    }
}
