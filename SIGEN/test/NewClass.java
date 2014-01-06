
import br.com.sigen.Modelo.Letra;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

public class NewClass {

    private Session session = new ConnectionFactory().getSession();

    private String montaQuery(String quadra) {
         return "FROM Chapa chapa "
                + "INNER JOIN chapa.letra as letra"
                + " INNER JOIN letra.quadra as quadra"
                + " LEFT JOIN chapa.venda as venda "
                + "WHERE quadra.quadra ='" + quadra + "' AND "
  
                + "venda.chapa is null"
                + " ORDER BY quadra.quadra,letra.letra,chapa.chapa";
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void pesquisaVendida() {
        List<Object[]> list = buscaAvançada(montaQuery("B"));
        Object[] resultado;        

        for (int i = 0; i < list.size(); i++) {
            resultado = list.get(i);
            Letra letra = (Letra) resultado[1];
            System.out.println(letra.getLetra());
        }
    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.pesquisaVendida();
    }
}
