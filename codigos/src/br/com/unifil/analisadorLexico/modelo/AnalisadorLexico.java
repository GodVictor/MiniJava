package br.com.unifil.analisadorLexico.modelo;

import br.com.unifil.analisadorLexico.enums.PalavrasReservada;

public class AnalisadorLexico {

    public void converterEmFluxoDeTokens(String entrada) {
        if (entrada.equals("int")) {
            System.out.println("<PR, int>");
        }
    }

}
