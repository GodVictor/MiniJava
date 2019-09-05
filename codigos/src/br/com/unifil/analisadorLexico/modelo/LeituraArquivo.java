package br.com.unifil.analisadorLexico.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) {
        Scanner entrada;
        Scanner teclado = new Scanner(System.in);

        AnalisadorLexico analisador = new AnalisadorLexico();

        try {
            System.out.println("Digite o caminho dos diretórios do arquivo .txt: ");
            String arquivo = teclado.nextLine();
            entrada = new Scanner(new BufferedReader(new FileReader(arquivo)));

            System.out.println();

            int linha = 1;
            while (entrada.hasNextLine()) {
                analisador.converterEmFluxoDeTokens(entrada.nextLine().trim(), linha);
                linha++;
            }

            System.out.println(analisador.getResultado());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
