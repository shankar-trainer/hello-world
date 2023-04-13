import java.util.Arrays;

/**
 * Created by shankar on 4/9/2023.
 */
public class Sorting1 {
    public static void main(String[] args) {
    int ar1[]={11,2,1,3,4,55,7};
   int temp;
        for (int i = 0; i < ar1.length-1 ; i++) {
            for (int j = 0; j <ar1.length-i-1 ; j++) {
             if(ar1[j]>=ar1[j+1])
             {
                 temp=ar1[j];
                 ar1[j]=ar1[j+1];
                 ar1[j+1]=temp;
             }
            }
        }
            System.out.println(Arrays.toString(ar1));
    }


}
