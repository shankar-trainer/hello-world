public class StringBufferExample {
    public static void main(String[] args) {

        String s1="hello ";
        System.out.println(s1);
        String s2= s1.concat("world");
        System.out.println(s1);

        //StringBuffer stringBuffer="hello";
        StringBuffer stringBuffer=new StringBuffer("hello");
        System.out.println(stringBuffer);
        stringBuffer.append(" india ");
        System.out.println(stringBuffer);

        //StringBuffer  has diferrent  methods as insert, delete, reverse

        stringBuffer.delete(4,8);
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.insert(3,"welcome");
        System.out.println(stringBuffer);

        StringBuffer sb1=new StringBuffer(12);
        System.out.println(sb1.capacity());
       sb1.append("hellohellohello");
        System.out.println(sb1.capacity());
        System.out.println(sb1);
        sb1.insert(4,123);
    }
}
