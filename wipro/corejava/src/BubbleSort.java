public class BubbleSort {
    static int[] bubbleSort(int ar[]){
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = 0; j <ar.length-i-1 ; j++) {
                 int temp;
                 if(ar[j]>ar[j+1]){
                     temp=ar[j];
                     ar[j]=ar[j+1];
                     ar[j+1]=temp;
                 }
            }
        }
        return  ar;
    }
     static void display(int ...ar){
        for(int j:ar)
            System.out.print(j+",");
     }
    public static void main(String[] args) {
        int ar[]={11,2,1,3,4,7,6};
        System.out.println("unsorted array");
        display(ar);
        System.out.println("\nsorted array");
        ar=bubbleSort(ar);
        display(ar);
    }
}

