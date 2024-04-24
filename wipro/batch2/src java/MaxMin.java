public class MaxMin {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        int c=1,n, min=0,max=0;
        do {
            System.out.println("Enter no : "+c);
            n=sc.nextInt();
            if(c==1)
                min=max=n;
            else if(n>=max)
                max=n;
            else if(n<=min)
                min=n;
            c++;
        }
        while(c<=10);
        System.out.println("min is :"+min);
        System.out.println("max is :"+max);
    }
}
