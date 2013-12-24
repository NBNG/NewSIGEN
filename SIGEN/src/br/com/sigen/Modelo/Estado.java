package br.com.sigen.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author NBNG - Matteus
 */
@Entity
@Table(name = "ESTADOS")
public class Estado {

    @Column(name = "est_nome", nullable = false, length = 40)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Id
    @Column(name = "est_sigla", nullable = false, length = 2)
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    private String nome;
    private String sigla;
}
