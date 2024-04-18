public class Palindrome {
    static boolean checkPalindrome(int n) {
        int p , p1 = n;
        int x = 0;
        while (n != 0) {
            p = n % 10;
            x = x * 10 + p;
            n = n / 10;
        }
        if (x == p1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("12321 is palindrome " + checkPalindrome(    12321));
        System.out.println("123 is palindrome " + checkPalindrome(123));
    }
}
