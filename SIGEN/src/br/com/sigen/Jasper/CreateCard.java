package br.com.sigen.Jasper;

import com.google.api.client.util.ArrayMap;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author user
 */
public class CreateCard {

    private Connection conect;
    private String xml = System.getenv("USERPROFILE") + "\\meus documentos\\nbng\\sigen\\xml\\card.jrxml";
    private String imagem = System.getenv("USERPROFILE") + "\\meus documentos\\nbng\\sigen\\xml\\logo.png";
    private String caminho = System.getenv("USERPROFILE") + "\\meus documentos\\nbng\\sigen\\pdfs";

    public CreateCard() {
        this.conect = getConect();
    }

    public static Connection getConect() {

        try {
            return DriverManager.getConnection("jdbc:postgresql://"
                    + "localhost:5432/sigen", "postgres", "senha");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void gerarPedido(Long id, int tipo) throws JRException, SQLException, IOException {
        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select cliente.cli_nome,cliente.cli_rg,"
                + "cliente.cli_cpf,to_char(cliente.cli_data,'dd/mm/yyyy'),"
                + "to_char(current_date,'dd/mm/yyyy') as emissao,"
                + "endereco.end_cidade|| ' - ' || endereco.end_estado as"
                + " ENDERECO from cliente inner join endereco on"
                + " cliente.fk_endereco = endereco.end_id "
                + "where cliente.cli_id ='" + id + "'";
        PreparedStatement pstmt = this.conect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        Map<String, Object> parametros = new ArrayMap<>();
        parametros.put("imagem", imagem);

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho = caminho + "\\card - " + id + ".pdf";
            JasperExportManager.exportReportToPdfFile(impressao, caminho);
        }
    }
}
