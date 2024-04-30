public class ListOFPrimeNo {
    static void prime(int x, int y){
        if (x > y) {
            System.out.println("Provide invalid input");
            return;
        }
        if (x < 0 || y < 0) {
            System.out.println("Provide variable input");
            return;
        }
        if ((y-x) < 0) {
            System.out.println("Provide variable input");
            return;
        }
        boolean status=true;
        while(x<=y){
            status=true;
            for (int i = 2; i <=x-1 ; i++) {
                if(x%i==0){
                    status=false;
                    break;
                }
            }
            if(status)
                System.out.print(x+", ");
            x++;
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        prime(x,y);
    }
}
