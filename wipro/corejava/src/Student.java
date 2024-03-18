public class Student {
        static void printStudent(int r, String name, String sub[], float marks[], float max, float min, char grade) {
        System.out.println("********* Student Information *********");
        System.out.println("\tRoll is "+r);
        System.out.println("\tName is "+name);
        System.out.println("\tSubject\tMarks are ");
        for (int i = 0; i < sub.length; i++)
            System.out.println("\t"+sub[i]+"\t"+marks[i]);

        System.out.println("\tMin marks "+min);
        System.out.println("\tMax marks "+max);
        System.out.println("\tGrade  "+grade);
    }
    static char gradeCalc(float percentage){
        if(percentage>=75 && percentage<=100)
            return  'A';
        else if(percentage>=60 )
            return  'B';
        else if(percentage>=50 )
            return  'C';
        else if(percentage>=35 )
            return  'D';
        else
            return  'E';

    }

    static float[] getMaxMinMarks(float m[]) {
        float max, min;
        max=min=0;

        for (int i = 0; i <m.length; i++) {
            if (i == 0)
                max = min = m[i];
            else if (m[i] >= max)
            max = m[i];
            else if (m[i] <= min)
            min = m[i];
        }
        float mm[] = new float[2];
        mm[0] = max;
        mm[1] = min;
        return mm;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name, subject[]=new String[5];

        int roll;
        float marks[] = new float[5];
        float total=0, avg;
        char grade;
        float mx, mi;

        System.out.println("Enter roll name ");
        roll = sc.nextInt();
        sc.nextLine(); // read enter
        name = sc.nextLine();

        System.out.println("Enter 5 subject names");
        for (int i = 0; i <subject.length; i++)
            subject[i] = sc.next();

        System.out.println("Enter 5 subject marks");
        for (int i = 0; i <marks.length; i++) {
            marks[i] = sc.nextFloat();
            total = total + marks[i];
        }
        avg = total / marks.length;
        grade=gradeCalc(avg);

        float m[]=getMaxMinMarks(marks);
        mx=getMaxMinMarks(marks)[0];
        mi=getMaxMinMarks(marks)[1];

         printStudent(roll,name,subject,marks,mx,mi,grade);
    }
}
