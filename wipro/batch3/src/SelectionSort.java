public class SelectionSort {

    static int[] sort(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min])
                    min = j;
            }
            int temp = ar[min];
            ar[min] = ar[i];
            ar[i] = temp;
        }
        return ar;
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
