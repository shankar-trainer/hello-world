public class StringBufferExample1 {

    public static void main(String[] args) {
        String s1="hello";
        System.out.println(s1);
        s1.concat("world ");
        System.out.println(s1);
        String s3 = s1.concat("world ");
        System.out.println(s3);

        //StringBuffer stringBuffer1="hello";// StringBuffer cannot accept string literal
        StringBuffer stringBuffer1=new StringBuffer("greeting");
        System.out.println(stringBuffer1);
        stringBuffer1.append("to the java");
        System.out.println(stringBuffer1);

        stringBuffer1.delete(3, 7);
        System.out.println(stringBuffer1);
        stringBuffer1.reverse();
        System.out.println(stringBuffer1);
        stringBuffer1.insert(5, " gl bajaj   ");
        System.out.println(stringBuffer1);
        //StringBuffer are  synchronized
         // StringBuilder is not synchronized
        StringBuilder stringBuilder=new StringBuilder("hello world");
        System.out.println(stringBuilder);
        stringBuilder.append("to spring");
        System.out.println(stringBuilder);

    }

}
