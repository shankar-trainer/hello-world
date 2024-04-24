public class StringPalindrome {
    static boolean checkPalindrome(String s1) {
        char s2[] = new char[s1.length()];
        int j = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2[i] = s1.charAt(j++);
        }
        String s3 = new String(s2); // new String(char[])
        System.out.println(s1);
        System.out.println(s3);
        return s1.equals(s3);
    }

    static String reverse(String s1) {
        char c1[] = s1.toCharArray();
        char c[] = new char[s1.length()];
        int j = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            c[i] =c1[j++];
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("Hello"));
        String s1 = "we are learning java ";
        char[] charArray = s1.toCharArray();
        for (char c : charArray)
            System.out.print(c + ", ");
        System.out.println("\n welcome reverse is "+reverse("welcome"));
    }

}
/*
int j=0;
for (int i = s1.length()-1; i >=0 ; i--) {
            s2[i]=s1.charAt(j++);
        }

        s1="hello"
        i=s1.length-1=5-1=4
        i=4
        s2[4]=hello.charAt(0)-h
        s2[3]=hello.charAt(1)-e
        s2[2]=hello.charAt(2)-l
        s2[1]=hello.charAt(3)-l
        s2[0]=hello.charAt(4)-o
        s2-olleh
       String s3=new String(s2) - olleh


 */