public class ArrayCompatibility {

    static boolean checkArrayCompatibility(int arr1[], int arr2[]) {
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i]<arr2[i])
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        int ar1[], ar2[];
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        if (size1 <= 0) {
            System.out.println("invalid array size");
            return;
        }

        System.out.println("Enter the size of first array");
        int size2 = sc.nextInt();
        if (size2 <= 0) {
            System.out.println("invalid array size");
            return;
        }
       ar1=new int[size1];
       ar2=new int[size2];
        System.out.println("Enter the elements of First Array");
        for (int i = 0; i < ar1.length; i++)
         ar1[i]=sc.nextInt();
        System.out.println("Enter the elements of Second Array");
        for (int i = 0; i < ar2.length; i++)
         ar2[i]=sc.nextInt();
        boolean b = checkArrayCompatibility(ar1, ar2);
         if(b)
             System.out.println("Arrays are compatible");
         else
             System.out.println("Arrays are Not compatible");
    }
}
