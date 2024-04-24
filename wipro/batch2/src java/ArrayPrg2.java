public class ArrayPrg2 {

    static int sum(int array1[]) {
        int s = 0;
        for (int i = 0; i < array1.length; i++) {// simple for loop
            s = s + array1[i];
        }
        return s;
    }

    static int sum1(int array1[]) {
        int s = 0;
        for (int i : array1) { // for each loop
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        // first way array initialisation
        int[] ar = {11, 2, 1, 33, 4, 9};
        // second way array initialisation
        // array with 4 elements each element is initialised with 0
        int[] ar1 = new int[4];

        for (int k : ar1)// for each loop, no index, used for access elements
            System.out.print(k + ",");

        for (int h = 0; h < ar1.length; h++)// index support, use for access, update, delete elements
            ar1[h] = 110 + h;

        System.out.println("\n array elements are \n");
        for (int k : ar1)
            System.out.print(k + ",");

        System.out.println("sum of array is " + sum(ar1));
        System.out.println("sum of array is " + sum1(ar1));
    }
}
