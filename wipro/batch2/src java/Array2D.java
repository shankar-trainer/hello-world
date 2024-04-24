
public class Array2D {
    public static void main(String[] args) {
        int arr1[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        }; // 2 rows 3 cols

        System.out.println("no of rows " + arr1.length);
        System.out.println("no of cols " + arr1[0].length);
        System.out.println("no of cols " + arr1[1].length);

        System.out.println("1st row ");
        for (int k : arr1[0])
            System.out.print(k + ",");

        System.out.println("\n1st row ");
        for (int i = 0; i < arr1[0].length; i++)
            System.out.print(arr1[0][i] + ",");

        System.out.println("\n2nd row ");
        for (int k : arr1[1])
            System.out.print(k + ",");
    }
}
