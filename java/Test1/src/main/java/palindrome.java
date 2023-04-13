/**
 * Created by shankar on 4/7/2023.
 */
public class palindrome {

    public static void main(String[] args) {

        int p=12344321;
        int p1=0;
        int x=p;
        while(p!=0){
            p1=p1*10+p%10;
            p=p/10;
        }
        System.out.println(p1);
        System.out.println(p1==x);
    }
}
