public class StringPrg1 {

    public static void main(String[] args) {

        // string literal is string object
        // any values inside "" is string object
        String var1 = "hello";
        String var2 = "hello";

        //String is collection of characters
        //fixed length immutable sequence of characters
        // immutable  -- not changeable

        System.out.println(var1);
        var1.concat(" world ");
        System.out.println(var1);

        // it will not change in its original but change the value and return it

        String var3 = var1.concat(" world ");
        System.out.println(var3);
    }
}
