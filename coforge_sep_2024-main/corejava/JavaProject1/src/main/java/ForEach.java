public class ForEach {
    public static void main(String[] args) {

        int arr[]={11,2,3,1,0,9};

        System.out.println("for loop ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nusing for each loop ");

        for(int p:arr)
        {
            System.out.print(p+"\t");
        }
    }

}
