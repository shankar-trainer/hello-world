package com.wipro.String;

public class StringPalindrome {
    static boolean checkPalindrome(String s) {
        char[] charArray = s.toCharArray();
        char ar[] = new char[charArray.length];
        int x = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            ar[x++] = charArray[i];
        }
        String s1 = new String(ar);
        return s1.equals(s);
    }

    public static void main(String[] args) {
        System.out.println("welew is palindrome  "+checkPalindrome("welew"));
        System.out.println("malayalam is palindrome  "+checkPalindrome("malayalam"));
        System.out.println("delhi is palindrome  "+checkPalindrome("delhi"));
    }
}
