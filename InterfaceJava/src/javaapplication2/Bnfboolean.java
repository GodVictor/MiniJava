package javaapplication2;


public class Bnfboolean
{
    String s[] ;
    String bnfString = "";
    
    public Bnfboolean(String bnf){
        s = bnf.split(";");
        bnf = "";
        for(int i = 0;i < s.length;i++ ){
            bnf += s[i];
        }
        s = bnf.split(" ");
    }
    
    public void converter(){
        for(int i = 0;i < s.length;i++ ){
            if(s[i].equals("true") || s[i].equals("false") ){
                bnfString += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfString += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfString += "<method modifier> ";
            }else if(s[i].equals("boolean")){
                bnfString += "<type> ";
            }else{
                bnfString += "<variable name> ";
            }
        }
        System.out.println(bnfString);
    }
    
    public void imprimir(){
        for(int i = 0;i < s.length;i++ ){
            System.out.printf(s[i] + "\n");
        }
    }
}
