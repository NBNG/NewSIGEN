/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "letra")
public class Letra {

    private String letra;
    private Quadra quadra;
    private Long codigo;
    private List<Chapa> chapas;

    public Letra() {
    }

    public Letra(String letra, Quadra quadra, List<Chapa> chapas) {
        this.letra = letra;
        this.quadra = quadra;
        this.chapas = chapas;
    }

    @Id
    @GeneratedValue
    @Column(name = "let_codigo")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column(name = "let_letra", nullable = false, length = 10)
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @ManyToOne
    @JoinColumn(name = "fk_quadra", nullable = false)
    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    @OneToMany(mappedBy = "letra", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Chapa> getChapas() {
        return chapas;
    }

    public void setChapas(List<Chapa> chapas) {
        this.chapas = chapas;
    }
}
