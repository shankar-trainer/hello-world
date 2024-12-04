public class Array1 {
    public static void main(String[] args) {
        // 1st way
        int ar[] = new int[5];
        // will create array of 5 elements, initialize each element by 0

        // length property -- length of array
        // index starts from 0 to array length -1
        System.out.println(ar.length);

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);
        //System.out.println(ar[5]);
        //2nd way
        int ar2[] = {1, 2, 3, 4, 5, 6};
        int index = 0;
        do {
            System.out.print(ar2[index++] + "\t");

        } while (index < ar2.length);

    }

}
