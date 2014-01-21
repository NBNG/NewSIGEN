/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Dao;

import br.com.sigen.Modelo.Parcela;
import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author matteus
 */
public class ParcelaDAO {

    private Session session;

    public ParcelaDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public List<Parcela> buscaAvancada(String consulta) {

        Transaction tx = session.beginTransaction();

        Query query = session.createQuery(consulta);
        List<Parcela> parcelas = query.list();

        tx.commit();

        return parcelas;
    }

    public void close() {
        session.close();
    }
}
