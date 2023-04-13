import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class SortingArray {
    static int [] sorting(int ar[]){
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
        return ar;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(new int[]{11,2,3,1,5,66}));
        System.out.println(Arrays.toString(sorting(new int[]{11,2,3,1,5,66})));
    }
}
