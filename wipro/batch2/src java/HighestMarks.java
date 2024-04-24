public class HighestMarks {
    static int highest(int ar[]) {
        int max = 0;
        for (int x = 0; x < ar.length; x++) {
            if (ar[x] >= max)
                max = ar[x];
        }
        return max;
    }

    public static void main(String[] args) {
        int ar[][] = new int[100][100];

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter no of semester ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter no of subject in " + (i + 1) + " semester :");
            int p = sc.nextInt();
            ar[i] = new int[p];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marks obtained in semester" + (i + 1) + ":");
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();

                if (ar[i][j] < 0 || ar[i][j] > 100) {
                    System.out.println("You have entered invalid mark");
                    System.exit(1);
                }
            }
        }

        int res[] = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = highest(ar[i]);
            System.out.println("Maximum mark in " + (i + 1) + " semester :" + res[i]);
        }
    }
}





























