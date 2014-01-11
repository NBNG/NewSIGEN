/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

import br.com.sigen.Builder.EnderecoBuilder;
import br.com.sigen.Builder.FuncionarioBuilder;
import br.com.sigen.Dao.EnderecoDAO;
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.dao.DAO;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class AtualizaFuncionario extends javax.swing.JFrame {

    Funcionario funcionario;
    Funcionario newFuncionario;
    Endereco endereco;
    DAO<Funcionario> fdao;
    DAO<Endereco> edao;
    Boolean verifica;
    ListarFuncionario lista;
    JDesktopPane painel;

    public AtualizaFuncionario(Funcionario funcionario, ListarFuncionario lista,
            JDesktopPane painel) throws SQLException, ParseException {
        super("SIGEN - Alteração de Cadastro dos Funcionários");
        this.funcionario = funcionario;
        this.newFuncionario = funcionario;
        this.setResizable(false);
        this.lista = lista;
        this.painel = painel;
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        MaskFormatter maskCep = new MaskFormatter("#####-###");
        maskTelefone.install(jFTTelefone);
        maskCelular.install(jFTCelular);
        maskCep.install(jFTCEP);
        maskCPF.install(jFTCPF);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/br/com/sigen/Imagens/icone.png")));
        preencheCampos(newFuncionario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCTPS = new javax.swing.JLabel();
        jLCabecalho = new javax.swing.JLabel();
        jTRG = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jFTCelular = new javax.swing.JFormattedTextField();
        jTCTPS = new javax.swing.JTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jFTCEP = new javax.swing.JFormattedTextField();
        jTNumero = new javax.swing.JTextField();
        jLEstado = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jTLogradouro = new javax.swing.JTextField();
        jTComplemento = new javax.swing.JTextField();
        jLCEP = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCTPS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCTPS.setText("CTPS:");

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Funcionários");

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCTPS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("E-mail:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogradouro.setText("Logradouro:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Número:");

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTCEPFocusLost(evt);
            }
        });

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jTLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLRG)
                                .addGap(18, 18, 18)
                                .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCTPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCTPS))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCEP)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLCelular)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jFTCelular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTEmail)))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jLRG)
                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCTPS)
                    .addComponent(jTCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(35, 35, 35)
                .addComponent(jBEditar)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmpresa)
                    .addComponent(jLVersao)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        try {
            if (verifica == null) {
                /*Caso não foi realizado a busca pelo CEP, o sistema lança um
                alerta, e só prossegue quando a operação for realizada
                */
                JOptionPane.showMessageDialog(this, "Faça a "
                        + "pesquisa do CEP antes de confirmar um cadastro!",
                        "Invalid Operation!", JOptionPane.ERROR_MESSAGE);
            } else {
                /*Caso o CEP foi pesquisado é verificado no banco de o CEP 
                ja existe na base de dados, se sim o endereço é atualizado
                senão é cadastrado. É necessário que o endereço seja 
                cadastrado/atualizado primeiro, pois um cliente possui um 
                endereço assim é preciso que ja exista no banco para realizar
                a atualização do funcionário.
                */
                Endereco endereco = new EnderecoBuilder().setBairro(jTBairro.getText()).
                        setCep(jFTCEP.getText()).setCidade(jTCidade.getText()).
                        setEstado(jCBEstado.getSelectedItem().toString()).
                        setLogradouro(jTLogradouro.getText()).setCodigo(funcionario.getEndereco().getCodigo()).
                        getEndereco();
                edao = new DAO<>(Endereco.class);
                if (funcionario.getEndereco().getCep().equals(endereco.getCep())) {
                   edao.atualiza(endereco);
                } else {
                   edao.adicionar(endereco);
                }
                this.funcionario = new FuncionarioBuilder().setCodigo(funcionario.getCodigo()).
                        setNome(jTNome.getText()).setCelular(jFTCelular.getText()).
                        setComplemento(jTComplemento.getText()).setCpf(jFTCPF.getText()).
                        setCtps(jTCTPS.getText()).setData(funcionario.getData()).
                        setEmail(jTEmail.getText()).setEndereco(endereco).
                        setLogin(funcionario.getLogin()).setNumero(jTNumero.getText()).
                        setRg(jTRG.getText()).setSenha(funcionario.getSenha()).
                        setTelefone(jFTTelefone.getText()).getFuncionario();
                fdao = new DAO<>(Funcionario.class);
                fdao.atualiza(funcionario);

                JOptionPane.showMessageDialog(AtualizaFuncionario.this, "Funcionario"
                        + " atualizado com sucesso!", "Activity Performed "
                        + "Successfully", JOptionPane.INFORMATION_MESSAGE);

                dispose();
                lista.dispose();
                ListarFuncionario lf = new ListarFuncionario(painel);
                painel.add(lf);
                lf.setVisible(true);
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(AtualizaFuncionario.this, "Campos"
                    + " obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(AtualizaFuncionario.this, "CPF e/ou"
                    + " E-mail já cadastrado(s)!",
                    "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NonUniqueObjectException ne) {
            try {
                AtualizaFuncionario ac = new AtualizaFuncionario(newFuncionario, lista, painel);
                this.dispose();
                ac.setVisible(true);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "E-mail inválido!",
                    "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        }
        edao.close();
        fdao.close();
    }//GEN-LAST:event_jBEditarActionPerformed

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
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
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
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCTPS;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTLogradouro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRG;
    // End of variables declaration//GEN-END:variables

    /*Preenche todos os campos com os dados do cliente a ser atualizado*/
    private void preencheCampos(Funcionario funcionario) {
        jFTCelular.setText(funcionario.getCelular());
        jFTTelefone.setText(funcionario.getTelefone());
        jFTCPF.setText(funcionario.getCpf());
        jTCTPS.setText(funcionario.getCtps());
        jTComplemento.setText(funcionario.getComplemento());
        jTNome.setText(funcionario.getNome());
        jTNumero.setText(funcionario.getNumero());
        jTRG.setText(funcionario.getRg());
        jCBEstado.setSelectedItem(funcionario.getEndereco().getEstado());
        jTBairro.setText(funcionario.getEndereco().getBairro());
        jTCidade.setText(funcionario.getEndereco().getCidade());
        jTLogradouro.setText(funcionario.getEndereco().getLogradouro());
        jFTCEP.setText(funcionario.getEndereco().getCep());
        jTEmail.setText(funcionario.getEmail());
    }

    /*Marca todos os campos obrigatórios para realizar a atualização do
    cadastro
    */
    private void marca() {
        jLNome.setText("Nome:*");
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
}
