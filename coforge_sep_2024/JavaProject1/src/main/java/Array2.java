public class Array2 {
    static void display(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void display1(int array[][]) {
        for (int ar[] : array) {
            for (int a : ar)
                System.out.print(a + ", ");
            System.out.println();
        }
    }

    static int[][] addition(int ar1[][], int ar2[][]) {
        int ar3[][] = new int[ar1.length][ar1[0].length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                ar3[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return  ar3;
    }

        public static void main (String[]args){
            int ar1[][] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 8, 7, 6},
            };
            System.out.println("array row length " + ar1.length);
            System.out.println("array col length " + ar1[0].length);
            int ar2[][] = {
                    {9, 8, 7, 6},
                    {5, 4, 3, 2},
                    {1, 2, 3, 4},
            };
            System.out.println("array1 is \n");
            display1(ar1);
            System.out.println("array2 is \n");
            display1(ar2);
            System.out.println("addition of two array \n");
            display1(addition(ar1,ar2));

        }
    }
