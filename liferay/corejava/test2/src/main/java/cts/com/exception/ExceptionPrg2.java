package cts.com.exception;

public class ExceptionPrg2 {

    public static void main(String[] args) {
        System.out.println("start  of the program ");

        int x = 10;
        int y = 0;
        int ar[] = {1, 2, 3};

        try {
            int result = x / y;
            System.out.println("division result is " + result);
            System.out.println("3rd element in array is " + ar[3]);
        }
        catch (ArithmeticException e){
            System.err.println("division error ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("array index not present ");
        }
        catch (Exception e) {
//            System.out.println("error is "+e.getMessage());
            System.err.println("error is " + e.getMessage());
        }
        System.out.println("end  of the program ");
    }

}
