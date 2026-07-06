public class Test2 {

    public static void main(String[] args) {
        System.out.println("Byte max value " + Byte.MAX_VALUE);// 127
        System.out.println("Byte min value " + Byte.MIN_VALUE);// -128

        System.out.println("Short  max value " + Short.MAX_VALUE);// 32767
        System.out.println("Short min value " + Short.MIN_VALUE);// -32768

        System.out.println("Integer  max value " + Integer.MAX_VALUE);// 2147483647
        System.out.println("Integer min value " + Integer.MIN_VALUE);// -2147483648

        byte b1 = 127;
        //b1=128; // error
        short s1 = 128;

        s1 = 32767;
//        s1 = 32768; // error

        int k = 2147483647;
        //k=2147483648; // error
        long l1 = 2147483648l;


    }

}
