/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Pessoa;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class PessoaBuilder {

    protected Long codigo;
    protected String nome;
    protected Date data;
    protected String cpf;
    protected String rg;
    protected String telefone;
    protected String celular;
    protected String email;
    protected String cep;
    protected String complemento;
    protected String bairro;
    protected String logradouro;
    protected String numero;
    protected String estado;
    protected String cidade;
    protected int count;

    public PessoaBuilder() {
        count = 0;
    }

    public Pessoa getPessoa() {
        if (count < 9) {
            throw new IllegalArgumentException();
        }
        return new Pessoa(codigo, nome, data, rg, cpf, telefone,
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
        return this;
    }

    public PessoaBuilder setData(Date data) {
        this.data = data;
        count++;
        return this;
    }

    public PessoaBuilder setCpf(String cpf) {
        if (cpf.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cpf = cpf;
            count++;
            return this;
        }
    }

    public PessoaBuilder setRg(String rg) {
        if (rg.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.rg = rg;
            count++;
            return this;
        }
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
        if (cep.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cep = cep;
            count++;
            return this;
        }
    }

    public PessoaBuilder setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public PessoaBuilder setBairro(String bairro) {
        if (temNumeros(bairro)) {
            throw new IllegalArgumentException();
        }
        this.bairro = bairro;
        count++;
        return this;
    }

    public PessoaBuilder setLogradouro(String logradouro) {
        if (logradouro.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.logradouro = logradouro;
            count++;
            return this;
        }
    }

    public PessoaBuilder setNumero(String numero) {
        this.numero = numero;
        count++;
        return this;
    }

    public PessoaBuilder setEstado(String estado) {
        if (temNumeros(estado)) {
            throw new IllegalArgumentException();
        }
        this.estado = estado;
        count++;
        return this;
    }

    public PessoaBuilder setCidade(String cidade) {
        if (temNumeros(cidade)) {
            throw new IllegalArgumentException();
        }
        this.cidade = cidade;
        count++;
        return this;
    }

    private boolean temNumeros(String texto) {
        if (texto.equals("")) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < texto.length(); i++) {
                if (Character.isDigit(texto.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
