package java17;

public class Switch_PatternMatch {


    public static void main(String[] args) {
        int operation=1;
        int x=10;
        int y=12;

        switch (operation){
            case  1,2,3-> System.out.println("addition, subtraction, multiplication "+(x+y)+", "+(x-y)+","+(x*y));
            case 4,5-> {
                return ;
            }

        }
    }
}
