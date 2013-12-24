package br.com.sigen.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "ENDERECOS")
public class Endereco {

    @Id
    @GeneratedValue
    @Column(name = "end_id")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column(name = "end_cep", nullable = true, length = 9)
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

    private Long codigo;
    private String cep;
    private String complemento;
    private String bairro;
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;
    
}
