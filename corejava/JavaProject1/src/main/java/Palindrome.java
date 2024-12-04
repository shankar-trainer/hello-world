public class Palindrome {

    static boolean checkPalindrome(int a){
        int s=0;
        int z=a;
        while(a!=0){
            s=a%10+s*10;
            a=a/10;
        }
        return z==s;
    }

    public static void main(String[] args) {
        int x=new java.util.Scanner(System.in).nextInt();
        System.out.println(x+" is palindrome  "+checkPalindrome(x));
    }
}
