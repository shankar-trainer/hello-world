package collection;

public class UserMainCode {

	static  String countWord(String ar[], int x){
		
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].length()==x)
				count++;
		}
	
		return new Integer(count).toString();
		
	}
	
}
