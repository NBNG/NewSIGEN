package br.com.sigen.Modelo;

/*
 * @author NBNG - Matteus
 */
public class Chapa {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Letra getLetra() {
        return letra;
    }

    public void setLetra(Letra letra) {
        this.letra = letra;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }
    private Long codigo;
    private Cliente cliente;
    private Letra letra;
    private String chapa;
}
