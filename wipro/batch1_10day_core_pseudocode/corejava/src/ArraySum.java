public class ArraySum {
    static int sum(int a[]){
     int s=0;
        for (int i = 0; i <a.length ; i++) {
            s=s+a[i];
        }
        return  s;
    }
    static int sum1(int a[]){
     int s=0;
        for (int i :a) {
            s=s+i;
        }
        return  s;
    }

    public static void main(String[] args) {

        int arr[]={11,22,33,44,55,66};
        System.out.println("sum is "+sum(arr));
        System.out.println("sum is "+sum1(arr));
    }
}
