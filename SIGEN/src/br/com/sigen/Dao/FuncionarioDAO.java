/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Dao;

import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.fabrica.ConnectionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author matteus
 */
public class FuncionarioDAO {

    private Session session;

    public FuncionarioDAO() {
        session = ConnectionFactory.getSessionFactory().openSession();
    }

    public Funcionario buscaLogin(String consulta) {

        Transaction tx = session.beginTransaction();

        Funcionario funcionario = null;

        Query query = session.createQuery(consulta);

        if (query.list().size() > 0) {
            funcionario = (Funcionario) query.list().get(0);
        }

        tx.commit();

        return funcionario;
    }
}
