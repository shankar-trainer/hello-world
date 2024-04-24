public class Char_CodeValue {

    public static void main(String[] args) {

        char mychar='A';
        System.out.println(mychar);
        System.out.println((int)mychar); //ASCII code
        int val=99;
        System.out.println(val); // 99 ascii code
        System.out.println((char)val); //  c

        int count=1;
        while(count<=255) {
            System.out.print(count + "  " + (char) count + "\t");
          count++;
          if(count%5==0)
              System.out.println();
        }

    }
}
