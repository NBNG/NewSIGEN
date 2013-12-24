
import br.com.sigen.Modelo.Estado;
import br.com.sigen.dao.DAO;

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
    public static void main (String [] args){
        Estado e = new Estado();
        e.setSigla("SP");
        e.setNome("São Paulo");
        DAO<Estado> edao = new DAO<Estado>(Estado.class);
        edao.adicionar(e);
    }
}
