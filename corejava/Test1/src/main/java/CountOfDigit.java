import java.util.Scanner;

/**
 * Created by shankar on 4/12/2023.
 */
public class CountOfDigit {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        //int x=1234;
        int count=0;
        for(;x!=0;){
            count++;
            x=x/10;
        }
        System.out.println(count);
    }
}
