/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Dao;

/**
 *
 * @author matteus
 */
import br.com.sigen.Modelo.Pessoa;
import br.com.sigen.fabrica.ConnectionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PessoaDAO {

    private Session session;

    public PessoaDAO() {
        session = new ConnectionFactory().getSession();
    }

    public Pessoa buscaPorCNPJ(String cpf) {

        Transaction tx = session.beginTransaction();

        Pessoa cliente = null;

        String consulta = "FROM Pessoa WHERE pes_cpf = :cpf";

        Query query = session.createQuery(consulta);
        query.setParameter("cpf", cpf);

        if (query.list().size() > 0) {
            cliente = (Pessoa) query.list().get(0);
        }

        tx.commit();

        return cliente;
    }
}
