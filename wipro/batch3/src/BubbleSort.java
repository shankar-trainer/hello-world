public class BubbleSort {
    static int[] sort(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }

    static void display(int arr[]) {
        for (int i : arr)
            System.out.print(i + ", ");
    }

    public static void main(String[] args) {
        int ar[] = {11, 2, 1, 3, 4, 50};
        System.out.println("unsorted array");
        display(ar);
        System.out.println("\nsorted array");
        display(sort(ar));
    }
}