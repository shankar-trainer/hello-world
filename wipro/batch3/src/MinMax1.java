public class MinMax1 {
    static int[] minmax(int arr[],java.util.Scanner scanner){
       int min=0,max=0;
       int k;

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("enter no");
            arr[i]= scanner.nextInt();

           if(i==0)
               max=min=arr[i];
           else if(arr[i]>=max)
               max=arr[i];
           else if (arr[i]<=min)
               min=arr[i];
        }
        int a[]=new int[2];
        a[0]=max;
        a[1]=min;
        return  a;
    }
    static void display(int arr[]){
        System.out.println("all array elements are ");
        for(int i:arr)
            System.out.print(i+", ");
    }
    public static void main(String[] args) {

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter no of elements ");
        int n=sc.nextInt();
        int ar[]=new int[n];

       int res[]= minmax(ar,sc);
        display(ar);
        System.out.println("\nmax is "+res[0]);
        System.out.println("min is "+res[1]);
    }
}
