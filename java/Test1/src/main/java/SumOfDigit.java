/**
 * Created by shankar on 4/7/2023.
 */
public class SumOfDigit {

    public static void main(String[] args) {

        int p=1234;
        int sum=0;
        //int p=0;
        while(p!=0){
            sum=sum+p%10;
            p=p/10;
        }
        System.out.println(sum);
    }
}
