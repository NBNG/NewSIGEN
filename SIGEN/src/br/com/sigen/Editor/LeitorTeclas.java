package br.com.sigen.Editor;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.swing.JOptionPane;

public class LeitorTeclas implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        //sem codigo
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F1) {
            String caminho = "C:\\siroc\\ajuda\\Manual do Proprietário - SIROC versão 1.9.9.pdf";
            File arquivo = new File(caminho);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //sem codigo
    }

}
