
package br.com.unifil.analisadorLexico.referencias;

public class BnfString {
    String s[] ;
    String bnfString = "";
    public BnfString(String bnf){
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
                bnfString += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfString += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfString += "<method modifier> ";
            }else if(s[i].equals("String")){
                bnfString += "<string literal> ";
            }else if(s[i].matches("\"(\\s*\\w*\\s*)*\"")){
                bnfString += s[i];
            }else{
                bnfString += "<variable name> ";
            }
        }
        return bnfString;
    }
}
