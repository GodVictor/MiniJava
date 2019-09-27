package br.com.unifil.analisadorLexico.view;

public class Teste {

    public static void main(String[] args) {
        /*String linha = "System.out.println(10);";
        String[] split = linha.split(" |\\.|\\(");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }*/
        /*String teste = "\\\\sas";
        String splits = "\\\\";
        String[] split = teste.split(splits);
        System.out.println(teste);
        System.out.println(split[split.length-1]);*/
        /*for (int i = 0; i < split.length; i++) {
            System.out.println(i + "- " + split[i]);
        }*/

        String entrada = "public class Teste{";
        String regexClasse = "^(public\\s)?(class)\\s(\\w+\\d*)+\\s*?\\{$";
        if (entrada.matches(regexClasse)) {
            String[] split1 = entrada.split(" | ");

            for (int i = 0; i < split1.length; i++) {
                if (split1[i].contains("{")) {
                    split1[i] = split1[i].split("\\{")[0];
                    System.out.println(split1[i]);
                    System.out.println("{");
                } else {
                    System.out.println(split1[i]);
                }
            }
        }
    }

}
