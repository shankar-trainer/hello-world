
public class Marks {

	private float marksInEnglish;
	private float marksInMath;
	private float marksInScience;
	
	public float getMarksInEnglish() {
		return marksInEnglish;
	}

	public float getMarksInMath() {
		return marksInMath;
	}

	public float getMarksInScience() {
		return marksInScience;
	}
	public Marks(float marksInEnglish, float marksInMath, float marksInScience) {
		this.marksInEnglish = marksInEnglish;
		this.marksInMath = marksInMath;
		this.marksInScience = marksInScience;
	}
	
	public void marksInfo() {
		System.out.println("marks Information ");
		System.out.println("\tenglish  : "+marksInEnglish);
		System.out.println("\tmath  : "+marksInMath);
		System.out.println("\tscience  : "+marksInScience);
		System.out.println("\n\ttotal   : "+total());
		System.out.println("\n\taverage   : "+avg());
	}
	
	static float[] sorting(float ar[]) {
		float temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}

	public float avg() {
		 return (marksInScience+marksInMath+marksInEnglish)/3;
	}
	public float total() {
		return (marksInScience+marksInMath+marksInEnglish);
	}
	
}
