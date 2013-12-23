/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sigen.Editor;

import java.util.Calendar;

/**
 *
 * @author matt
 */
public class Editor {

    public static String formatValor(double x) {
        return String.format("R$ %.2f", x);
    }

    public static String formatData(java.util.Date d) {
        String aux, aux2 = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (mes < 10) {
            aux = "0" + String.valueOf(mes);
        } else {
            aux = String.valueOf(mes);
        }
        if (dia < 10) {
            aux2 = "0" + String.valueOf(dia);
        } else {
            aux2 = String.valueOf(dia);
        }
        String sData = aux2 + "/" + aux + "/" + String.valueOf(ano);
        return sData;
    }

}
