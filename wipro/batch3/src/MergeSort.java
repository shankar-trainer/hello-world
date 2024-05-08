public class MergeSort {
    static int[] sort(int ar[],int low,int high){

        int N=high-low;
        if (N<=1)
          return ar;
        int mid=low+N/2;
        //recursive sort
        sort(ar,low,mid);
        sort(ar,mid,high);

        // merge two array
        int temp[]=new int[N];
        int i=low,j=mid;
        for (int k = 0; k <N; k++) {
            if(i==mid)
                temp[k]=ar[j++];
            else if(j==high)
                temp[k]=ar[i++];
            else if (ar[j]<ar[i])
                temp[k]=ar[j++];
            else
                temp[k]=ar[i++];
        }
        for (int k = 0; k <N ; k++) {
            ar[low+k]=temp[k];
        }
        return  ar;
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
        int ar1[] = sort(ar,0,ar.length);
        display(ar1);
    }
}
