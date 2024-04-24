public class BubbleSort {
    static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void display(int arr[]) {
        for (int x : arr)
            System.out.print(x + ", ");
    }

    public static void main(String[] args) {
        int ar[] = {11, 2, 1, 33, 4};
        System.out.println("unsorted array ");
        display(ar);
        System.out.println("sorted array");
        display(sort(ar));
    }
}
