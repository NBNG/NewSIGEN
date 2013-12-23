/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

import java.util.Date;

/**
 *
 * @author NBNG - Matteus
 */
public class Funcionario {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    private Long codigo;
    private Endereco endereco;
    private String nome;
    private Date cadastro;
    private String cpf;
    private String rg;
    private String ctps;
    private String telefone;
    private String celular;
}
