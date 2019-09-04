package br.com.unifil.analisadorLexico.modelo;

public class Bnfboolean
{
    String s[] ;
    String bnfBoolean = "";
    
    public Bnfboolean(String bnf){
        s = bnf.split(";");
        bnf = "";
        for(int i = 0;i < s.length;i++ ){
            bnf += s[i];
        }
        s = bnf.split(" ");
    }
    
    public String converter(){
        for(int i = 0;i < s.length;i++ ){
            if(s[i].equals("true") || s[i].equals("false") ){
                bnfBoolean += "<boolean literal>";
            }else if(s[i].equals("=")){
                bnfBoolean += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfBoolean += "<method modifier> ";
            }else if(s[i].equals("boolean")){
                bnfBoolean += "<type boolean> ";
            }else{
                bnfBoolean += "<variable name> ";
            }
        }
        return bnfBoolean;
    }
    
    public void imprimir(){
        for(int i = 0;i < s.length;i++ ){
            System.out.printf(s[i] + "\n");
        }
    }
}
