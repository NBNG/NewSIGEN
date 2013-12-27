/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sigen.Dao;

import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.fabrica.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gustavo-Diane
 */
public class EnderecoDAO {
        
    private Session session;

    public EnderecoDAO() {
        session = new ConnectionFactory().getSession();
    }

    public Endereco adiciona(Endereco endereco) {
        Transaction tx = session.beginTransaction();
        session.save(endereco);
        tx.commit();
        return endereco;
    }
}
