/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sigen.Dao;

import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.Modelo.Pessoa;
import br.com.sigen.fabrica.ConnectionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gustavo-Diane
 */
public class FuncionarioDAO {
    
    private Session session;

    public FuncionarioDAO() {
        session = new ConnectionFactory().getSession();
    }

    public Funcionario adiciona(Funcionario funcionario) {
        Transaction tx = session.beginTransaction();
        session.save(funcionario);
        tx.commit();
        return funcionario;
    }
}
