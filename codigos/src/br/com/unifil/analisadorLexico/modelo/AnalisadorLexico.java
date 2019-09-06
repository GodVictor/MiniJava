package br.com.unifil.analisadorLexico.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorLexico {
    List<String> palavrasReservadas = Arrays.asList("public", "class", "int[]", "boolean", "int", "if", "else",
            "while");
    List<String> sinais = Arrays.asList("{", "}");
    List<String> resultado = new ArrayList<>();
    boolean token = false;
    boolean metodoPrincipal = false;
    boolean classe = false;

    public List<String> converterEmFluxoDeTokens(String entrada, int linha) {
//        System.out.format("%d- %s%n", linha, entrada);

        final String PRINCIPAL = "public static void main(String[] args)";
        final String CLASSE = "public class";
        String separador[] = entrada.split("");
        int tamanho;

        if (entrada.contains(PRINCIPAL)) {
            resultado.add(String.format("<MainClass, '%s'>", PRINCIPAL));
            metodoPrincipal = true;
        }

        if (entrada.contains(CLASSE)) {
            resultado.add(String.format("<ClassDeclaration, '%s'>", CLASSE));
            classe = true;
            separador = entrada.split("class");
        }

        if (!classe) {
            separador = entrada.split(" ");
            tamanho = separador.length;
        } else {
            separador = separador[1].trim().split(" ");
            tamanho = separador.length;
        }

        for (int i = 0; i < tamanho; i++) {
            token = false;

            if (metodoPrincipal) {
                verificador(sinais, separador[i], "<SINAIS, '%s'>");
            } else if (classe) {
                verificador(sinais, separador[i], "<SINAIS, '%s'>");

                if (!token && !separador[i].equals(" ")) {
                    resultado.add(String.format("<ID, '%s'>", separador[i]));
                }
            } else {
                verificador(palavrasReservadas, separador[i], "<PR, '%s'>");
                verificador(sinais, separador[i], "<SINAIS, '%s'>");

                if (!token && !separador[i].equals(" ")) {
                    resultado.add(String.format("<ID, '%s'>", separador[i]));
                }
            }
        }

        metodoPrincipal = false;
        classe = false;

        return resultado;
    }

    public void limparLista() { resultado.clear(); }

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
