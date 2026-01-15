package regex.q2;

public class UserMainCode {

    static String removeEvenVowels(String s){
           StringBuffer stringBuffer=new StringBuffer(s);
        for (int i = 0; i <stringBuffer.length() ; i++) {
            if(i%2!=0) {
                if (stringBuffer.charAt(i) == 'a' || stringBuffer.charAt(i) == 'A'
                        || stringBuffer.charAt(i) == 'e'|| stringBuffer.charAt(i) == 'E'
                        || stringBuffer.charAt(i) == 'i'|| stringBuffer.charAt(i) == 'I'
                        || stringBuffer.charAt(i) == 'o'|| stringBuffer.charAt(i) == 'O'
                        || stringBuffer.charAt(i) == 'u'|| stringBuffer.charAt(i) == 'U'
                ) {
                    stringBuffer.deleteCharAt(i);
                }
            }
        }
return stringBuffer.toString();
    }

}
class Main{
    public static void main(String[] args) {
        System.out.println(UserMainCode.removeEvenVowels("commitment"));
    }
}