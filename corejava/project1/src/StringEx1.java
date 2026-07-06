public class StringEx1 {


    public static void main(String[] args) {

        String s1="hello";
        System.out.println(s1);
        s1.concat("world");

        System.out.println(s1);

        String s2="hello";    // s1 ,s2 will refers the same object in string pool
                              // 2  references and one object

        System.out.println(s1==s2);   //true // ==  it checks references
        System.out.println(s1.equals(s2));// true // .equals checks content

        String s3=new String("hello"); // it will create new object outside string pool
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3)); // true

        System.out.println( "abc"=="abc"); // true
        System.out.println( "abc"==new String("abc"));// false
        System.out.println( "abc".equals(new String("abc")));// true
    }
}
