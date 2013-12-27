
import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.dao.DAO;
import java.util.List;

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
        Funcionario pessoa = new Funcionario();
        DAO<Funcionario> dao = new DAO<>(Funcionario.class);
        


        dao.adicionar(pessoa);
        
        List<Funcionario> funcionarios = dao.listaTodos();
        for (int i=0;i<funcionarios.size();i++){
            System.out.println(funcionarios.get(i).getNome());
            System.out.println(funcionarios.get(i).getCtps());
        }
    }
}
