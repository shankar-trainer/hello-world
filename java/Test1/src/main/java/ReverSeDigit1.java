/**
 * Created by shankar on 4/9/2023.
 */
public class ReverSeDigit1 {
    public static void main(String[] args) {
        int x=1234;

        int r=0;

        while(x!=0){
            r=r*10+x%10;
           x=x/10;
        }

        System.out.println(r);
    }
}
