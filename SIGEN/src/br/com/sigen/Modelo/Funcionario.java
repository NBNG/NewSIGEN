/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "FUNCIONARIOS")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Funcionario {

    @Id
    @GeneratedValue
    @Column(name = "fun_id")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @JoinColumn(name = "fk_endereco", nullable = true)
    @OneToOne(mappedBy = "endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Column(name = "fun_nome", nullable = false, length = 50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fun_cadastro", columnDefinition = "date default current_date", nullable = true)
    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    @Column(name = "fun_cpf", nullable = false, length = 14)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(name = "fun_rg", nullable = false, length = 20)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Column(name = "fun_ctps", nullable = false, length = 20)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Column(name = "fun_telefone", nullable = true, length = 14)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "fun_celular", nullable = true, length = 15)
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
