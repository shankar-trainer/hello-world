public class Palindrome_Inverse_Digit {

    static int inverse(int k){
        int s=0;
        while(k!=0){
            s=s*10+k%10;
            k=k/10;
        }
        return  s;
    }

    public static void main(String[] args) {
        int k=1234;
        System.out.println(k+" inverse is "+inverse(k));
        k=12321;
        System.out.println(k+ "  is palindrome "+(inverse(k)==k));
    }
}
