public class Factorial {

    static int getFactorial(int s){
        int f=1;
        int count=s;
        //5*4*3*2*1
        while(count>=1){
            f=f*count;
            count--;
        }
        return  f;
    }

    public static void main(String[] args) {
        int p,res, fact=1, c=1;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        p=sc.nextInt();
          //1*2*3*4*5
        while(c<=p){
            fact=fact*c;
            c++;
        }
        System.out.println("factorial is "+fact);

        p=sc.nextInt();
        res=getFactorial(p);
        System.out.println("factorial of "+p+" is "+res);
    }
}
