package br.com.unifil.analisadorLexico.Teste;

// /Users/leonardomorita/Documents/entrada1.txt
public class Teste {

    public static void main(String[] args) {
        String a = "public class TesteTes {";
        String b = "public";
        String c = "int a = 0;";
        String[] strings = b.split("");

        strings = a.split("class");

        if (c.contains(";")) {
            int indiceSimbolo = c.indexOf(";");
            System.out.println(indiceSimbolo);
            String aux = c.substring(0, indiceSimbolo);
            String regex = aux.substring(indiceSimbolo-1);

            String[] split = c.split(regex);
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }


//            System.out.println("original " + c);
//            System.out.println(aux);
//            System.out.println(regex);
        }

//        String[] split = c.split("");

//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }

//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//
//        System.out.println();
//        System.out.println(strings[1]);
    }

}
