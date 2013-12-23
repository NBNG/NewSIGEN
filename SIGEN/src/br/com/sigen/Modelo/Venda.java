package br.com.sigen.Modelo;

import java.util.Date;

/**
 * @author NBNG - Matteus
 */
public class Venda {

    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa) {
        this.chapa = chapa;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    private Chapa chapa;
    private Long codigo;
    private Date data;
    private Cliente proprietario;
}
