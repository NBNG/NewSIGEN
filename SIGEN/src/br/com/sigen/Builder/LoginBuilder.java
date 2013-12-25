package br.com.sigen.Builder;

import br.com.sigen.Modelo.Login;
import br.com.sigen.Modelo.Pessoa;


public class LoginBuilder {
    
    private int count;
    private String senha;
    private String login;
    private Pessoa pessoa;
    
    public LoginBuilder() {
        count = 0;
    }

    public Login getLogin() {
        if (count != 3) {
            System.out.println("erro" + count);
            throw new IllegalArgumentException();
        }
        return new Login(login, senha, pessoa);
    }

    public LoginBuilder setSenha(String senha) {
        this.senha = senha;
        count++;
        return this;
    }

    public LoginBuilder setLogin(String login) {
        if (temNumeros(login)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        count++;
        return this;
    }

    public LoginBuilder setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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