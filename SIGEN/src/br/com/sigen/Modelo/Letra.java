/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Modelo;

/**
 *
 * @author user
 */
public class Letra {

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    private String letra;
    private Quadra quadra;
    private Long codigo;
}
