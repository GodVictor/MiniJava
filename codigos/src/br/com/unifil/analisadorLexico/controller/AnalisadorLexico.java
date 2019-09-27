package br.com.unifil.analisadorLexico.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorLexico {
    private List<String> palavrasReservadas = Arrays.asList("public", "class", "int[]", "boolean", "int", "static",
            "void", "main", "print", "format");
    private List<String> sinaisSimples = Arrays.asList("{", "}", "+", "-", "/", "*", "=", ";", "(", ")");
    private List<String> sinaisCompostos = Arrays.asList("<=", ">=", "&&");
    private List<String> resultado = new ArrayList<>();
    private boolean token = false;
    private boolean temSimbolo = false;


    public List<String> converterEmFluxoDeTokens(String entrada) {
//        System.out.format("%d- %s%n", linha, entrada);

        // String separador[] = entrada.split(" |\\.|\\(");

        String separador[] = entrada.split(String.format(" |\\("));

        int tamanho;

        if (separador[0].equals("//")) { return resultado; }

        /*if (entrada.matches("System\\.out\\.println\\(([^;].*\\)*);")) {
//            System.out.println("FOI ENCONTRADO-----------------");
            resultado.add(String.format("<Statment, '%s'>", entrada.split(";")[0]));
        }*/

        for (int i = 0; i < separador.length; i++) {
            String simbolo = "";
            for (int j = 0; j < sinaisSimples.size(); j++) {
                simbolo = sinaisSimples.get(j);
                if (simbolo.equals("{") || simbolo.equals("}") || simbolo.equals("(") || simbolo.equals(")")) {
                    simbolo = String.format("\\\\\\%s", simbolo);
                }
                if (separador[i].contains(simbolo)) {
                    separador[i] = separador[i].split(simbolo)[0];
                    temSimbolo = true;
                    break;
                }
            }
            if (!separador[i].equals("")) {
                if (palavrasReservadas.contains(separador[i])) {
                    resultado.add(String.format("<PR, '%s'>", separador[i]));
                } else if (separador[i].matches("^(-?[0-9]+)+(\\.?[0-9]+)*$")) {
                    resultado.add(String.format("<LIT, '%s'>", separador[i]));
                } else if (sinaisSimples.contains(separador[i])) {
                    resultado.add(String.format("<SS, '%s'>", separador[i]));
                } else if (sinaisCompostos.contains(separador[i])) {
                    resultado.add(String.format("<SC, '%s'>", separador[i]));
                } else {
                    verificarIdentificador(separador, i, separador[i], "^[A-Z a-z]([A-Z]|[a-z]|[0-9])*$", "<ID, '%s'>");
                }
                if (temSimbolo) {
                    /*if (simbolo.contains("{") | simbolo.contains("}")) {
                        simbolo = simbolo.split("\\\\")[0];
                    }*/
                    System.out.println("Símbolo: " + simbolo);
                    resultado.add(String.format("<SS, '%s'>", simbolo));
                }
            }
        }
        temSimbolo = false;
        return resultado;
    }

    private void verificarIdentificador(String[] separador, int indice, String s, String regex, String lexema) {
        if (s.matches(regex)) {
            resultado.add(String.format(lexema, separador[indice]));
        }
    }

    private void verificarPontoEVirgula(String[] separador, int i) {
        if (separador[i].contains(";")) {
            separador[i] = separador[i].split(";")[0];
            System.out.println("Teste: --->>>> " + separador[i]);
//            resultado.add("<SIMBOLO, ';'>");
        }
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
