/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Funcionario;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class FuncionarioBuilder {

    private Long codigo;
    private String nome;
    private Date data;
    private String cpf;
    private String rg;
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
    private String ctps;
    private String login;
    private String senha;
    private int count;

    public FuncionarioBuilder() {
        count = 0;
    }

    public Funcionario getFuncionario() {
        if (count < 12) {
            throw new IllegalArgumentException();
        }
        return new Funcionario(codigo, nome, data, cpf, rg, telefone, celular,
                email, cep, complemento, bairro, logradouro, numero, estado,
                cidade, ctps, login, senha);
    }

    public String getNome() {
        return nome;
    }

    public FuncionarioBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        if (temNumeros(nome)) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;
        return this;
    }

    public FuncionarioBuilder setData(Date data) {
        this.data = data;
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        if (cpf.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cpf = cpf;
            count++;
            return this;
        }
    }

    public FuncionarioBuilder setRg(String rg) {
        if (rg.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.rg = rg;
            count++;
            return this;
        }
    }

    public FuncionarioBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public FuncionarioBuilder setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        this.email = email;
        if (this.email.equals("")) {
            this.email = null;
        } else if (!isValidEmail(this.email)) {
            throw new IllegalArgumentException();
        }
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        if (cep.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cep = cep;
            count++;
            return this;
        }
    }

    public FuncionarioBuilder setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public FuncionarioBuilder setBairro(String bairro) {
        if (temNumeros(bairro)) {
            throw new IllegalArgumentException();
        }
        this.bairro = bairro;
        count++;
        return this;
    }

    public FuncionarioBuilder setLogradouro(String logradouro) {
        if (logradouro.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.logradouro = logradouro;
            count++;
            return this;
        }
    }

    public FuncionarioBuilder setNumero(String numero) {
        this.numero = numero;
        count++;
        return this;
    }

    public FuncionarioBuilder setEstado(String estado) {
        if (temNumeros(estado)) {
            throw new IllegalArgumentException();
        }
        this.estado = estado;
        count++;
        return this;
    }

    public FuncionarioBuilder setCidade(String cidade) {
        if (temNumeros(cidade)) {
            throw new IllegalArgumentException();
        }
        this.cidade = cidade;
        count++;
        return this;
    }

    public FuncionarioBuilder setCtps(String ctps) {
        this.ctps = ctps;
        count++;
        return this;
    }

    public FuncionarioBuilder setLogin(String login) {
        if (temNumeros(login)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        count++;
        return this;
    }

    public FuncionarioBuilder setSenha(String senha) {
        this.senha = senha;
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
