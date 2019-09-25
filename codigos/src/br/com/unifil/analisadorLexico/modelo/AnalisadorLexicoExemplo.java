package br.com.unifil.analisadorLexico.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorLexicoExemplo {
    private List<String> palavrasReservadas = Arrays.asList("public", "class");
    private List<String> type = Arrays.asList("int[]", "boolean", "int");
    private List<String> sinais = Arrays.asList("{", "}");
    private List<String> resultado = new ArrayList<>();
    private boolean token = false;
    private boolean metodoPrincipal = false;
    private boolean classe = false;
    private boolean imprimir = false;
    private boolean variavel = false;
    private boolean metodo = false;


    public List<String> converterEmFluxoDeTokens(String entrada, int linha) {
//        System.out.format("%d- %s%n", linha, entrada);

        final String PRINCIPAL = "public static void main(String[] args)";
        final String CLASSE = "public class";
        String separador[] = entrada.split("");
        int tamanho;

        verificadorMetodoMain(entrada, PRINCIPAL);

        separador = verificadorClasse(entrada, CLASSE, separador);

        if (entrada.matches("System\\.out\\.println\\(([^;].*\\)*);")) {
//            System.out.println("FOI ENCONTRADO-----------------");
            resultado.add(String.format("<Statment, '%s'>", entrada.split(";")[0]));
            imprimir = true;
        }

        String verificadorDeDeclaracaoVariavel = "[A-Z]([a-z]+[0-9]*)+\\s([a-z]+[0-9]*)+\\s*?;";
        if (entrada.matches(verificadorDeDeclaracaoVariavel)) {
            resultado.add(String.format("<VarDeclaration, '%s'>", entrada.split(";")[0]));

            variavel = true;
        }

        if (entrada.matches("^public\\s([a-z]|[A-Z][a-z])([a-z]*[A-Z]*)*\\(\"?(\\w*\\s?\\d*)*\"?\\);$")) {
            resultado.add(String.format("<MethodDeclaration, 's'>", entrada));
            metodo = true;
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
            } else if (imprimir || variavel) {
                if (variavel) {
                    if (separador[i].matches("^[A-Z]+([a-z]+[A-Z]*[0-9]*)+$")) {
                        resultado.add(String.format("<Type, '%s'>", separador[i]));
                    } else {
                        verificador(type, separador[i], "<Type, '%s'>");
                    }

                    if (separador[i].matches("^([a-z]+[A-Z]*[0-9]*)+;?$")) {
                        resultado.add(String.format("<ID, '%s'>", separador[i].split(";")[0]));
                    }
                }
                verificarPontoEVirgula(separador, i);
            } else {
                verificador(palavrasReservadas, separador[i], "<PR, '%s'>");
                verificador(sinais, separador[i], "<SINAIS, '%s'>");
                verificador(type, separador[i], "<Type, '%s'>");

                if (!token && !separador[i].equals(" ")) {

                    if (separador[i].contains(";")) {
                        String s = separador[i].split(";")[0];
                        resultado.add(String.format("<ID, '%s'>", s));
                    } else {
                        resultado.add(String.format("<ID, '%s'>", separador[i]));
                    }

                }

                verificarPontoEVirgula(separador, i);
            }
        }

        metodoPrincipal = false;
        classe = false;
        imprimir = false;
        variavel = false;

        return resultado;
    }

    private void verificarPontoEVirgula(String[] separador, int i) {
        if (separador[i].contains(";")) {
//                    System.out.println("------------>>>>>>>>" + separador[i]);
            separador[i] = separador[i].split(";")[0];
//            System.out.println(separador[i]);
            resultado.add("<SIMBOLO, ';'>");
        }
    }

    private String[] verificadorClasse(String entrada, String CLASSE, String[] separador) {
        if (entrada.contains(CLASSE)) {
            resultado.add(String.format("<ClassDeclaration, '%s'>", CLASSE));
            classe = true;
            separador = entrada.split("class");
        }
        return separador;
    }

    private void verificadorMetodoMain(String entrada, String PRINCIPAL) {
        if (entrada.contains(PRINCIPAL)) {
            resultado.add(String.format("<MainClass, '%s'>", PRINCIPAL));
            metodoPrincipal = true;
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
