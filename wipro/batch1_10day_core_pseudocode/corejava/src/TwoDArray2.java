public class TwoDArray2 {
    static void display(int a[][]){
        System.out.println("\nArray");
        for(int ar[]:a) {
            for (int j : ar) {
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }
    static int[][] sum(int a[][], int b[][]){
        int arr3[][]=new int[a.length][a[0].length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                arr3[i][j]=a[i][j]+b[i][j];
            }
        }
        return  arr3;
    }


        public static void main(String[] args) {

        int arr1[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int arr2[][]={
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        display(arr1);
        display(arr2);
        int arr_sum[][]=sum(arr1,arr2);
        System.out.println("sum of array ");
        display(arr_sum);
    }
}
