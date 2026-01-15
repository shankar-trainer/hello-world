package regex.q1;

public class UserMainCode {

   static  int validateNumber(String s){
//       if(s.matches("\\d{3}-\\d{3}-\\d{4}")){
       if(s.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")){
           return  1;
       }
       return  -1;
    }
}
class Main{
    public static void main(String[] args) {

//        if(UserMainCode.validateNumber("-123-456-7895")==1){
        if(UserMainCode.validateNumber("123-456-7895")==1){
            System.out.println("Valid number format");
        }
        else
            System.out.println("InValid number format");
    }
}