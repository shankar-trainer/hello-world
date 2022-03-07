
public class Story {

	private int storyId;//instance variable 
	private String storyName;
	private String storyType;
                 // parameters are local variable
	public Story(int storyId, String storyName, String storyType) {
		this.storyId = storyId;
		this.storyName = storyName;
		this.storyType = storyType;
	}
	
	public void storyInfo() {
	int x;// local variable inside method and method paramaters 
	
		System.out.println("story information ");
		System.out.println("id "+storyId);
		System.out.println("name "+storyName);
		System.out.println("type "+storyType);
	}
	
	
}
