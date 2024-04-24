public class Arra2DPrg1 {

    static void display1(int myarr[][]) {
        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr[0].length; j++) {
                System.out.print(myarr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static void display2(int myarr[][]) {
        for (int ar[] :myarr) {
            for (int i : ar) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }
    static int [][] addition(int myarr1[][], int myarr2[][]){
      int myarr3[][]=new int[myarr1.length][myarr1[0].length];
        for (int i = 0; i <myarr1.length ; i++) {
            for (int j = 0; j <myarr1[0].length ; j++) {
                myarr3[i][j]=myarr1[i][j]+myarr2[i][j];
            }
        }
      return  myarr3;
    }

    public static void main(String[] args) {
        int arr1[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 8, 7, 6}
        };
        int arr2[][] = {
                {9, 8, 7, 6},
                {5, 4, 3, 2},
                {1, 2, 3, 4}
        };

        System.out.println("matrix1 using for loop ");
        display1(arr1);
        System.out.println("\nmatrix2 using for each loop\n");
        display2(arr1);

        int[][] addition = addition(arr1, arr2);
        System.out.println("summation of two matrix ");
        display2(addition);
    }
}
