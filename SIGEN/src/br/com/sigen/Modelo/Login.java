package br.com.sigen.Modelo;

/**
 * @author NBNG - Matteus
 */
public class Login {

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Long codigo;
    private String senha;
    private String nome;
}
