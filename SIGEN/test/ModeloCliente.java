
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Funcionario;
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

    public static void main(String[] args) {
        Endereco e = new Endereco();
        DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);
        Funcionario f = new Funcionario();
        e.setBairro("Centro");
        e.setCep("12700-000");
        e.setCidade("Cruzeiro");
        e.setComplemento("Casa");
        e.setEstado("SP");
        e.setLogradouro("Capitão Avelino Bastos");
        e.setNumero("27");

        f.setCelular("(12) 98205-4378");
        f.setCpf("406.943.508-50");
        f.setCtps("1111111111");
        f.setEndereco(e);
        f.setNome("Matteus de Carvalho");
        f.setRg("47.753.250-0");
        f.setTelefone("(12) 3144-5831");
 

        dao.adicionar(f);
    }
}
