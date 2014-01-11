package br.com.sigen.Dao;

import br.com.sigen.Modelo.Endereco;
import br.com.sigen.fabrica.ConnectionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gustavo-Diane
 */
public class EnderecoDAO {

    private Session session;

    public EnderecoDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public Endereco adiciona(Endereco endereco) {
        Transaction tx = session.beginTransaction();
        session.save(endereco);
        tx.commit();
        return endereco;
    }

    public Endereco buscaPorCEP(String cep) {

        Transaction tx = session.beginTransaction();

        Endereco endereco = null;

        String consulta = "FROM Endereco WHERE end_cep = :cep";

        Query query = session.createQuery(consulta);
        query.setParameter("cep", cep);

        if (query.list().size() > 0) {
            endereco = (Endereco) query.list().get(0);
        }

        tx.commit();

        return endereco;
    }
    
    public void close(){
        session.close();
    }
}
