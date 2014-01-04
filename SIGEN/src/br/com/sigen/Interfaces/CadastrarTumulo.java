package br.com.sigen.Interfaces;

import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.dao.DAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CadastrarTumulo extends javax.swing.JInternalFrame {

    DAO<Quadra> daoQuadra;
    DAO<Letra> daoLetra;
    DAO<Chapa> daoChapa;
    Quadra quadra;
    Letra letra;
    Chapa chapa;
    String novaQuadra;
    String novaLetra;
    List<Quadra> listaQuadra;
    List<Letra> listaLetra;
    String vetor[];

    public CadastrarTumulo() {
        super("SIGEN - Cadastrar Túmulos");
        DAO<Quadra> daoQuadra = new DAO<>(Quadra.class);
        listaQuadra = daoQuadra.listaTodos();
        vetor = new String[listaQuadra.size()];
        for (int i = 0; i < listaQuadra.size(); i++) {
            vetor[i] = listaQuadra.get(i).getQuadra();
        }
        daoQuadra = null;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTChapa = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jLLetra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLQuadra = new javax.swing.JLabel();
        jLCabecalho = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jCBQuadra = new javax.swing.JComboBox();
        jRBQuadra = new javax.swing.JRadioButton();
        jRBOkquadra = new javax.swing.JRadioButton();
        jCBLetra = new javax.swing.JComboBox();
        jRBNovaLetra = new javax.swing.JRadioButton();
        jRBOKletra = new javax.swing.JRadioButton();

        setClosable(true);

        jTChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Chapa:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Letra:");

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastrar Túmulo");

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/limpar.png"))); // NOI18N
        jBCancelar.setText("Limpar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.setModel(new javax.swing.DefaultComboBoxModel(vetor));
        jCBQuadra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCBQuadraMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCBQuadraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCBQuadraMousePressed(evt);
            }
        });
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });
        jCBQuadra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBQuadraFocusLost(evt);
            }
        });
        jCBQuadra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCBQuadraKeyReleased(evt);
            }
        });

        jRBQuadra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRBQuadra.setText("Nova Quadra");
        jRBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBQuadraActionPerformed(evt);
            }
        });

        jRBOkquadra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRBOkquadra.setText("OK");
        jRBOkquadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOkquadraActionPerformed(evt);
            }
        });

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.setModel(new javax.swing.DefaultComboBoxModel());

        jRBNovaLetra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRBNovaLetra.setText("Nova Letra");
        jRBNovaLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNovaLetraActionPerformed(evt);
            }
        });

        jRBOKletra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRBOKletra.setText("OK");
        jRBOKletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOKletraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLChapa)
                                    .addComponent(jLLetra))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLQuadra)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCBLetra, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBQuadra, javax.swing.GroupLayout.Alignment.LEADING, 0, 88, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBNovaLetra)
                                    .addComponent(jRBOkquadra)
                                    .addComponent(jRBOKletra)
                                    .addComponent(jRBQuadra)))
                            .addComponent(jTChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLCabecalho)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao)
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLCabecalho)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQuadra))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLChapa)
                            .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jRBQuadra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBOkquadra)
                        .addGap(18, 18, 18)
                        .addComponent(jRBNovaLetra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBOKletra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLetra)
                    .addComponent(jTChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBCancelar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVersao)
                    .addComponent(jLEmpresa)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if(quadra == null){
            quadra = new Quadra();
            quadra = listaQuadra.get(jCBQuadra.getSelectedIndex());
        }else{
            daoQuadra = new DAO<>(Quadra.class);
            quadra = daoQuadra.adicionaRetorno(quadra);
            daoQuadra = null;
        }
        
        
        if(letra == null){
            letra = new Letra();
            letra.setQuadra(quadra);
            letra = listaLetra.get(jCBLetra.getSelectedIndex());
        }else{
            daoLetra = new DAO<>(Letra.class);
            letra.setQuadra(quadra);
            letra = daoLetra.adicionaRetorno(letra);
            daoLetra = null;
        }
        
        
        //letra = new Letra();
