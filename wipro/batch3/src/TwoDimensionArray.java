public class TwoDimensionArray {
    static void display1(int aa[][]) {
        System.out.println("\n using for each");
        for (int a[] : aa) {
            for (int j : a) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }

    static void display(int a[][]) {
        System.out.println("using for loop");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }
    static int[][] matrix_addition(int a[][],int b[][]) {
        System.out.println("addition of matrix\n");
        int c[][]=new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
            c[i][j]=a[i][j]+b[i][j];
            }
        }
        return  c;
    }

    public static void main(String[] args) {
        int ar[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
       int ar1[][] = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1},
                {0, -1, -2}
        };

        System.out.println(ar.length + " no of rows ");
        System.out.println(ar[0].length + " no of cols ");
        //ar[0] -- 1,2,3
        System.out.println("\n ar[0]");
        for(int k:ar[0])
            System.out.print(k+",");
        System.out.println("\n matrix1");
        display(ar);
        System.out.println("\n matrix2");
        display1(ar1);
        int[][] ints = matrix_addition(ar, ar1);
        display1(ints);
    }
}
