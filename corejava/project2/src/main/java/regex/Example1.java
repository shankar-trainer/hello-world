package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {
//        String s="hello world";
//        String  pattern="[a-z]+";
//
//        Pattern pattern1=Pattern.compile(pattern);
//        Matcher matcher= pattern1.matcher(s);
//
//        System.out.println(matcher.find());

        String age="2";
        System.out.println(age.matches("[0-9]+"));

        String name="ramkumar";
        System.out.println(name.matches("[a-z]+"));

        String empId="CtsEmp6878781";
        System.out.println(empId.matches("[a-zA-Z0-9]+"));

        // string match anything other than hello

        System.out.println("h".matches("[^abc]"));
        System.out.println("a".matches("[^abc]"));

        System.out.println(" using .");
        System.out.println("aag".matches("(a.g)+"));

        System.out.println("abc".matches("[a-z]+"));
        System.out.println("abcdef".matches("[a-z]+"));

        System.out.println("abc".matches("[a-z]{3}"));
        System.out.println("abcd".matches("[a-z]{3}")
        );
        System.out.println("abcd".matches("[a-z]{3,8}"));
    }
}
