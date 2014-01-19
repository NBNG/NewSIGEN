/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Builder;

import br.com.sigen.Modelo.Parcela;
import br.com.sigen.Modelo.Venda;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author matteus
 */
public class ParcelaBuilder {

    private Integer codigo;
    private Venda venda;
    private Date data;
    private Double valor;
    private String tipo;
    private int count;
    private Calendar cal = Calendar.getInstance();

    public ParcelaBuilder() {
        count = 0;
    }

    public Parcela getParcela() {
        if (count < 4) {
            throw new IllegalArgumentException();
        }
        return new Parcela(codigo, venda, data, valor, tipo);
    }

    public ParcelaBuilder setCodigo(Integer codigo) {
        this.codigo = codigo;
        count++;
        return this;
    }

    public ParcelaBuilder setVenda(Venda venda) {
        this.venda = venda;
        return this;
    }

    public ParcelaBuilder setData(Date data) {
        System.out.println(data);
        cal.setTime(data);
        cal.add(Calendar.MONTH, (int) codigo);
        data = cal.getTime();
        count++;
        System.out.println(data);
        this.data = data;
        return this;
    }

    public ParcelaBuilder setValor(String valor, Integer total) {
        if (valor.equals("")) {
            this.valor = 0.;
        } else {
            this.valor = Double.parseDouble(valor.replace(",", "."));;
        }
        this.valor = this.valor / total;
        count++;
        return this;
    }

    public ParcelaBuilder setTipo(String tipo) {
        this.tipo = tipo;
        count++;
        return this;
    }
}
