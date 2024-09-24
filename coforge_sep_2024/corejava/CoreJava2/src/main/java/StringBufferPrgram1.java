public class StringBufferPrgram1 {

    public static void main(String[] args) {

        String s1="hello";
        System.out.println(s1);
        s1.concat("world");
        System.out.println(s1);

        //StringBuffer stringBuffer="hello";
        //StringBuffer does not accept String literal and string object

        //StringBuffer s2=new String("hello");
        StringBuffer s2=new StringBuffer("hello");

        System.out.println("StringBuffer Program");
        System.out.println(s2);
        s2.append(" world to java");
        System.out.println(s2);

        // StringBuffer is mutable

        s2.delete(4,9);
        System.out.println(s2);
        s2.insert(2,"i m fine");
        System.out.println(s2);

        s2.reverse();
        System.out.println(s2);

        StringBuffer buffer1=new StringBuffer("welcome");
        StringBuffer buffer2=new StringBuffer("welcome");

        System.out.println(buffer1==buffer2);
        System.out.println(buffer1.equals(buffer2));
        System.out.println(buffer1.toString().equals(buffer2.toString()));

        "".equals("");
        // StringBuffer is   synchronized(thread safe)
        // StringBuilder is  not synchronized(thread safe)

        StringBuilder stringBuilder=new StringBuilder("hello world");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
