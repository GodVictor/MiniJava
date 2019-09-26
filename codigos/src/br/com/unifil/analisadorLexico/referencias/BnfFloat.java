
package br.com.unifil.analisadorLexico.referencias;

public class BnfFloat {
    String s[] ;
    String bnfFloat = "";
    
    public BnfFloat(String bnf){
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
                bnfFloat += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfFloat += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfFloat += "<method modifier> ";
            }else if(s[i].equals("float")){
                bnfFloat += "<floating-point type> ";
            }else if(s[i].matches("^[0-9]*$")){
                bnfFloat += "<numeric> ";
            }else if(s[i].matches("\\d+((\\.\\d+)?(f|F))?")){
                bnfFloat += "<numericf> ";
            }else{
                bnfFloat += "<variable name> ";
            }
        }
        return bnfFloat;
    }
    
}
