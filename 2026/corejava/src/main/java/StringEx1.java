public class StringEx1 {
    public static void main(String[] args) {

        String a="hello";
        String b="hello";  // for a, b string pool refers same object , 2 references and 1 object


        String c=new String("hello"); // new object outside string pool

        System.out.println(a);
        String s2=a.concat("world");

        System.out.println(a);
        System.out.println(s2);

        System.out.println(a==b);// == checks references
        System.out.println(a==c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println("abc"=="abc");
        System.out.println("abc"==new String("abc"));

        String s3="we are learning java ";

        String[] s = s3.split(" ");
        System.out.println(s.length);

//        StringBuffer stringBuffer="";// error
        StringBuffer stringBuffer=new StringBuffer("java");// error
        stringBuffer.append(" world ");
        System.out.println(stringBuffer);

        stringBuffer.delete(1,5);
        System.out.println(stringBuffer);

        stringBuffer.reverse();

        System.out.println(stringBuffer);
    }

}
