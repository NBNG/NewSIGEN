package br.com.sigen.Banco;


import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Backup {

    public static void fazBackup() {
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            String caminho = System.getenv("USERPROFILE") + "\\My Documents\\siroc\\backup";
            ProcessBuilder pb;
            Process p;
            pb = new ProcessBuilder("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe ",
                    "-i", "-h", "localhost", "-p", "5432", "-U", "postgres", "-F", "t", "-b", "-v", "-f",
                    "\\bkp.sql", "sigen");
            pb.environment().put("PGPASSWORD", "senha");
            //pb.redirectErrorStream(true);
            p = pb.start();
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado, contate o administrador do sistema e informe o erro: \n" + ex);
        }
    }
}
