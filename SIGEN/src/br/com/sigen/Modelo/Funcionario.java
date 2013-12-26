/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa {

    private String ctps;
    private Login login;

    public Funcionario() {
    }

    public Funcionario(Long codigo, String nome, Login login, Date data, String cpf,
            String rg, String telefone, String celular, String email, String cep,
            String complemento, String bairro, String logradouro, String numero,
            String estado, String cidade, String ctps) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.ctps = ctps;
    }

    @Column(name = "pes_ctps", nullable = true, length = 20)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",
            cascade = CascadeType.ALL)
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
