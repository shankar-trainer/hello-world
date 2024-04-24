public class ArrayCompatible {

    static boolean arrayCompatibility(int ar1[], int ar2[]){

          boolean flag=true;
        for (int i = 0; i <ar1.length ; i++) {
            if(ar1[i]>=ar2[i]){
                flag=true;
            }
            else {
                flag = false;
                break;
            }
        }
        return  flag;
    }

    public static void main(String[] args) {
        int myarr1[]; // array declaration
        int myarr2[];
        int size1,size2;
        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println("Enter the size for the first array:");
        size1=sc.nextInt();
        if(size1<=0) {
            System.out.println("Invalid array size");
          System.exit(1);
        }

        myarr1=new int[size1]; // creating array
        System.out.println("Enter the elements for the First Array:");
        for (int i = 0; i <myarr1.length ; i++) {
            myarr1[i]=sc.nextInt();
        }

        System.out.println("Enter the size for the second array:");
        size2=sc.nextInt();
        if(size2<=0) {
            System.out.println("Invalid array size");
            System.exit(1);
        }
        myarr2=new int[size2];
        System.out.println("Enter the elements for the Second Array:");
        for (int i = 0; i <myarr2.length ; i++) {
            myarr2[i]=sc.nextInt();
        }

        if(arrayCompatibility(myarr1,myarr2))
            System.out.println("Arrays are Compatible");
        else
            System.out.println("Arrays are not  Compatible");
    }
}
