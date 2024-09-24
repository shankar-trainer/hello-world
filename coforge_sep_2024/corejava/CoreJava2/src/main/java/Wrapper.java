public class Wrapper {
    public static void main(String[] args) {

        String age="24";

        // static parseXXX() method
        // takes string and parses and returns primitive value
       int myage= Integer.parseInt(age);

       String amount="4343344.45f";
       float amt=Float.parseFloat(amount);

       //toString() -- object to String conversion

      Integer roll=77878;
      String roll1=  roll.toString();

        // static ValueOf(String) method
        // takes string and parses and returns Object value

       Float am1=  Float.valueOf(amount);
       Integer age1=Integer.valueOf(age);
    }
}
