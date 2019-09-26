package br.com.unifil.analisadorLexico.referencias;
public class BnfInt {
    String s[] ;
    String bnfInt = "";
    public BnfInt(String bnf){
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
                bnfInt += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfInt += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfInt += "<method modifier> ";
            }else if(s[i].equals("int")){
                bnfInt += "<integral type> ";
            }else if(s[i].matches("^[0-9]*$")){
                bnfInt += "<numeric> ";
            }else{
                bnfInt += "<variable name> ";
            }
        }
        return bnfInt;
    }
    
    public void imprime(){
        for(int i = 0;i < s.length;i++ ){
            System.out.printf(s[i] + "\n");
        }
    }
}
