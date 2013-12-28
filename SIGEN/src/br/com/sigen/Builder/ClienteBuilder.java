 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Cliente;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class ClienteBuilder {

    protected Long codigo;
    protected String nome;
    protected Date data;
    protected String cpf;
    protected String rg;
    protected String telefone;
    protected String celular;
    protected String email;
    protected String complemento;
    protected String numero;
    protected int count;

    public ClienteBuilder() {
        count = 0;
    }

    public Cliente getCliente() {
        if (count < 5) {
            throw new IllegalArgumentException();
        }
        return new Cliente(codigo, nome, data, rg, cpf, telefone,
                celular, email, complemento, numero);
    }

    public ClienteBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        if (temNumeros(nome)) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;
        return this;
    }

    public ClienteBuilder setData(Date data) {
        this.data = data;
        count++;
        return this;
    }

    public ClienteBuilder setCpf(String cpf) {
        if (cpf.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.cpf = cpf;
            count++;
            return this;
        }
    }

    public ClienteBuilder setRg(String rg) {
        if (rg.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.rg = rg;
            count++;
            return this;
        }
    }

    public ClienteBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ClienteBuilder setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        this.email = email;
        if (this.email.equals("")) {
            this.email = null;
        } else if (!isValidEmail(this.email)) {
            throw new IllegalArgumentException();
        }
        return this;
    }

    public ClienteBuilder setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public ClienteBuilder setNumero(String numero) {
        this.numero = numero;
        count++;
        return this;
    }

    private boolean temNumeros(String texto) {
        if (texto.equals("")) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < texto.length(); i++) {
                if (Character.isDigit(texto.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