//        letra.setLetra(jTLetra.getText());
        //letra.setQuadra(quadra);
        //letra = daoLetra.adicionaRetorno(letra);
        //daoLetra = null;
        
        daoChapa = new DAO<>(Chapa.class);
        chapa = new Chapa();
        chapa.setChapa(jTChapa.getText());
        chapa.setLetra(letra);
        daoChapa.adicionaRetorno(chapa);
        System.out.println(chapa.getCodigo());
        
        quadra = null;
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jRBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBQuadraActionPerformed
        if (jRBQuadra.isSelected()) {
            jRBOkquadra.setSelected(false);
            jCBQuadra.setEditable(true);
            jCBQuadra.setSelectedIndex(jCBQuadra.getItemCount()-1);
        } else {
            jCBQuadra.setEditable(false);
            jCBQuadra.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRBQuadraActionPerformed

    private void jRBOkquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOkquadraActionPerformed
        //adiciona nova quadra na lista.
        if (jRBOkquadra.isSelected()) {
            jRBQuadra.setSelected(false);
            novaQuadra = (String) jCBQuadra.getSelectedItem();
            if(verificaQuadra(novaQuadra)){
                jCBQuadra.addItem(novaQuadra);
                jCBQuadra.setSelectedIndex(jCBQuadra.getItemCount()-1);
                quadra = new Quadra();
                quadra.setQuadra(novaQuadra);
                jCBQuadra.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(this, "Quadra ja cadastrada.",
                        "Invalid Operation!", JOptionPane.ERROR_MESSAGE);
                jRBOkquadra.setSelected(false);
                jCBQuadra.setEditable(false);
            }
        }
    }//GEN-LAST:event_jRBOkquadraActionPerformed

    private void jCBQuadraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBQuadraKeyReleased

    }//GEN-LAST:event_jCBQuadraKeyReleased

    private void jCBQuadraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBQuadraFocusLost

    }//GEN-LAST:event_jCBQuadraFocusLost

    private void jCBQuadraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBQuadraMouseReleased
        
    }//GEN-LAST:event_jCBQuadraMouseReleased

    private void jCBQuadraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBQuadraMousePressed

    }//GEN-LAST:event_jCBQuadraMousePressed

    private void jCBQuadraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBQuadraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBQuadraMouseExited

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
       //ao selecionar uma quadra, todas as letras relacionadas à aquela quadra
       //serão carregadas no combo box de letra 
        daoLetra = new DAO<>(Letra.class);
        List<Object[]> lista = daoLetra.buscaAvançada(montaQuery((String)jCBQuadra.getSelectedItem()));
        listaLetra = new ArrayList<Letra>();
        
        for (int i = 0; i < lista.size(); i++) {
            Object[] resultado = lista.get(i);
            listaLetra.add((Letra) resultado[0]);
            jCBLetra.addItem(listaLetra.get(i).getLetra());
        }
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jRBNovaLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNovaLetraActionPerformed
        if (jRBNovaLetra.isSelected()) {
            jRBOKletra.setSelected(false);
            jCBLetra.setEditable(true);
            jCBLetra.setSelectedIndex(jCBLetra.getItemCount()-1);
        } else {
            jCBQuadra.setEditable(false);
            jCBQuadra.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRBNovaLetraActionPerformed

    private void jRBOKletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOKletraActionPerformed
        //verifica se a letra adiconada é valida então insere na lista.
        if (jRBOKletra.isSelected()) {
            jRBNovaLetra.setSelected(false);
            novaLetra = (String) jCBLetra.getSelectedItem();
            if(verificaLetra(novaLetra)){
                jCBLetra.addItem(novaLetra);
                jCBLetra.setSelectedIndex(jCBLetra.getItemCount()-1);
                letra = new Letra();
                letra.setLetra(novaLetra);
                jCBLetra.setEditable(false);
            }else{
                JOptionPane.showMessageDialog(this, "Letra ja cadastrada.",
                        "Invalid Operation!", JOptionPane.ERROR_MESSAGE);
                jRBOkquadra.setSelected(false);
                jCBQuadra.setEditable(false);
            }
        }
    }//GEN-LAST:event_jRBOKletraActionPerformed

    private boolean verificaQuadra(String quadra){
        for(int i = 0; i < jCBQuadra.getItemCount(); i++){
            if(quadra.equals(jCBQuadra.getItemAt(i)))
                return false;
        }
        return true;
    }    
    
    private boolean verificaLetra(String letra){
        for(int i = 0; i < jCBLetra.getItemCount(); i++){
            if(letra.equals(jCBLetra.getItemAt(i)))
                return false;
        }
        return true;
    } 
    
    private String montaQuery(String quadra){
        return "FROM Letra letra INNER JOIN letra.quadra as quadra "
                  + "WHERE quadra.quadra = '"+quadra+"'";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JRadioButton jRBNovaLetra;
    private javax.swing.JRadioButton jRBOKletra;
    private javax.swing.JRadioButton jRBOkquadra;
    private javax.swing.JRadioButton jRBQuadra;
    private javax.swing.JTextField jTChapa;
    // End of variables declaration//GEN-END:variables

}
