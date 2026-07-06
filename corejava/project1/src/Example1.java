public class Example1 {
    public static void main(String[] args) {
        //decimal float and double
        // by default all decimals are double

        double d1 = 6566565.656565;
        float f1 = 65655.56f;
        // by default all integer are int
        long l1 = 6565655656657l;

        int roll;
        String name;
        String subject1, subject2;
        float m1, m2, total, avg;
        char grade;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("enter roll");
        roll = sc.nextInt();

        System.out.println("enter name");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("enter two subjects");
        subject1 = sc.next();
        subject2 = sc.next();

        System.out.println("enter two subject marks");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();

        total = m1 + m2;
        avg = total / 2;
        if (avg >= 75)
            grade = 'A';
        else if (avg >= 60 && avg <= 74)
            grade = 'B';
        else if (avg >= 50 && avg <= 59)
            grade = 'C';
        else if (avg >= 35 && avg <= 49)
            grade = 'D';
        else
            grade = 'E';

        System.out.println("roll is " + roll);
        System.out.println("name is " + name);
        System.out.println("subject1 is " + subject1);
        System.out.println("subject2 is " + subject2);
        System.out.println("marks1 is " + m1);
        System.out.println("marks2 is " + m2);
        System.out.println("total marks is " + total);
        System.out.println("average marks is " + avg);
        System.out.println("grade is " + grade);
/*
        if(grade=='A')
            System.out.println("distinction");
        if(grade=='B')
            System.out.println("First");*/

        switch (grade) {
            case 'A':
                System.out.println("distinction");
                break;
            case 'B':
                System.out.println("first");
                break;
            case 'C':
                System.out.println("second");
                break;
            case 'D':
                System.out.println("division");
                break;
            case 'E':
                System.out.println("fail");
                break;
            default:
                System.out.println("wrong value");

        }
    }
}
