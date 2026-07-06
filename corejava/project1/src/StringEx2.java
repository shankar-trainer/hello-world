public class StringEx2 {

    public static void main(String[] args) {
        String var1="we are learning java. we will learn spring too";
        System.out.println(var1.length());

        System.out.println(var1.charAt(0));
        System.out.println(var1.charAt(2));
        System.out.println(var1.charAt(3));

        char[] charArray = var1.toCharArray();

        String[] s = var1.split(" ");
        for(String p:s)
            System.out.print(p+",  ");

        System.out.println(var1.indexOf("are"));
        System.out.println(var1.indexOf("are1"));
        System.out.println(var1.indexOf("we"));
        System.out.println(var1.lastIndexOf("we"));

        String var2="we-are@learning&java.we_will@learn&spring$too";

        s = var1.split("-|@|&|$");
        for(String p:s)
            System.out.print(p+",  ");

    }

}
