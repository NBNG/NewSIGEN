
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matteus
 */
public class ModeloCliente {

    public List<Object[]> buscaPedido(String consulta) {
        Session session = new ConnectionFactory().getSession();
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public static void main(String[] args) {
        ModeloCliente m = new ModeloCliente();
        List<Object[]> list;

        String consulta = "FROM Letra letra INNER JOIN letra.quadra as quadra "
                + "WHERE quadra.quadra ='A'";

        list = m.buscaPedido(consulta);
        for (int i = 0; i < list.size(); i++) {
            Object[] resultado = list.get(i);
            Letra letra = (Letra) resultado[0];
            Quadra quadra = (Quadra) resultado[1];
            System.out.println(letra.getLetra());
            System.out.println(quadra.getQuadra());
        }
    }
}
