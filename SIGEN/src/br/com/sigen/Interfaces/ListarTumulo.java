/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Interfaces;

import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.Modelo.Venda;
import br.com.sigen.dao.DAO;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ListarTumulo extends javax.swing.JInternalFrame {

    DAO<Quadra> dao = new DAO<>(Quadra.class);
    List<Object[]> list;
    Object[] resultado;
    Quadra quadra;
    Letra letra;
    Chapa chapa;
    Venda venda;
    DefaultTableModel tmTumulo = new DefaultTableModel(null, new String[]{"Quadra", "Letra", "Chapa", "Proprietário"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    //List de uma classe do modelo para utilização na tabela;
    ListSelectionModel lsmTumulo;
    JDesktopPane painel;

    public ListarTumulo(JDesktopPane painel) {
        super("SIGEN - Listagem de Túmulos");
        initComponents();
        tabela.setRowHeight(23);
        this.painel = painel;
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

        setClosable(true);

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmTumulo);
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listagem de Túmulos");

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                .addComponent(jLVersao))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVersao)
                    .addComponent(jLEmpresa)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    private String montaQuery() {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    private void listar() {
        list = dao.buscaAvançada(montaQuery());

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            chapa = (Chapa) resultado[0];
            letra = (Letra) resultado[1];
            quadra = (Quadra) resultado[2];
            venda = (Venda) resultado[3];

            tmTumulo.addRow(new String[]{null, null, null, null});
            tmTumulo.setValueAt(quadra.getQuadra(), i, 0);
            tmTumulo.setValueAt(letra.getLetra(), i, 1);
            tmTumulo.setValueAt(chapa.getChapa(), i, 2);
            if (venda != null) {
                tmTumulo.setValueAt(venda.getCliente().getNome(), i, 3);
            } else {
                tmTumulo.setValueAt("", i, 3);
            }
        }
    }
}
