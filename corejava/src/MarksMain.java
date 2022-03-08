import java.util.Scanner;

public class MarksMain {
  public static void marksInfo(float marks[]) {
	  for(float s:marks)
      	System.out.print(s+",");	  
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students ");
		int n = sc.nextInt();
		// int ar[]=new int[n];

		Marks marks[] = new Marks[n];

		for (int x = 0; x < marks.length; x++) {
			System.out.println("Enter english math science marks ");
			marks[x] = new Marks(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		}

		for (int x = 0; x < marks.length; x++) {
			marks[x].marksInfo();
		}
		// display english,math,science marks in sorted way
		// display highest , lowest marks of each subjects

		float english[] = new float[n];
		float math[] = new float[n];
		float science[] = new float[n];

		for (int x = 0; x < marks.length; x++) {
			english[x] = marks[x].getMarksInEnglish();
			math[x] = marks[x].getMarksInMath();
			science[x] = marks[x].getMarksInScience();
		}
		
		float[] sortEnglish = Marks.sorting(english);
		System.out.println("English marks in sorted way\n");
          marksInfo(sortEnglish);
            
		float sortMath[] = Marks.sorting(math);
		System.out.println("Math marks in sorted way\n");
		marksInfo(sortMath);
       
		float sortScience[] = Marks.sorting(science);

		System.out.println("Science marks in sorted way\n");
		marksInfo(sortScience);
		sc.close();
	}
}
