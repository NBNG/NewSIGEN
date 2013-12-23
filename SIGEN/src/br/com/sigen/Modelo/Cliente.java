package br.com.sigen.Modelo;

import java.util.Date;

/**
 * @author NBNG - Matteus
 */
public class Cliente {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelelefone() {
        return telelefone;
    }

    public void setTelelefone(String telelefone) {
        this.telelefone = telelefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    private Long codigo;
    private String nome;
    private String rg;
    private Date nascimento;
    private String cpf;
    private Endereco endereco;
    private String telelefone;
    private String celular;
}
