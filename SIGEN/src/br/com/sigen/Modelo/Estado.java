package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
public class Estado {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    private String nome;
    private String sigla;
}
