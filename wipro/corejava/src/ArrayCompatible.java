public class ArrayCompatible {
    static boolean compatible(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int ar1[]={};
        int ar2[]={};
        int size;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the size for the First array");
        size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size");
            System.exit(1);
        }
        else {
            ar1 = new int[size];
            System.out.println("Enter the elements for the first array");
            for (int i = 0; i < size; i++) {
                ar1[i] = sc.nextInt();
            }
        }
        System.out.println("Enter the size for the Second array");
        size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size");
            System.exit(1);
        }
        else {
            ar2 = new int[size];
            System.out.println("Enter the elements for the Second array");
            for (int i = 0; i < size; i++) {
                ar2[i] = sc.nextInt();
            }
        }
        boolean status= compatible(ar1,ar2);
        //System.out.println("status "+status);
        if(status)
            System.out.println("Arrays are Compatible");
        else
            System.out.println("Arrays are not Compatible");
    }
}
