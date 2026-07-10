public class TextBlock {

    public static void main(String[] args) {
        String c_sample= """
                   #include<stdio.h>
                   int main()
                   {
                   int x=10;
                   int y=20;
                   int z=x+y;
                   printf("\nno1 is  %d",x);
                   printf("\nno2 is  %d",y);
                   printf("\nsum is  %d",z);
                   }
                """;
        System.out.println(c_sample);
    }
}
