public class ArrayOperation {
    static void arrayAccessByIndex(int arr[], int index) {
        if (index <= arr.length)
            System.out.println("found at index " + index + " element is " + arr[index - 1]);
        else
            System.out.println("not found at index " + index);
    }

    static boolean arrayAccessByElement(
            int arr[], int element) {
        for (int k : arr) {
            if (element == k)
                return true;
        }
        return false;
    }

    static int[] arrayReverse(int a[]) {
        int temp[] = new int[a.length];
        int index = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[index--];
        }
        return temp;
    }

    static void display(int myarr[]) {
        System.out.println("array elements are ");
        for (int k : myarr)
            System.out.print(k + ", ");
    }

    static int[] update(int arr[], int element, int pos) {
        int temp[] = new int[arr.length];
        if (pos < 1 || pos > arr.length) {
            System.out.println("invalid position");
            System.exit(1);
        } else {
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
                if (i == pos - 1)
                    temp[i] = element;
            }
        }
        return temp;
    }

    static int[] insert(int ar[], int pos, int element) {
        int temp[] = new int[ar.length + 1];
        if (pos < 1 || pos > ar.length) {
            System.out.println("invalid position");
            System.exit(1);
        } else {
            for (int i = 0; i < temp.length; i++) {
                if (i < pos - 1)
                    temp[i] = ar[i];
                else if (i == pos - 1)
                    temp[i] = element;
                else if (i > pos - 1)
                    temp[i] = ar[i - 1];
            }
        }
        return temp;
    }

    static int[] delete(int ar[], int pos) {
        int temp[] = new int[ar.length - 1];
        if (pos < 1 || pos > ar.length) {
            System.out.println("invalid position");
            System.exit(1);
        } else {
            for (int i = 0; i < temp.length; i++) {
                if (i < pos - 1)
                    temp[i] = ar[i];
                else if (i >= pos - 1)
                    temp[i] = ar[i + 1];
            }
        }
        return temp;
    }

    static int[] slice(int arr[], int start, int end) {
        int len = end - start;
        int temp[] = new int[len];
        if (start < 1 || end < 1 || start > arr.length || end > arr.length) {
            System.out.println("invalid start or end position");
            System.exit(1);
        } else {
            int index = 0;
            for (int i = start - 1; i < end - 1; i++) {
                temp[index++] = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 45, 9, 66, 77};
        System.out.println("array access by index operation");
        arrayAccessByIndex(arr, 6);
        System.out.println("array access by element operation");
        System.out.println("element present " + arrayAccessByElement(arr, 456));
        System.out.println("array reverse operation ");
        display(arrayReverse(arr));
        System.out.println("slice operation");
        display(arr);
        int[] slice = slice(arr, 2, 6);
        System.out.println("slice values ");
        display(slice);
        System.out.println("update operation");
        display(arr);
        System.out.println("after update");
        arr = update(arr, 7999, 5);
        display(arr);
        System.out.println("array insert operation");
        arr = insert(arr, 3, 5555);
        display(arr);
        System.out.println("\ndelete operation");
        arr = delete(arr, 14);
        display(arr);
        System.out.println("progrm ends ");
    }
}

