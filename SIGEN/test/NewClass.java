
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

public class NewClass {

    private Session session = new ConnectionFactory().getSession();

    private String montaQuery(String letra, String quadra) {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
                + "letra.letra ='" + letra + "' AND "
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void pesquisaVendida() {
        List<Object[]> list = buscaAvançada(montaQuery("L4","C"));
        Object[] resultado;

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Chapa chapa = (Chapa) resultado[0];
            System.out.println(chapa.getChapa());
        }
    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.pesquisaVendida();
    }
}
