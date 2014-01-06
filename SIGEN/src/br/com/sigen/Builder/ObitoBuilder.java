/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Obito;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class ObitoBuilder {

    private Long codigo;
    private String protocolo;
    private String guia;
    private String mae;
    private String causaMorte;
    private String pai;
    private String nome;
    private String idade;
    private Date data;
    private String medico;
    private String numeroDocumento;
    private String cidade;
    private Chapa chapa;
    private int count;

    public ObitoBuilder() {
        count = 0;
    }

    public Obito getObito() {
        if (count < 9) {
            throw new IllegalArgumentException();
        }
        return new Obito(protocolo, guia, mae, causaMorte, pai, nome, idade,
                data, medico, numeroDocumento, cidade, chapa);
    }

    public ObitoBuilder setProtocolo(String protocolo) {
        this.protocolo = protocolo;
        count++;
        return this;
    }

    public ObitoBuilder setGuia(String guia) {
        this.guia = guia;
        count++;
        return this;
    }

    public ObitoBuilder setMae(String mae) {
        this.mae = mae;
        return this;
    }

    public ObitoBuilder setCausaMorte(String causaMorte) {
        if (temNumeros(causaMorte)) {
            System.out.println("3");
            throw new IllegalArgumentException();
        }
        this.causaMorte = causaMorte;
        count++;

        return this;
    }

    public ObitoBuilder setPai(String pai) {
        this.pai = pai;
        return this;
    }

    public ObitoBuilder setNome(String nome) {
        if (temNumeros(nome)) {
            System.out.println("4");
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;

        return this;
    }

    public ObitoBuilder setIdade(String idade) {
        if (!temLetra(idade)) {
            System.out.println("5");
            throw new IllegalArgumentException();
        }
        this.idade = idade;
        count++;

        return this;
    }

    public ObitoBuilder setData(Date data) {
        if (data == null) {
            System.out.println("6");
            throw new IllegalArgumentException();
        } else {
        }
        this.data = data;
        count++;

        return this;
    }

    public ObitoBuilder setMedico(String medico) {
        if (temNumeros(medico)) {
            System.out.println("7");
            throw new IllegalArgumentException();
        }
        this.medico = medico;
        count++;

        return this;
    }

    public ObitoBuilder setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        count++;
        return this;
    }

    public ObitoBuilder setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public ObitoBuilder setChapa(Chapa chapa) {
        if (chapa == null) {
            System.out.println("9");
            throw new IllegalArgumentException();
        }
        this.chapa = chapa;
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

    private boolean temLetra(String texto) {
        return texto.matches("[0-9]*");
    }

    public static void main(String[] args) {
        ObitoBuilder o = new ObitoBuilder();
        System.out.println(o.temLetra("a"));
    }
}
