public class ArrayOperation {

    static void access_position(int arr[], int pos) {
        System.out.println("\nAccess Element at position " + pos);
        if (pos > arr.length) {
            System.out.println("in access operation position not present");
         return;
        }
        else
            System.out.println(arr[pos - 1]);
    }

    static void access_all(int arr[]) {
        System.out.println("\nAcess All Elements ");
        for (int p : arr)
            System.out.print("\t" + p);
    }
    static int[] update1(int ar[], int pos, int element) {
        if (pos > ar.length) {
            System.out.println("in update operation position not present");
            System.exit(0);
        }
        ar[pos]=element;
        return  ar;
    }

    static int[] update(int ar[], int pos, int element){
        if (pos > ar.length) {
            System.out.println("in update operation position not present");
            System.exit(0);
        }
        int ar1[] = new int[ar.length ];
        for (int i = 0; i <pos ; i++) {
            ar1[i]=ar[i];
        }
        ar1[pos]=element;
        for (int i = pos+1; i <ar.length ; i++) {
            ar1[i]=ar[i];
        }
        return ar1;
    }

    static int[] insert(int ar[], int pos, int element) {
        if (pos > ar.length) {
            System.out.println("in insert operation position not present");
            System.exit(0);
        }
        int ar1[] = new int[ar.length + 1];

        for (int i = 0; i < pos; i++) {
            ar1[i] = ar[i];
        }
        ar1[pos] = element;
        for (int i = pos + 1; i < ar1.length; i++) {
            ar1[i] = ar[i - 1];
        }
        return ar1;
    }

    static int [] delete(int ar[], int pos){
        if (pos > ar.length) {
            System.out.println("in delete operation position not present");
            System.exit(0);
        }
        int ar1[] = new int[ar.length -1];

        for (int i = 0; i <=pos-1; i++) {
            ar1[i] = ar[i];
        }

        for (int i = pos+1  ; i <=ar1.length; i++) {
            ar1[i-1] = ar[i];
        }

        return  ar1;
    }
    static int[] slice(int arr[], int start, int end){
        if (end > arr.length || start>arr.length || start<0 || end<0) {
            System.out.println("in slice operation end/start position not present");
            System.exit(0);
        }
        int ar[]=new int[end-start];
        int x=0;
        for (int i = start; i <end ; i++) {
            ar[x++]=arr[i];
        }
        return  ar;
    }
    static int[] reverse(int ar[]){
        int ar1[]=new int[ar.length];
        int x=0;
        for (int i = ar1.length-1; i >=0 ; i--) {
            ar1[x++]=ar[i];
        }
        return  ar1;
    }

    public static void main(String[] args) {
        System.out.println("start of program");
        int ar[] = {11, 2, 3, 22, 66};
        access_all(ar);
        access_position(ar, 3);
        access_position(ar, 5);
        access_position(ar, 6);
        ar = insert(ar, 5, 999);
        access_all(ar);
        System.out.println("\nend of program");
        ar=delete(ar,3);
        System.out.println("after delete ");
        access_all(ar);
        ar=update(ar,2,888);
        System.out.println("after update");
        access_all(ar);

        int arr1[]={1,2,3,4};
        arr1=update1(arr1,2,555);
        access_all(arr1);
        int arr2[]={11,22,33,44,55,66};
        access_all(arr2);
        System.out.println("after slice");
        access_all(slice(arr2,2,4));
        int arr3[]={5,6,7,8,9};
        access_all(arr3);
        System.out.println("\nreverse");
        arr3=reverse(arr3);
        access_all(arr3);
    }
}
