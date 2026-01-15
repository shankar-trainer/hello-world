public class StringBufferExample {

    public static void main(String[] args) {

        String s1="hello";
        System.out.println(s1);
        s1.concat("world");
        System.out.println(s1);

//        StringBuffer stringBuffer="hello";// StringBuffer does not accept String literal

        StringBuffer stringBuffer=new StringBuffer("hello"); // StringBuffer is mutable, modifiable
        System.out.println(stringBuffer);
        stringBuffer.append(" to java");
        System.out.println(stringBuffer);

        stringBuffer.delete(2,3);
        System.out.println(stringBuffer);

        stringBuffer.insert(2," learning");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String p="abcba";
        String p1=new StringBuffer("abcba").reverse().toString();

        System.out.println("palindrome or not "+p.equals(p1));
    }
}
