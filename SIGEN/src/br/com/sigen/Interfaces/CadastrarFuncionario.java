package br.com.sigen.Interfaces;

import br.com.sigen.Builder.EnderecoBuilder;
import br.com.sigen.Builder.FuncionarioBuilder;
import br.com.sigen.Dao.EnderecoDAO;
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.dao.DAO;
import java.text.ParseException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 * teste
 *
 * @author user
 */
public class CadastrarFuncionario extends javax.swing.JInternalFrame {

    Funcionario funcionario;
    Endereco endereco;
    DAO<Funcionario> funcionariodao;
    JDesktopPane painel;
    private Boolean verifica;

    public CadastrarFuncionario(JDesktopPane painel) throws ParseException {
        super("SIGEN - Cadastro de Funcionários");
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        MaskFormatter maskCEP = new MaskFormatter("#####-###");
        maskTelefone.install(jFTTelefone);
        maskCelular.install(jFTCelular);
        maskCPF.install(jFTCPF);
        maskCEP.install(jFTCEP);
        jTLogin.setToolTipText("PrimeiroNome.UltimoNome");
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

        jBCadastrar = new javax.swing.JButton();
        jFTCelular = new javax.swing.JFormattedTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jLCelular = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jTRG = new javax.swing.JTextField();
        jLCabecalho = new javax.swing.JLabel();
        jLCTPS = new javax.swing.JLabel();
        jTCTPS = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jLNumero = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jTComplemento = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox();
        jLEstado = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jTLogradouro = new javax.swing.JTextField();
        jLLogin = new javax.swing.JLabel();
        jTLogin = new javax.swing.JTextField();
        jFTCPF = new javax.swing.JFormattedTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jFTCEP = new javax.swing.JFormattedTextField();
        jTSenha = new javax.swing.JPasswordField();

        setClosable(true);

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Funcionários");

        jLCTPS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCTPS.setText("CTPS:");

        jTCTPS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Número:");

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogradouro.setText("Logradouro:");

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jTLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogin.setText("Login:");

        jTLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jLSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSenha.setText("Senha:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("E-mail:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTCEPFocusLost(evt);
            }
        });

        jTSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLCelular)
                                .addGap(18, 18, 18)
                                .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLEmail)
                                .addGap(18, 18, 18)
                                .addComponent(jTEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLLogin)
                                .addGap(18, 18, 18)
                                .addComponent(jTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCTPS)
                                .addGap(18, 18, 18)
                                .addComponent(jTCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jFTCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jLRG)
                                .addGap(18, 18, 18)
                                .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCEP)
                                .addGap(18, 18, 18)
                                .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBLimpar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLComplemento)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLBairro)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTBairro))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLLogradouro)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTLogradouro)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLNumero)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLCidade)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLEstado)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(8, 8, 8)))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTLogin, jTSenha});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLogin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLSenha)
                        .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRG)
                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCTPS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCEP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCidade)
                        .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEstado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
        funcionariodao = new DAO<>(Funcionario.class);
        try {
            if (verifica == null) {
                /*Caso não foi realizado a busca pelo CEP, o sistema lança um
                alerta, e só prossegue quando a operação for realizada
                */
                JOptionPane.showMessageDialog(this, "Faça a "
                        + "pesquisa do CEP antes de confirmar um cadastro!",
                        "Invalid Operation!", JOptionPane.ERROR_MESSAGE);
            } else {
                if (this.endereco == null) {
                    /*Caso o endereço seja nulo, isto é não existe no banco,
                    um novo endereço é criado, e adicionado no banco
                    */
                    this.endereco = new EnderecoBuilder().setBairro(jTBairro.getText()).
                            setCep(jFTCEP.getText()).setCidade(jTCidade.getText()).
                            setEstado(jCBEstado.getSelectedItem().toString()).
                            setLogradouro(jTLogradouro.getText()).getEndereco();
                    EnderecoDAO daoEnd = new EnderecoDAO();
                    this.endereco = daoEnd.adiciona(this.endereco);
                    daoEnd.close();
                }

                this.funcionario = new FuncionarioBuilder().setNome(jTNome.getText()).
                        setCpf(jFTCPF.getText()).setRg(jTRG.getText()).
                        setTelefone(jFTTelefone.getText()).
                        setCelular(jFTCelular.getText()).setEmail(jTEmail.getText()).
                        setComplemento(jTComplemento.getText()).
                        setNumero(jTNumero.getText()).
                        setCtps(jTCTPS.getText()).setLogin(jTLogin.getText()).
                        setSenha(jTSenha.getText()).setEndereco(this.endereco).
                        getFuncionario();

                funcionariodao.adicionar(this.funcionario);
                
                JOptionPane.showMessageDialog(CadastrarFuncionario.this, "Funcionario"
                        + " adicionado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(CadastrarFuncionario.this, "Campos"
                    + " obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(CadastrarFuncionario.this, "CPF, Login e/ou"
                    + " E-mail já cadastrado(s)!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CadastrarFuncionario.this,
                    "E-mail inválido!", "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Error e) {
            JOptionPane.showMessageDialog(CadastrarFuncionario.this,
                    "CPF inválido!", "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        }
        funcionariodao.close();
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jFTCEPFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JFormattedTextField jFTCEP;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCTPS;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCTPS;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTLogin;
    private javax.swing.JTextField jTLogradouro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRG;
    private javax.swing.JPasswordField jTSenha;
    // End of variables declaration//GEN-END:variables

    /*Marca todos os campos obrigatórios para realizar a atualização do
    cadastro
    */
    private void marca() {
        jLNome.setText("Nome:*");
        jLLogin.setText("Login:*");
        jLSenha.setText("Senha:*");
        jLCEP.setText("CEP:*");
        jLCTPS.setText("CTPS:*");
        jLCPF.setText("CPF:*");
        jLRG.setText("RG:*");
        jLBairro.setText("Bairro:*");
        jLLogradouro.setText("Logradouro:*");
        jLNumero.setText("Numero:*");
        jLEstado.setText("Estado:*");
        jLCidade.setText("Cidade:*");
    }

    /*Limpa a tela fechando a antiga e reabrindo a mesma*/
    private void limpar() {
        try {
            CadastrarFuncionario cf = new CadastrarFuncionario(painel);
            painel.add(cf);
            this.dispose();
            cf.show();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
