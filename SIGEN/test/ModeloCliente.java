
import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Letra;
import br.com.sigen.Modelo.Login;
import br.com.sigen.Modelo.Obito;
import br.com.sigen.Modelo.Pessoa;
import br.com.sigen.Modelo.Quadra;
import br.com.sigen.dao.DAO;
import java.util.ArrayList;
import java.util.Date;
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
        DAO<Obito> dao = new DAO<>(Obito.class);
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
        dao.adicionar(o);
    }
}
