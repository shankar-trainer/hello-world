public class TwoDArray1 {
    public static void main(String[] args) {

        int arr1[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // array of 2 row , 3 col
        System.out.println("no of row " + arr1.length);
        System.out.println("no of col " + arr1[0].length);
        System.out.println("no of col " + arr1[1].length);
        System.out.println("first row ");

        for (int i = 0; i < arr1[0].length; i++) {
            System.out.print(arr1[0][i] + ",");
        }
        System.out.println("\nsecond row ");
        for (int i = 0; i < arr1[1].length; i++) {
            System.out.print(arr1[1][i] + ",");
        }

        System.out.println("\nArray elements row using for loop \n");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("\nusing for each \n");
        for(int ar[]:arr1){
            for(int j:ar){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
}
