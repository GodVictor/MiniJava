
package br.com.unifil.analisadorLexico.modelo;

public class BnfChar {
    String s[] ;
    String bnfChar = "";
    public BnfChar(String bnf){
        s = bnf.split(";");
        bnf = "";
        for(int i = 0;i < s.length;i++ ){
            bnf += s[i];
        }
        s = bnf.split(" ");
    }
    
    public String converter(){
        for(int i = 0;i < s.length;i++ ){
            if(s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/") ){
                bnfChar += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfChar += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfChar += "<method modifier> ";
            }else if(s[i].equals("char")){
                bnfChar += "<integral type> ";
            }else if(s[i].matches("'\\w'")){
                bnfChar += s[i];
            }else{
                bnfChar += "<variable name> ";
            }
        }
        return bnfChar;
    }
}
