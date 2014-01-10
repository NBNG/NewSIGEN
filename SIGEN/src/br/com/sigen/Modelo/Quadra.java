package br.com.sigen.Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "quadra")
public class Quadra implements Serializable {

    private String quadra;
    private List<Letra> letras;

    public Quadra() {
    }

    public Quadra(String quadra, List<Letra> letras) {
        this.quadra = quadra;
        this.letras = letras;
    }

    @Id
    @Column(name = "qua_quadra")
    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    @OneToMany(mappedBy = "quadra", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Letra> getLetras() {
        return letras;
    }

    public void setLetras(List<Letra> letras) {
        this.letras = letras;
    }
}
