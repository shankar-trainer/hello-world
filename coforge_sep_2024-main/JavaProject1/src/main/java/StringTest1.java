public class StringTest1 {

    public static void main(String[] args) {
        String s1 = "hello";

        System.out.println(s1);
        s1.concat("world");
        System.out.println(s1);
        System.out.println(s1.concat("world"));

        String s2 = s1.concat("world");
        String var1 = "abc";
        String var2 = "abc";

        // var1, var2  -- refers same object in string pool
        // 2 reference variable single object
        System.out.println(var1 == var2);

        // ==   it checks references

        String var3 = new String("abc"); // create new object outside string pool
        // this refers different object

        System.out.println(var1 == var3); // false

        //.equals -- checks the content not reference

        System.out.println(var1.equals(var3));//true
        System.out.println(var1.equals(var2));// true
    }

}
