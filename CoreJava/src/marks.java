
public class marks {

	int regnum;
	int MarksInEng;
	int  MarksInMaths , MarksInScience;
	
	@Override
	public String toString() {
		return "Marks Information"+
	          "\t\nreg No "+regnum+
	          "\t\n MarksInEng  "+MarksInEng+
	          "\t\n MarksInScience No "+MarksInScience+
	          "\t\n MarksInMaths "+MarksInMaths;
	}
	
	public int getRegnum() {
		return regnum;
	}
	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}
	public int getMarksInEng() {
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}

}
