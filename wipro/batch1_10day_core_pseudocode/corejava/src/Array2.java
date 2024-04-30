public class Array2 {

    public static void main(String[] args) {

        int ar3[]=new int[4];
        int ar5[]={22,33,44,55};

        int ar6[]=new int[]{1,2,3,4,5};

        for (int i = 0; i <ar6.length ; i++) {
            System.out.print(ar6[i]+", ");
        }

        System.out.println("\nfor each \n");

       for (int i:ar6)
           System.out.print(i+", ");
    }
}
