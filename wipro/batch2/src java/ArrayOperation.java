public class ArrayOperation {
   static int [] reverseArray(int arr[]){
      int ar[]=new int[arr.length];
      int p=0;
       for (int i = ar.length-1; i >=0 ; i--) {
           ar[i]=arr[p++];
       }
       return  ar;
    }
    static int searchByPosition(int arr[], int pos) {
        int p = -1;
        if (pos > arr.length || pos < 1) {
            System.out.println(pos + " position not  present");
             System.exit(0);
        } else {
            p = arr[pos - 1];
        }
        return p;
    }

    static void displayAll(int arr[]) {
        System.out.println("\nDisplay All ");
        for (int p : arr)
            System.out.print(p + ",");
    }

    static int[] updateArray(int arr[], int pos, int element) {
        if (pos > arr.length || pos < 1) {
            System.out.println(pos + " position not  present");
            System.exit(0);
        } else {
            arr[pos - 1] = element;
        }
        return arr;
    }
    static int[] insertArray(int arr[], int pos, int element) {
        int temp[]={};
       if (pos > arr.length || pos < 1) {
            System.out.println(pos + " position not  present");
            System.exit(0);
        } else {
           temp=new int[arr.length+1];
           for (int i = 0; i <temp.length ; i++) {
                if(i<pos-1 )
                 temp[i]=arr[i];
                else if(i==pos-1)
                    temp[i]=element;
                else if(i>pos-1)
                    temp[i]=arr[i-1];
           }
        }
       return  temp;
   }

    static int[] deleteArrayByPosition(int arr[], int pos) {
        int temp[]={};
        if (pos > arr.length || pos < 1) {
            System.out.println(pos + " position not  present");
            System.exit(0);
        } else {
            temp=new int[arr.length-1];
            for (int i = 0; i <temp.length ; i++) {
                if(i<pos-1 )
                    temp[i]=arr[i];
                else if(i>=pos-1)
                    temp[i]=arr[i+1];
            }
        }
        return  temp;
    }
    public static void main(String[] args) {
        int ar[] = {11, 2, 1, 3, 4, 55, 6};

        System.out.println("show all operation ");
        displayAll(ar);
        System.out.println("search element by position");
        int element = searchByPosition(ar, 1);
        if (element != -1)
            System.out.println(element + "found ");
        ar=updateArray(ar,3,666);
        System.out.println("after update all elements are ");
        displayAll(ar);
        System.out.println("\nReverse Of array ");
        ar=reverseArray(ar);
        System.out.println("after reverse all elements are ");
        displayAll(ar);
        ar=insertArray(ar,4,555);
        System.out.println("after insert all elements are ");
        displayAll(ar);

        ar=deleteArrayByPosition(ar,2);
        System.out.println("after delele by position  all elements are ");
        displayAll(ar);

    }

}
