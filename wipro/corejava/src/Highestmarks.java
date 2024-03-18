public class Highestmarks {
    static int[] bubbleSort(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                int temp;
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int highest_marks[];
        int sem[][] = new int[10][10];
        int n;
        int sub_n;

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter no of semester");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter no of subjects in " + (i + 1) + " semester");
            sub_n = sc.nextInt();
            sem[i] = new int[sub_n];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marks obtained in semester " + (i + 1));
            for (int j = 0; j < sem[i].length; j++) {
                sem[i][j] = sc.nextInt();
                if(sem[i][j]>100 || sem[i][j]<0) {
                    System.out.println("You have entered invalid marks");
                 return;
                }
            }
        }
        highest_marks = new int[n];
        int temp[];
        for (int i = 0; i < n; i++) {
            temp = bubbleSort(sem[i]);
            highest_marks[i] = temp[temp.length - 1];
        }

        int x = 1;
        for (int max : highest_marks)
            System.out.println("Maximum mark in " + (x++) + "semester :" + max);
    }
}
