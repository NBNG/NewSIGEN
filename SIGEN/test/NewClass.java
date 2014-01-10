
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Venda;
import br.com.sigen.dao.DAO;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

public class NewClass {

    private Session session = new ConnectionFactory().getSessionFactory().openSession();

    ;

    private String montaQuery(String cpf) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda"
                + " INNER JOIN venda.cliente as cliente "
                + "WHERE cliente.cpf ='" + cpf + "' "
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    private static String queryLetra(String quadra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    public static String query() {
        return "SELECT venda.cliente.nome, venda.cliente.cpf, venda.cliente.rg, "
                + "venda.chapa.letra.quadra.quadra, venda.chapa.chapa, "
                + "venda.chapa.letra.letra, venda.data "
                + "FROM Venda venda WHERE lower(cliente.nome) "
                + "like lower('%ma%') ";

        /*"SELECT cliente.nome, cliente.cpf, cliente.rg,"
         + " quadra.quadra,chapa.chapa, letra.letra, venda.data "
         + "FROM Venda venda "
         + "INNER JOIN venda.cliente cliente "
         + "INNER JOIN venda.chapa chapa "
         + "INNER JOIN chapa.letra letra "
         + "INNER JOIN letra.quadra quadra "
         + "INNER JOIN chapa.obitos obito "
         + "Where lower(cliente.nome) "
         + "like lower('%ma%') ";*/
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void pesquisaVendida() {
        List<Object[]> list = buscaAvançada(montaQuery("406.943.508-50"));
        Object[] resultado;

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Letra letra = (Letra) resultado[1];
            System.out.println(letra.getLetra());
        }
    }

    public static void main(String[] args) {
        String xml = System.getenv("ProgramFiles") + "\\nbng\\sigen\\xml\\card.jrxml";
        String caminho = System.getenv("USERPROFILE") + "\\meus documentos\\nbng\\sigen\\pdfs";
        System.out.println(xml);
        System.out.println(caminho);
        
    }

}
