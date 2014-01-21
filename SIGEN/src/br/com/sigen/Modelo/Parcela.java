/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "parcela")
public class Parcela implements Serializable {

    private Integer codigo;
    private Venda venda;
    private Date data;
    private Double valor;
    private String tipo;
    private String pago;

    public Parcela() {
    }

    public Parcela(Integer codigo, Venda venda, Date data, Double valor,
            String tipo) {
        this.codigo = codigo;
        this.venda = venda;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Id
    @Column(name = "par_codigo")
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "fk_venda", nullable = false)
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "par_data", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "par_valor")
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Column(name = "par_tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name = "par_pago")
    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

}
