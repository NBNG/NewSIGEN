
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.Modelo.Venda;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

public class NewClass {

    private Session session = new ConnectionFactory().getSession();

    private String montaQueryVendida() {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " INNER JOIN chapa.venda as venda "
                + "where chapa.venda is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    private String montaQuery() {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " INNER JOIN chapa.venda as venda"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa,"
                + "chapa.venda.cliente.nome";
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void pesquisaVendida() {
        List<Object[]> list = buscaAvançada(montaQueryVendida());
        Object[] resultado;
        Quadra quadra;
        Letra letra;
        Chapa chapa;
        Venda venda;
        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);

            chapa = (Chapa) resultado[0];
            letra = (Letra) resultado[1];
            quadra = (Quadra) resultado[2];
            //venda = (Venda) resultado[3];

            System.out.println(quadra.getQuadra());
            System.out.println(letra.getLetra());
            System.out.println(chapa.getChapa());
            //System.out.println(venda.getCliente().getNome());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.pesquisaVendida();
    }
}
