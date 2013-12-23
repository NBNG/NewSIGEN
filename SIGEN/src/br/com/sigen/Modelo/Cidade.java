package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
public class Cidade {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    private Long codigo;
    private String nome;
    private Estado estado;
}
