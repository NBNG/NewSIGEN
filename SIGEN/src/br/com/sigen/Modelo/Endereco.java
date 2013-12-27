package br.com.sigen.Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gustavo-Diane
 */
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
 
    private Long codigo;
    private String cep;
    private String bairro;
    private String logradouro;
    private String estado;
    private String cidade;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;

    public Endereco() {
    }
    
    public Endereco(Long codigo, String cep, String bairro,
            String logradouro, String estado, String cidade,
            List<Funcionario> funcionario, List<Cliente> clientes) {
        this.codigo = codigo;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.estado = estado;
        this.cidade = cidade;
        this.funcionarios = funcionario;
        this.clientes = clientes;
    }
    
    
    @Id
    @GeneratedValue
    @Column(name = "end_id")
    public Long getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    
    @Column(name = "end_cep", nullable = false, length = 9)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "end_bairro", nullable = false, length = 40)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "end_logradouro", nullable = false, length = 50)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Column(name = "end_estado", nullable = false, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "end_cidade", nullable = false, length = 50)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Funcionario> getFuncionario(){
        return funcionarios;
    } 
    
    public void setFuncionario(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    
    @OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Cliente> getCliente(){
        return clientes;
    } 
    
    public void setCliente(List<Cliente> clientes){
        this.clientes = clientes;
    }
    
}