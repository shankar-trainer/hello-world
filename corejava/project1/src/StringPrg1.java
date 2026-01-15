public class StringPrg1 {

   static  boolean checkPalindrome(String s) {
        char[] charArray = s.toCharArray();
        char ar1[] = new char[charArray.length];
        int j = 0;
        for (int i = charArray.length - 1; i>= 0; i--) {
            ar1[j] = charArray[i];
            j++;
        }
        return s.equals(new String(ar1));
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcba"));
        String s = "hello";
        // String is immutable, all methods present inside String will not make any changes
        System.out.println(s);
        String s1 = s.concat(" world ");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        char[] charArray = s1.toCharArray();
        for (char c : charArray)
            System.out.print(c + ", ");

        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
    }
}
