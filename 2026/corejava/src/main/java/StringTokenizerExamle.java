import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExamle {

    public static void main(String[] args) {
        String p = "we are learning java";

        p = "we-are-learning-java";

        String ar1[] = p.split(" ");

        System.out.println(Arrays.toString(ar1));

        p = "we-are@learning-java. we#will$learn-spring@too";

        ar1 = p.split("-|@|#|\\$");
        System.out.println("result is " + Arrays.toString(ar1));

        p = "we-are-learning-java";

        StringTokenizer stringTokenizer = new StringTokenizer(p, "-");
        while (stringTokenizer.hasMoreTokens())
            System.out.println(stringTokenizer.nextToken());

// String join -- join each element from array into one string

        String ss1 = String.join("------", ar1);
        System.out.println(ss1);
    }

}
