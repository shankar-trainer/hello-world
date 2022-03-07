
public class StoryMain {

	public static void main(String[] args) {
		
		Story story1=new Story(1001,"princess story","fantasy");
		Story story2=new Story(1002,"ghost story","horror");
		 // story1 , story2 two reference variable and two objects		
		System.out.println("\nstory 1");
		story1.storyInfo();
		
		System.out.println("\nstory 2");
		story2.storyInfo();
		
		Story story3=story2;
		// story1 , story2, story3  three reference variable and two objects		
		// strory2 and story3 both refers same object 
		
		System.out.println("\nstory 3");
		story3.storyInfo();
		
		
			}
}
