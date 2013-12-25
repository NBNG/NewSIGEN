/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Endereco;
import br.com.sigen.Modelo.Pessoa;

/**
 *
 * @author matteus
 */
public class EnderecoBuilder {

    private Long codigo;
    private Pessoa pessoa;
    private String cep;
    private String complemento;
    private String bairro;
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;

    private int count;

    public EnderecoBuilder() {
        count = 0;
    }

    public Endereco getEndereco() {
        if (count < 7) {
            throw new IllegalArgumentException();
        }
        return new Endereco(codigo, pessoa, cep, complemento, bairro, logradouro,
                numero, estado, cidade);
    }

    public EnderecoBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public EnderecoBuilder setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        count++;
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        this.cep = cep;
        count++;
        return this;
    }

    public EnderecoBuilder setComplemento(String complemento) {
        if (temNumeros(complemento)) {
            throw new IllegalArgumentException();
        }
        this.complemento = complemento;
        return this;
    }

    public EnderecoBuilder setBairro(String bairro) {
        if (temNumeros(bairro)) {
            throw new IllegalArgumentException();
        }
        this.bairro = bairro;
        count++;
        return this;
    }

    public EnderecoBuilder setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        count++;
        return this;
    }

    public EnderecoBuilder setNumero(String numero) {
        this.numero = numero;
        count++;
        return this;
    }

    public EnderecoBuilder setEstado(String estado) {
        if (temNumeros(estado)) {
            throw new IllegalArgumentException();
        }
        this.estado = estado;
        count++;
        return this;
    }

    public EnderecoBuilder setCidade(String cidade) {
        if (temNumeros(cidade)) {
            throw new IllegalArgumentException();
        }
        this.cidade = cidade;
        count++;
        return this;
    }

    private boolean temNumeros(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
