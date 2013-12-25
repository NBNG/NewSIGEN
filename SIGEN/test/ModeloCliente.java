
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Pessoa;
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
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        /*endereco.setBairro("Centro");
         endereco.setCep("12800-999");
         endereco.setCidade("Cruzeiro");
         endereco.setComplemento("Casa");
         endereco.setEstado("SP");
         endereco.setLogradouro("Rua 6");
         endereco.setNumero("27");
         pessoa.setCelular("(12) 98205-4378");
         pessoa.setCpf("406.943.508-50");
         pessoa.setData(new Date());
         pessoa.setEmail("matteuscb@hotmail.com");
         pessoa.setNome("Matteus de Carvalho Barbosa");
         pessoa.setRg("47.753.250-0");
         pessoa.setTelefone("(12) 3144-5831");
        
         pessoa.setEndereco(endereco);
         endereco.setPessoa(pessoa);
         dao.adicionar(pessoa);*/
        List<Pessoa> pessoas = dao.listaTodos();
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
            System.out.println(pessoas.get(i).getEndereco().getLogradouro());
        }
        /*DAO<Obito> dao = new DAO<>(Obito.class);
         Chapa c = new Chapa();
         Letra l = new Letra();
         Quadra q = new Quadra();
         Endereco e = new Endereco();
         Pessoa p = new Pessoa();
         Login lo = new Login();
         Obito o = new Obito();
         List<Chapa> chapas = new ArrayList<>();
         List<Letra> letras = new ArrayList<>();
         List<Obito> obitos = new ArrayList<>();

         e.setBairro("teste");
         e.setCep("teste");
         e.setCidade("teste");
         e.setComplemento("teste");
         e.setEstado("sp");
         e.setLogradouro("rua");
         e.setNumero("10");
         lo.setLogin("teste");
         lo.setSenha("teste");
         lo.setPessoa(p);
         p.setCelular("a");
         p.setCpf("a");
         p.setCtps("a");
         p.setData(new Date());
         p.setEndereco(e);
         p.setLogin(lo);
         p.setNome("teste");
         p.setRg("teste");
         p.setTelefone("teste");
         e.setPessoa(p);
         c.setChapa("te");
         c.setLetra(l);
         c.setPessoa(p);
         chapas.add(c);
         l.setChapas(chapas);
         l.setLetra("te");
         l.setQuadra(q);
         letras.add(l);
         q.setLetras(letras);
         q.setQuadra("te");
         o.setCausaMorte("teste");
         o.setChapa(c);
         o.setCidade("teste");
         o.setData(new Date());
         o.setGuia("teste");
         o.setIdade("2");
         o.setMae("teste");
         o.setMedico("teste");
         o.setNome("teste");
         o.setProtocolo("teste");
         o.setPai("teste");
         o.setNumeroDocumento("2");
         obitos.add(o);
         c.setObitos(obitos);
         dao.adicionar(o);*/
    }
}
