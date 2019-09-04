
package view;

public class BnfDouble {
    String s[] ;
    String bnfDouble = "";
    
    public BnfDouble(String bnf){
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
                bnfDouble += "<assignment operator> ";
            }else if(s[i].equals("=")){
                bnfDouble += "::= ";
            }else if(s[i].equals("public")  || s[i].equals("private")  || s[i].equals("default")  || s[i].equals("protected") ){
                bnfDouble += "<method modifier> ";
            }else if(s[i].equals("double")){
                bnfDouble += "<floating-point type> ";
            }else if(s[i].matches("^[0-9]*$")){
                bnfDouble += "<numeric> ";
            }else if(s[i].matches("\\d+((\\.\\d+)?(f|F)?)?")){
                bnfDouble += "<numeric>";
            }else{
                bnfDouble += "<variable name> ";
            }
        }
        return bnfDouble;
    }
    
}
