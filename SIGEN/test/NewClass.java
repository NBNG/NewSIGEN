
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Obito;
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
        return "SELECT obito.chapa.venda.cliente.nome, obito.nome, "
                + "obito.idade, obito.cidade, obito.protocolo, obito.guia, "
                + "obito.data, obito.numeroDocumento, obito.pai, obito.mae, "
                + "obito.medico, obito.causaMorte, " 
                + "obito.chapa.letra.quadra.quadra, obito.chapa.letra.letra, "
                + "obito.chapa.chapa FROM Obito obito";// WHERE 1=1";

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

        }
    }

    public static void main(String[] args) {
        DAO<Obito> o = new DAO<>(Obito.class);
        List<Object[]> l = o.buscaAvançada(query());
        for(int i = 0; i < l.size(); i++){
            for(int c = 0; c < l.get(i).length; c++ ){
                System.out.print(l.get(i)[c]+"  ");
            }
            System.out.println();
        }
        
    }

}
