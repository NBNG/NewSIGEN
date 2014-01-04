/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sigen.Builder;

import br.com.sigen.Modelo.Chapa;
import br.com.sigen.Modelo.Cliente;
import br.com.sigen.Modelo.Venda;
import java.util.Date;

/**
 *
 * @author Gustavo-Diane
 */
public class VendaBuilder {

    private Chapa chapa;
    private Long codigo;
    private Date data;
    private Cliente cliente;
    private int count;
    
    public VendaBuilder(){
        count = 0;
    }
    
    public Venda getVenda(){
        if(count < 3){
            throw new IllegalArgumentException();
        }
        return new Venda(chapa, codigo, data, cliente);
    }
    
    public VendaBuilder setChapa(Chapa chapa){
        this.chapa = chapa;
        count++;
        return this;
    }
    
    public VendaBuilder setCodigo(Long codigo){
        this.codigo = codigo;
        return this;
    }
    
    public VendaBuilder setData(Date data){
        if(data == null)
            throw new IllegalArgumentException();
        this.data = data;
        count++;
        return this;
    }
    
    public VendaBuilder setCliente(Cliente cliente){
        this.cliente = cliente;
        count++;
        return this;
    }
}
