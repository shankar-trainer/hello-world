public class ArrayPrg1 {


    public static void main(String[] args) {
        int ar[]={11,2,1,33,4,9};
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar.length);
        System.out.println(ar[5]);
        System.out.println(ar[ar.length-1]);

        ar[3]=99;
        System.out.println("all elements using for loop ");
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+", ");
        }

        System.out.println("\narray elements using for each loop");
        for (int k:ar)
            System.out.print(k+", ");

        System.out.println(ar[6]);// error
    }

}
