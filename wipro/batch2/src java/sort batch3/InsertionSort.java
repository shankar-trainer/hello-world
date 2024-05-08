public class InsertionSort {

    static int[] sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static void display(int ar[]) {
        for (int h : ar)
            System.out.print(h + ", ");
    }

    public static void main(String[] args) {
        int ar[] = {3, 1, 2, 10, 6, 5, 55};
        System.out.println("unsorted array ");
        display(ar);
        System.out.println("\nsorted array ");
        int ar1[] = sort(ar);
        display(ar1);
    }
}
