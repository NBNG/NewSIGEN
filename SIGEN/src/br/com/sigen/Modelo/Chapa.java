package br.com.sigen.Modelo;

import java.io.Serializable;
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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/*
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "chapa", uniqueConstraints
        = @UniqueConstraint(columnNames = {"fk_letra", "cha_chapa"}))
public class Chapa implements Serializable {

    private Long codigo;
    private Letra letra;
    private String chapa;
    private List<Obito> obitos;
    private Venda venda;

    public Chapa() {
    }

    public Chapa(Letra letra, String chapa,
            List<Obito> obitos, Venda venda) {
        this.letra = letra;
        this.chapa = chapa;
        this.obitos = obitos;
        this.venda = venda;
    }

    @Id
    @GeneratedValue
    @Column(name = "cha_codigo")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @ManyToOne
    @JoinColumn(name = "fk_letra", nullable = false)
    public Letra getLetra() {
        return letra;
    }

    public void setLetra(Letra letra) {
        this.letra = letra;
    }

    @Column(name = "cha_chapa", nullable = false, length = 10)
    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    @OneToMany(mappedBy = "chapa", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public List<Obito> getObitos() {
        return obitos;
    }

    public void setObitos(List<Obito> obitos) {
        this.obitos = obitos;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
