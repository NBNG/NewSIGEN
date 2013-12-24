package br.com.sigen.Modelo;

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
import javax.persistence.Table;

/*
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "chapa")
public class Chapa {

    private Long codigo;
    private Pessoa pessoa;
    private Letra letra;
    private String chapa;
    private List<Obito> obitos;

    public Chapa() {
    }

    public Chapa(Pessoa pessoa, Letra letra, String chapa, List<Obito> obitos) {
        this.pessoa = pessoa;
        this.letra = letra;
        this.chapa = chapa;
        this.obitos = obitos;
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
    @JoinColumn(name = "fk_cliente", nullable = true)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    @OneToMany(mappedBy = "chapa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Obito> getObitos() {
        return obitos;
    }

    public void setObitos(List<Obito> obitos) {
        this.obitos = obitos;
    }
}
