public class StringPalindrome {
    public boolean isPalindrome(String s){



        return true;
    }

    public static void main(String[] args) {

        String var="we are learning java. java is very popular";

        System.out.println(var.indexOf("java"));
        System.out.println(var.lastIndexOf("java"));
        System.out.println(var.replace('e','z'));

        System.out.println(var.replaceAll("java","python"));

        System.out.println(var.substring(4));
        System.out.println(var.substring(4, 15));

        String s1="hello";
        String s2=s1.intern();
        System.out.println(s2);
        System.out.println(s1==s2);



    }
}
