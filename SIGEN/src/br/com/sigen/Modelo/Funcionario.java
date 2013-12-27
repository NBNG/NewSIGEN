package br.com.sigen.Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements java.io.Serializable {

    private Long codigo;
    private String nome;
    private Date data;
    private String cpf;
    private String rg;
    private String telefone;
    private String celular;
    private String email;
    private String ctps;
    private String numero;
    private String complemento;
    private String senha;
    private String login;
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(Long codigo, String nome, Date data, String cpf,
            String rg, String telefone, String celular, String email,
            String complemento, String numero, String ctps, String login,
            String senha, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.ctps = ctps;
        this.login = login;
        this.senha = senha;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
    }

    @Id
    @GeneratedValue
    @Column(name = "fun_id")
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @ManyToOne
    @JoinColumn(name = "fk_endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Column(name = "fun_nome", nullable = false, length = 50)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fun_data",
            columnDefinition = "date default current_date", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    @Column(name = "fun_email", nullable = true, length = 50, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "fun_ctps", nullable = true, length = 20)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Column(name = "fun_senha", nullable = false, length = 50)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "fun_login", unique = true, nullable = false, length = 30)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "fun_complemento", nullable = true, length = 20)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Column(name = "fun_numero", nullable = false, length = 5)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
