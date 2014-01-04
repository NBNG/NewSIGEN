
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

public class NewClass {

    private Session session = new ConnectionFactory().getSession();

    private String montaQuery() {
        return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.cliente as cliente"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        List<Object[]> list = n.buscaAvançada(n.montaQuery());
        Object[] resultado;
        Quadra quadra;
        Letra letra;
        Chapa chapa;
        Cliente cliente;
        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            chapa = (Chapa) resultado[0];
            letra = (Letra) resultado[1];
            quadra = (Quadra) resultado[2];
            cliente = (Cliente) resultado[3];

            System.out.println(quadra.getQuadra());
            System.out.println(letra.getLetra());
            System.out.println(chapa.getChapa());
            //System.out.println(cliente.getNome());
            System.out.println();
        }
    }
}
