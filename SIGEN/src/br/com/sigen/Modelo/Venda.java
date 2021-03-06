package br.com.sigen.Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "venda")
public class Venda implements Serializable {

    private Chapa chapa;
    private Long codigo;
    private Date data;
    private Cliente cliente;
    private Double valor;
    private List<Parcela> parcelas;

    public Venda() {
    }

    public Venda(Chapa chapa, Long codigo, Date date, Cliente cliente,
            Double valor, List parcelas) {
        this.chapa = chapa;
        this.codigo = codigo;
        this.data = date;
        this.cliente = cliente;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    @Id
    @GeneratedValue
    @Column(name = "ven_codigo")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @OneToOne
    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa) {
        this.chapa = chapa;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "ven_data",
            columnDefinition = "date default current_date", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @ManyToOne
    @JoinColumn(name = "fk_cliente", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Column(name = "ven_valor")
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @OneToMany(mappedBy = "venda",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

}
