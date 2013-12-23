/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

/**
 *
 * @author user
 */
public class AlterarSenha extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alterar_Senha
     */
    public AlterarSenha() {
        super("SIGEN - Alteração de senha de usuário");
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

        jLCabecalho = new javax.swing.JLabel();
        jLSenhaAtual = new javax.swing.JLabel();
        jLNovaSenha = new javax.swing.JLabel();
        jLSenha2 = new javax.swing.JLabel();
        jBConfirmar = new javax.swing.JButton();
        jPFSenhaAtual = new javax.swing.JPasswordField();
        jPFNovaSenha = new javax.swing.JPasswordField();
        jPFSenha2 = new javax.swing.JPasswordField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Alteração de Senha");

        jLSenhaAtual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSenhaAtual.setText("Senha Atual:");

        jLNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNovaSenha.setText("Nova Senha:");

        jLSenha2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSenha2.setText("Repita a nova Senha:");

        jBConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sigen/Imagens/salvar.png"))); // NOI18N
        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jPFSenhaAtual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPFNovaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPFSenha2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBConfirmar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLNovaSenha)
                                    .addComponent(jLSenhaAtual)
                                    .addComponent(jLSenha2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPFSenhaAtual)
                                    .addComponent(jPFNovaSenha)
                                    .addComponent(jPFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenhaAtual)
                    .addComponent(jPFSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNovaSenha)
                    .addComponent(jPFNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha2)
                    .addComponent(jPFSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jBConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmpresa)
                    .addComponent(jLVersao)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed

    }//GEN-LAST:event_jBConfirmarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLNovaSenha;
    private javax.swing.JLabel jLSenha2;
    private javax.swing.JLabel jLSenhaAtual;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JPasswordField jPFNovaSenha;
    private javax.swing.JPasswordField jPFSenha2;
    private javax.swing.JPasswordField jPFSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
