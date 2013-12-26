/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Funcionario;
import br.com.sigen.Modelo.Login;

/**
 *
 * @author matteus
 */
public class FuncionarioBuilder extends PessoaBuilder {

    private String ctps;
    private Login login;

    public FuncionarioBuilder() {
        count = 0;
    }

    public Funcionario getFuncionario() {
        if (count < 11) {
            throw new IllegalArgumentException();
        }
        return new Funcionario(codigo, nome, login, data, cpf,
                rg, telefone, celular, email, cep,
                complemento, bairro, logradouro, numero,
                estado, cidade, ctps);
    }

    public String getNome() {
        return nome;
    }
    public FuncionarioBuilder setLogin(Login login) {
        this.login = login;
        count++;
        return this;
    }

    public FuncionarioBuilder setCtps(String ctps) {
        this.ctps = ctps;
        count++;
        return this;
    }
}
