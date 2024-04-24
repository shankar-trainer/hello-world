public class SelectionSort {

    static int[] selectionSort(int ar[]){
        for (int i = 0; i <ar.length-1 ; i++) {
            int min=i;
            for (int j = i; j <ar.length ; j++) {
                if(ar[j]<ar[min])
                    min=j;
                {
                    int temp=ar[i];
                    ar[i]=ar[min];
                    ar[min]=temp;
                }
            }
        }
        return  ar;
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
        display(selectionSort(ar));
    }
}
