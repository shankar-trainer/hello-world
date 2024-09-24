public class StringTest2 {

    public static void main(String[] args) {

        String var1 = "  hello world  ";
        System.out.println(var1.length());
        System.out.println(var1.toUpperCase());
        System.out.println(var1.toLowerCase());

        String trim = var1.trim();
        System.out.println(trim.length());

        String var2 = "we are learning java";
        String[] s = var2.split(" ");
        for (String k : s)
            System.out.println(k);

        var2 = "we-are-learning-java";
        s = var2.split("-");
        for (String k : s)
            System.out.println(k);

        var2 = "we-are@learning&java";
        s = var2.split("-|@|&");
        for (String k : s)
            System.out.println(k);


    }
}
