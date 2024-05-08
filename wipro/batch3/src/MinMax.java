public class MinMax {
    static void minmax(int p,java.util.Scanner scanner){
       int min=0,max=0;
       int k;

        for (int i = 1; i <=p ; i++) {
            System.out.println("enter no");
            k= scanner.nextInt();

           if(i==1)
               max=min=k;
           else if(k>=max)
               max=k;
           else if (k<=min)
               min=k;
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
    public static void main(String[] args) {

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter no of elements ");
        int n=sc.nextInt();
        minmax(n,sc);
    }
}
