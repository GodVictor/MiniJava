package br.com.unifil.analisadorLexico.modelo;

import br.com.unifil.analisadorLexico.enums.PalavrasReservada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorLexico {
    // /Users/leonardomorita/Documents/entrada1.txt

    List<String> palavrasReservadas = Arrays.asList("public", "class");
    List<String> sinais = Arrays.asList("{", "}");
    List<String> resultado = new ArrayList<>();
    boolean token = false;
    boolean metodoPrincipal = false;

    public void converterEmFluxoDeTokens(String entrada, int linha) {
        System.out.format("%d- %s%n", linha, entrada);

        final String PRINCIPAL = "public static void main(String[] args)";

        if (entrada.contains("public static void main(String[] args)")) {
            resultado.add(String.format("<MainClass, %s>", PRINCIPAL));
            metodoPrincipal = true;
        }

        String[] separador = entrada.split(" ");
        int tamanho = separador.length;

        for (int i = 0; i < tamanho; i++) {
            token = false;

            if (metodoPrincipal) {
                verificador(sinais, separador[i], "<SINAIS, '%s'>");
            } else if (!metodoPrincipal) {
                verificador(palavrasReservadas, separador[i], "<PR, '%s'>");
                verificador(sinais, separador[i], "<SINAIS, '%s'>");

                if (!token && !separador[i].equals(" ")) {
                    resultado.add(String.format("<ID, '%s'>", separador[i]));
                }
            }
        }

        metodoPrincipal = false;
    }

    private void verificador(List<String> lista, String textoSeparado, String lexema) {
        for (int j = 0; j < lista.size(); j++) {
            if (textoSeparado.equals(lista.get(j))) {
                resultado.add(String.format(lexema, textoSeparado));
                token = true;
            }
        }
    }

    public List<String> getResultado() {
        return this.resultado;
    }
}
