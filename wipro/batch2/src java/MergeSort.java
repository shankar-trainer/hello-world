public class MergeSort {
    static int[] mergeSort(int ar[],int low, int high){
        int N=high-low;
        if(N<=1)
             return ar;
        int mid=low+N/2;
        //recursive sort
        mergeSort(ar,low,mid);
        mergeSort(ar,mid,high);
        //merge two sorted sub array
        int temp[]=new int[N];
        int i=low,j=mid;
        for(int k=0;k<N;k++){
            if(i==mid)
                temp[k]=ar[j++];
            else if (j==high)
                temp[k]=ar[i++];
            else if(ar[j]<ar[i])
                temp[k]=ar[j++];
            else
                temp[k]=ar[i++];
            }
        for (int k = 0; k <N ; k++) {
            ar[low+k]=temp[k];
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
        display(mergeSort(ar,0,ar.length));
    }
}
