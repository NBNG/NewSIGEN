/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Parcela;
import br.com.sigen.Modelo.Venda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo-Diane
 */
public class VendaBuilder {

    private Chapa chapa;
    private Long codigo;
    private Date data;
    private Cliente cliente;
    private Double valor;
    private List<Parcela> parcelas;
    private int count;

    public VendaBuilder() {
        count = 0;
    }

    public Venda getVenda() {
        if (count < 4) {
            throw new IllegalArgumentException();
        }
        return new Venda(chapa, codigo, data, cliente, valor, parcelas);
    }

    public VendaBuilder setChapa(Chapa chapa) {
        this.chapa = chapa;
        count++;
        return this;
    }

    public VendaBuilder setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public VendaBuilder setData(Date data) {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        this.data = data;
        count++;
        return this;
    }

    public VendaBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        count++;
        return this;
    }

    public VendaBuilder setValor(String valor) {
        if (valor.equals("")) {
            this.valor = 0.;
        } else {
            this.valor = Double.parseDouble(valor.replace(",", "."));;
        }
        count++;
        return this;
    }

    public VendaBuilder setParcelas(List<Parcela> parcelas) {
        if (parcelas.isEmpty()) {
            throw new NullPointerException();
        }
        this.parcelas = parcelas;
        return this;
    }
}
