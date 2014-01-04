package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "cliente")
@Inheritance(strategy = InheritanceType.JOINED)
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Cliente implements java.io.Serializable {

    private Long codigo;
    private String nome;
    private Date data;
    private String cpf;
    private String rg;
    private String telefone;
    private String celular;
    private String email;
    private String complemento;
    private String numero;
    private Endereco endereco;
    private List<Venda> vendas;

    public Cliente() {
    }

    public Cliente(Long codigo, String nome, Date data, String rg,
            String cpf, String telefone, String celular, String email,
            String complemento, String numero) {

        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.complemento = complemento;
        this.numero = numero;
    }

    @Id
    @GeneratedValue
    @Column(name = "cli_id")
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @ManyToOne
    @JoinColumn(name = "fk_endereco", nullable = false)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Column(name = "cli_nome", nullable = false, length = 50)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cli_data",
            columnDefinition = "date default current_date", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "cli_cpf", nullable = false, length = 14, unique = true)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(name = "cli_rg", nullable = false, length = 20)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Column(name = "cli_telefone", nullable = true, length = 14)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "cli_celular", nullable = true, length = 15)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "cli_email", nullable = true, length = 50, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cli_complemento", nullable = true, length = 20)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Column(name = "cli_numero", nullable = false, length = 5)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Venda> getVendas() {
        return this.vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

}
