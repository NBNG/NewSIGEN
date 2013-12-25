/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Login;
import br.com.sigen.Modelo.Pessoa;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class PessoaBuilder {

    private Long codigo;
    private String nome;
    private Login login;
    private Date data;
    private String cpf;
    private String rg;
    private String ctps;
    private String telefone;
    private String celular;
    private String email;
    private String cep;
    private String complemento;
    private String bairro;
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;
    private int count;

    public PessoaBuilder() {
        count = 0;
    }

    public Pessoa getPessoa() {
        if (count < 10) {
            System.out.println("teste" + count);
            throw new IllegalArgumentException();
        }
        return new Pessoa(codigo, nome, login, data, cpf, rg, ctps, telefone,
                celular, email, cep, complemento, bairro, logradouro, numero,
                estado, cidade);
    }

    public PessoaBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public PessoaBuilder setNome(String nome) {
        if (temNumeros(nome)) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;
        System.out.println(count);
        System.out.println("Nome:" + nome);
        return this;
    }

    public PessoaBuilder setLogin(Login login) {
        this.login = login;
        return this;
    }

    public PessoaBuilder setData(Date data) {
        this.data = data;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setCpf(String cpf) {
        this.cpf = cpf;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setRg(String rg) {
        this.rg = rg;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setCtps(String ctps) {
        this.ctps = ctps;
        return this;
    }

    public PessoaBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PessoaBuilder setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public PessoaBuilder setEmail(String email) {
        this.email = email;
        if (this.email.equals("")) {
            this.email = null;
        } else if (!isValidEmail(this.email)) {
            throw new IllegalArgumentException();
        }
        return this;
    }

    public PessoaBuilder setCep(String cep) {
        this.cep = cep;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setComplemento(String complemento) {
        if (temNumeros(complemento)) {
            throw new IllegalArgumentException();
        }
        this.complemento = complemento;
        return this;
    }

    public PessoaBuilder setBairro(String bairro) {
        if (temNumeros(bairro)) {
            throw new IllegalArgumentException();
        }
        this.bairro = bairro;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setNumero(String numero) {
        this.numero = numero;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setEstado(String estado) {
        if (temNumeros(estado)) {
            throw new IllegalArgumentException();
        }
        this.estado = estado;
        count++;
        System.out.println(count);
        return this;
    }

    public PessoaBuilder setCidade(String cidade) {
        if (temNumeros(cidade)) {
            throw new IllegalArgumentException();
        }
        this.cidade = cidade;
        count++;
        System.out.println(count);
        return this;
    }

    private boolean temNumeros(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
