public class Prime_1_to_100 {

    static void Prime() {
       int p=1;
        while(p<=100)
        {
            int c = 2;
            while (c <= p - 1) {
                if (p % c == 0)
                    break;
                c++;
            }

            if (p==1)
                System.out.print(p+", ");
            if (c ==p)
                System.out.print(p+", ");
            p++;
        }
    }

    public static void main(String[] args) {
        Prime();
    }

}
