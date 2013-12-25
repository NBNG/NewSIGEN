/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Endereco;
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
    private Endereco endereco;
    private Login login;
    private Date data;
    private String cpf;
    private String rg;
    private String ctps;
    private String telefone;
    private String celular;
    private String email;
    private int count;

    public PessoaBuilder() {
        count = 0;
    }

    public Pessoa getPessoa() {
        if (count < 5) {
            throw new IllegalArgumentException();
        }
        return new Pessoa(codigo, nome, endereco, login, data, cpf, rg, ctps,
                telefone, celular
        );
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
        return this;
    }

    public PessoaBuilder setEndereco(Endereco endereco) {
        this.endereco = endereco;
        count++;
        return this;
    }

    public PessoaBuilder setLogin(Login login) {
        this.login = login;
        return this;
    }

    public PessoaBuilder setData(Date data) {
        this.data = data;
        count++;
        return this;
    }

    public PessoaBuilder setCpf(String cpf) {
        this.cpf = cpf;
        count++;
        return this;
    }

    public PessoaBuilder setRg(String rg) {
        this.rg = rg;
        count++;
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
