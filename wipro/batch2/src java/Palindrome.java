public class Palindrome {

    static boolean checkPalindrome(int d) {
        int s = 0;
        int d1=d;
        while (d != 0) {
            s = s*10 + d % 10;
            d = d / 10;
        }
       /* if(d1==s)
            return  true;
        else return  false;
      */
        return  d1==s;
    }

    public static void main(String[] args) {
        int p=12321;
        System.out.println(p+" is palindrome "+checkPalindrome(p));
        p=45621;
        System.out.println(p+" is palindrome "+checkPalindrome(p));

    }

}
