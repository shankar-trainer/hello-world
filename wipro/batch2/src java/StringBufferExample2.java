

public class StringBufferExample2
{

    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer(3);
        System.out.println(sb1.capacity());
        sb1.append("abc");
        System.out.println(sb1.capacity());

        sb1.append("d");
        System.out.println(sb1.capacity());

    }

}
