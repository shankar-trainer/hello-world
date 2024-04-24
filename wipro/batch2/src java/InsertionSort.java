public class InsertionSort {

    static int[] insertionSort(int arr[]) {
        for (int j = 1; j <arr.length ; j++) {
            int  key=arr[j];
            int i=j-1;
            while((i>-1) && (arr[i]>key)){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
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
        display(insertionSort(ar));
    }
}
