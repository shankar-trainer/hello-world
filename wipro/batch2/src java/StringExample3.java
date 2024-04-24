public class StringExample3 {

    public static void main(String[] args) {
        String s1="hello how are you";

        System.out.println(s1.substring(4));
        System.out.println(s1.substring(4,8));

        String name=" ram kumar ";
        System.out.println(name.length());
        System.out.println( name.trim().length());

        String[] s = s1.split(" ");
        for (String p:s)
            System.out.print(p+", ");

        s1="we-all-are-indian";
        System.out.println("\nsplit using - \n");
        s = s1.split("-");
        for (String p:s)
            System.out.print(p+", ");

        s1="learning-java@requires&patience.we-will@learn";
        System.out.println("\nsplit using  multiple delimeters  \n");
        s = s1.split("-|@|&");
        for (String p:s)
            System.out.print(p+", ");

        System.out.println();
        System.out.println("hello".toUpperCase());
        System.out.println("WELCOME".toLowerCase());


    }
}
