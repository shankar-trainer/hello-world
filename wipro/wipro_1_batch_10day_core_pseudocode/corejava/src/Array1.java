public class Array1 {
    public static void main(String[] args) {
        //first way
        int ar[]={11,22,33,44,5,6,7};

        System.out.println("length is "+ar.length);// length is property of array
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);
        System.out.println(ar[5]);
        System.out.println(ar[6]);  // length-1 -- max index
        //System.out.println(ar[7]);// error
        // array index starts from zero and ends length-1

        int ar2[]=new int[4];// it created array of 4 elements adnd initialize each element with zero
        System.out.println("arr2");
        System.out.println(ar2[0]);//0
        System.out.println(ar2[1]);//0
        System.out.println(ar2[2]);//0

        ar2[0]=111;
        ar2[1]=112;
        ar2[2]=113;
        ar2[3]=114;

        System.out.println("arr2 after initialization");
        System.out.println(ar2[0]);
        System.out.println(ar2[1]);
        System.out.println(ar2[2]);
          }
}
