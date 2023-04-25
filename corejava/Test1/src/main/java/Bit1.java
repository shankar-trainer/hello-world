
public class Bit1 {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(22));
        System.out.println(Integer.toBinaryString(33));

        //System.out.println(2|3);
        //System.out.println(2&3);

        System.out.println((22>>7)+" "+Integer.toBinaryString(22>>7));
        System.out.println((22<<7)+" "+Integer.toBinaryString(22<<7));
        System.out.println((22>>>7)+" "+Integer.toBinaryString(22>>>7));
    }

}
