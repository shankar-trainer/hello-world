import java.util.Scanner;

public class StudentProgram {

    static void display(int r, String n, float m1, float m2, float t, float a){
        System.out.printf("\nroll is %d\nname is %s\nmarks1, marks2 are %.2f and %.2f\ntotal is %.2f\naverage is %.2f",r,n,m1,m2,t,a);
    }

    public static void main(String[] args) {
        int roll;
        String name;
        float marks1, marks2;
        float total, avg;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter id name and two marks");
        roll= scanner.nextInt();
//        name= scanner.next();// next single word
        scanner.nextLine();//
        name= scanner.nextLine();// nextLine() multi word
        marks1= scanner.nextFloat();
        marks2= scanner.nextFloat();
        total=marks1+marks2;
        avg=total/2;
        display(roll,name,marks1,marks2,total,avg);
    }

}
