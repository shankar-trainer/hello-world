public class Calculator {
    static int addition(int a, int b){
        return a+b;
    }
    static int subtraction(int a, int b){
        return a-b;
    }
    static int multiplication(int a, int b){
        return a*b;
    }
    static int division(int a, int b){
        return a/b;
    }
    //psvm -->tab
    public static void main(String[] args) {
        //sout -->tab
        int p,q,r;
        String op;
        System.out.println("hello");
        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println("Enter two number");
        p=sc.nextInt();
        q=sc.nextInt();

        System.out.println("Enter choice + - * \\");
        op=sc.next();
        if(op.equals("+"))
            System.out.println("Addition is "+addition(p,q));
        else if(op.equals("-"))
            System.out.println("Subtraction is "+subtraction(p,q));
        else if(op.equals("*"))
            System.out.println("Multiplication is "+multiplication(p,q));
        else if(op.equals("/"))
            System.out.println("Division is "+division(p,q));
        else
               System.out.println("invalid operation");
    }
}

