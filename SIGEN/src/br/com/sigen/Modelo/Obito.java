package br.com.sigen.Modelo;

import java.util.Date;

/**
 * @author NBNG - Matteus
 */
public class Obito {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getCausaMorte() {
        return causaMorte;
    }

    public void setCausaMorte(String causaMorte) {
        this.causaMorte = causaMorte;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa) {
        this.chapa = chapa;
    }
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
    private Cidade cidade;
    private Cliente proprietario;
    private Chapa chapa;
}
