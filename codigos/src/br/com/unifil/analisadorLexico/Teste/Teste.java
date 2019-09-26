package br.com.unifil.analisadorLexico.Teste;

import br.com.unifil.analisadorLexico.modelo.AnalisadorLexico2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Teste {

    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Caminho do diretório do arquivo: ");
        String caminho = teclado.nextLine();
        int linha = 1;
        try {
            Scanner entrada = new Scanner(new BufferedReader(new FileReader(caminho)));
            while (entrada.hasNextLine()) {
                AnalisadorLexico2 analisadorLexico = new AnalisadorLexico2();
                List<String> strings = analisadorLexico.converterEmFluxoDeTokens(entrada.nextLine().trim());
                System.out.print(linha + "- ");
                for (int i = 0; i < strings.size(); i++) {
                    System.out.print(strings.get(i));
                }
                linha++;
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }*/

}
