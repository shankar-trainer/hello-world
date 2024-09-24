public class Ascii {
    public static void main(String[] args) {
        int x = 65;
        System.out.println(x);
        System.out.println((char) x);
        System.out.println((char) (++x));

        char p = 'Z';
        System.out.println(p);
        System.out.println((int) p);
        System.out.println("capital alphabet ");
        x = 64;
        while (x++ <= 89) {
            System.out.print(x + "\t" + (char) x + "\t");
            if (x % 5 == 0)
                System.out.println();
        }

        System.out.println("\n small alphabet ");
        int j=1;
        char g='a';

        while(g!='{'){
            System.out.print((g++)+"\t");
            if(j%5==0)
                System.out.println();
            j++;
        }
    }
    static void smallAlphabet(){
       // x=97 to 122 ,,using while loop and cast char display it

    }
}
