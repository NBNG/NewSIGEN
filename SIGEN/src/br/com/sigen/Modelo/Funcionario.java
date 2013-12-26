/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa {

    private String ctps;
    private String senha;
    private String login;

    public Funcionario() {
    }

    public Funcionario(Long codigo, String nome, Date data, String cpf,
            String rg, String telefone, String celular, String email, String cep,
            String complemento, String bairro, String logradouro, String numero,
            String estado, String cidade, String ctps, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.ctps = ctps;
        this.login = login;
        this.senha = senha;
    }

    @Column(name = "pes_ctps", nullable = true, length = 20)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Column(name = "log_senha", nullable = false, length = 50)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "log_login", unique = true, nullable = false, length = 30)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
