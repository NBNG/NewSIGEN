package br.com.sigen.Jasper;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class CriaCarteirinha extends Thread {

    private Connection conexao;
    Long id;

    public CriaCarteirinha(Long id) {
        this.id = id;
        //this.conexao = ConnectionFactory.getConexao();
    }

    @Override
    public void run() {
        try {

            String xml = new File("../src/br/com/sigen/Jasper/card.jrxml").getCanonicalPath();

            JasperDesign desenho = JRXmlLoader.load(xml);
            JasperReport relatorio = JasperCompileManager.compileReport(desenho);

            String query = "select proprietarios.pro_nome, proprietarios.pro_rg,proprietarios.pro_cpf,"
                    + "to_char(proprietarios.pro_nascimento,'dd/mm/yyyy'), to_char(current_date,'dd/mm/yyyy') as emissao,"
                    + " cidades.cid_nome || ' - ' || cidades.est_sigla as ENDERECO from proprietarios "
                    + "inner join enderecos on proprietarios.end_id = enderecos.end_id "
                    + "inner join cidades on cidades.cid_codigo = enderecos.cid_codigo "
                    + "where proprietarios.pro_codigo = '" + id + "'";
            System.out.println(query);
            PreparedStatement pstmt = this.conexao.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

            HashMap parametros = new HashMap();
            parametros.put("termo", new Double(10));

            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
            //JasperPrintManager.printPage(impressao, 0, true);
            JasperViewer.viewReport(impressao);
        } catch (IOException | JRException | SQLException jr) {
            jr.printStackTrace();
        }

    }
}
