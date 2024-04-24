public class StringExample2 {
    public static void main(String[] args) {

        String s1 = "we are learning java.later we will learn full stack java";
        //int pos = s1.indexOf("java");
        int pos = s1.lastIndexOf("java");
        if (pos >= 0)
            System.out.println("found at " + pos);
        else
            System.out.println("not found ");
        String replace = s1.replace('e', 'x');
        System.out.println(replace);

        String s = s1.replaceAll("java", "python");
        System.out.println(s);

        String email = "ipro_ramkumargmail.co";

        if (!email.endsWith(".com"))
            System.out.println("invalid mail does not ends with .com");
        else if (!email.startsWith("wipro"))
            System.out.println("invalid email does not start with wipro ");
        else if (email.indexOf("@") < 0)
            System.out.println("using index of \ninvalid email does not contain @ sign  ");
        else if (!email.contains("@"))
            System.out.println("using contains \ninvalid email does not contain @ sign  ");
        else
            System.out.println("valid email ");
    }
}
