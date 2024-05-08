public class Array1 {


    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int ar1[]=new int[5]; // initialise ar1 each element with zero
        System.out.println(ar.length);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);

        System.out.println(ar1[0]);
        System.out.println(ar1[1]);
        System.out.println(ar1[2]);
        System.out.println("traversing array using for loop  \n");
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+", ");
        }
        System.out.println("\nusing for each ");
        for (int k:ar)
            System.out.print(k+", ");
    }
}
