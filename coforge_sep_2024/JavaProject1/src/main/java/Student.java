public class Student {

    static void display(int r,String nm, String sb1, String sb2, float m1, float m2,float tot,float avg){
        System.out.println("\nStudent data\n");
        System.out.println("\tRoll is "+r);
        System.out.println("\tName is "+nm);
        System.out.println("\tsubject1 is "+sb1);
        System.out.println("\tsubject2 is "+sb2);
        System.out.println("\tMarks1  is "+m1);
        System.out.println("\tMarks2  is "+m2);
        System.out.println("\tTotal Marks2  is "+tot);
        System.out.println("\tAverage Marks2  is "+avg);

        String grade;
        if(avg>=75 && avg<=100)
            grade="distinction";
        else if(avg>=60)
            grade="first";
        else if(avg>=50)
            grade="second";
        else if(avg>=35)
            grade="third";
        else
            grade="fail";
        if(m1<35 || m2<35)
            grade="fail";

        if( (m1<0 || m1>100) || (m2<0 || m2>100))
            grade="invalid";
        System.out.println("grade is "+grade);
    }

    public static void main(String[] args) {
        int roll;
        String name;
        String subject1, subject2;
        float marks1;
        float marks2;
        float total_marks;
        float average_marks;

        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println("Enter roll");
        roll= sc.nextInt();
        System.out.println("Enter name");
        //name= sc.next();
        sc.nextLine();
        name= sc.nextLine();
        System.out.println("Enter subject1 name");
        subject1= sc.next();
        System.out.println("Enter subject2 name");
        subject2= sc.next();
        System.out.println("Enter marks for subject1 and subject2 ");
        marks1=sc.nextFloat();
        marks2=sc.nextFloat();
        if(marks1<0 || marks1>100)
            System.out.println("invalid marks1");
        if(marks2<0 || marks2>100)
            System.out.println("invalid marks2");


        total_marks=marks1+marks2;
        average_marks=total_marks/2;
        display(roll,name,subject1,subject2,marks1,marks2,total_marks,average_marks);
    }
}

/*
 in display method display the grade as below

 avg 0 - 34 -- fail
     35 - 50 -- third
     51 - 60 -- second
     61 - 74 -- first
     75 - 100 -- distinction

    marks in any  subject1, subject2 <35 -- fail
    marks in any  subject1, subject2 >100 and <0  -- invalid marks, grade unknown



 */