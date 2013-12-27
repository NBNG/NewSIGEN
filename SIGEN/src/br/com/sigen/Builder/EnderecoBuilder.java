package br.com.sigen.Builder;

import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.Modelo.Pessoa;
import java.util.List;

/**
 *
 * @author Gustavo-Diane
 */
public class EnderecoBuilder {
    
    private Long codigo;
    private String cep;
    private String bairro;
    private String logradouro;
    private String estado;
    private String cidade;
    private List<Funcionario> funcionarios;
    private List<Pessoa> pessoas;
    private int count;
    
    public EnderecoBuilder(){
        count = 0;
    }
    
    public Endereco getEndereco() {
        /*if (count < 7) {
            throw new IllegalArgumentException();
        }*/
        return new Endereco(codigo, cep, bairro, logradouro, estado, cidade,
                funcionarios, pessoas);
    }


    public EnderecoBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        if(temLetras(cep)) {
            throw new IllegalArgumentException();
        }
        this.cep = cep;
        count++;
        return this;
    }

    public EnderecoBuilder setBairro(String bairro) {
        if (bairro.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.bairro = bairro;
            count++;
            return this;
        }
    }

    public EnderecoBuilder setLogradouro(String logradouro) {
        if (logradouro.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.logradouro = logradouro;
            count++;
            return this;
        }
    }

    public EnderecoBuilder setEstado(String estado){
        this.estado = estado;
        return this;
    }
    
    public EnderecoBuilder setCidade(String cidade) {
        if (cidade.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cidade = cidade;
            count++;
            return this;
        }
    }

    public EnderecoBuilder setFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.size() == 0) {
            throw new IllegalArgumentException();
        }
        this.funcionarios = funcionarios;
        return this;
    }

    public EnderecoBuilder setPessoas(List<Pessoa> pessoas) {
        if(pessoas.size() == 0 ){
            throw new IllegalArgumentException();
        }
        this.pessoas = pessoas;
        return this;
    }

    private boolean temLetras(String texto) {
        if (texto.equals("")) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < texto.length(); i++) {
                if (Character.isAlphabetic(texto.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
