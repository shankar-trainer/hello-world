import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int ar[]={11,2,1,33,6};
		
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		System.out.println(Arrays.binarySearch(ar, 6));
		
		String city[]={"madurai","chennai","rameswaram","mahabalipuram","delhi"};
		
		System.out.println("cities are "+Arrays.toString(city));
		
		Arrays.sort(city);		
		System.out.println("sorted cities are "+Arrays.toString(city));
		
		System.out.println(Arrays.equals(new int[]{1,2,3}, new int[]{1,2,3}));
		
		
		Integer ar1[]={11,2,3,44};
		
	
		 List<Integer> list1=	Arrays.asList(ar1);
		
		
		
			
	}

}
