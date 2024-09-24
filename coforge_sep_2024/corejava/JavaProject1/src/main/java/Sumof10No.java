public class Sumof10No {

    public static void main(String[] args) {

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter 10 no ");
        int n=1, sum=0;
        int k=0;
        int min=0,max=0;
        while(n++<=10) {
            k= sc.nextInt();
            if(n==2)
                max=min=k;
            else if(k>=max)
                max=k;
            else if(k<=min)
                min=k;

            sum = sum +k;
        }

        System.out.println("sum is "+sum );
        System.out.println("max  is "+max );
        System.out.println("min  is "+min );
    }

}
