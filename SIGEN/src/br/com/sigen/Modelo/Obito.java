package br.com.sigen.Modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "obito")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Obito {

    private Long codigo;
    private String protocolo;
    private String guia;
    private String mae;
    private String causaMorte;
    private String pai;
    private String nome;
    private String idade;
    private Date data;
    private String medico;
    private String numeroDocumento;
    private String cidade;
    private Chapa chapa;

    public Obito() {
    }

    public Obito(String protocolo, String guia, String mae, String causaMorte,
            String pai, String nome, String idade, Date data, String medico,
            String numeroDocumento, String cidade, Chapa chapa) {
        this.protocolo = protocolo;
        this.guia = guia;
        this.mae = mae;
        this.causaMorte = causaMorte;
        this.pai = pai;
        this.nome = nome;
        this.idade = idade;
        this.data = data;
        this.medico = medico;
        this.numeroDocumento = numeroDocumento;
        this.cidade = cidade;
        this.chapa = chapa;
    }

    @Id
    @GeneratedValue
    @Column(name = "pes_id")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column(name = "obi_protocolo", nullable = false, length = 15)
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Column(name = "obi_guia", nullable = false, length = 20)
    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    @Column(name = "obi_mae", nullable = false, length = 40)
    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    @Column(name = "obi_causa", nullable = false)
    public String getCausaMorte() {
        return causaMorte;
    }

    public void setCausaMorte(String causaMorte) {
        this.causaMorte = causaMorte;
    }

    @Column(name = "obi_pai", nullable = false, length = 40)
    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    @Column(name = "obi_nome", nullable = false, length = 40)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "obi_idade", nullable = false, length = 3)
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "obi_data",
            columnDefinition = "date default current_date", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "obi_medico", nullable = false, length = 40)
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Column(name = "obi_documento", nullable = false, length = 9)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Column(name = "obi_cidade", nullable = false, length = 40)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @OneToMany(mappedBy = "obito", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa) {
        this.chapa = chapa;
    }
}
