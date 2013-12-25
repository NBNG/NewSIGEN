/*
 * Esta classe foi criada podendo ser utilizada para Clientes e Funcionarios
 */
package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pessoa")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Pessoa implements java.io.Serializable {

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

    public Pessoa() {
    }

    public Pessoa(Long codigo, String nome, Endereco endereco, Login login,
            Date data, String cpf, String rg, String ctps, String telefone,
            String celular) {

        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.login = login;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.ctps = ctps;
        this.telefone = telefone;
        this.celular = celular;
    }

    @Id
    @GeneratedValue
    @Column(name = "pes_id")
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column(name = "pes_nome", nullable = false, length = 50)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",
            cascade = CascadeType.ALL)
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa",
            cascade = CascadeType.ALL)
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "pes_data",
            columnDefinition = "date default current_date", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "pes_cpf", nullable = false, length = 14)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(name = "pes_rg", nullable = false, length = 20)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Column(name = "pes_ctps", nullable = true, length = 20)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Column(name = "pes_telefone", nullable = true, length = 14)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "pes_celular", nullable = true, length = 15)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "pes_email", nullable = true, length = 50, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
