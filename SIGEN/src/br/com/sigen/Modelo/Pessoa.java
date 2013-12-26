package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Pessoa implements java.io.Serializable {

    private Long codigo;
    private String nome;
    private Date data;
    private String cpf;
    private String rg;
    private String ctps;
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

    public Pessoa() {
    }

    public Pessoa(Long codigo, String nome, Date data, String cpf,
            String rg, String telefone, String celular, String email, String cep,
            String complemento, String bairro, String logradouro, String numero,
            String estado, String cidade) {

        this.codigo = codigo;
        this.nome = nome;
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

    @Column(name = "end_cep", nullable = false, length = 9)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "end_complemento", nullable = true, length = 20)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Column(name = "end_bairro", nullable = false, length = 40)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "end_logradouro", nullable = false, length = 50)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Column(name = "end_numero", nullable = false, length = 5)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Column(name = "end_estado", nullable = false, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "end_cidade", nullable = false, length = 50)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
