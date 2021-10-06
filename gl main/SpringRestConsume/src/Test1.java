import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

public class Test1 {

	public static void main(String[] args) {
		
		RestTemplate restTemplate=new RestTemplate();
		
		String url="http://localhost:9090/empInfoList/";
		
		System.out.println("Enter id to search ");

		Integer id=new Scanner(System.in).nextInt();
		
		url=url+id.toString();
				
		Employee emp1= restTemplate.getForObject(url, Employee.class);
		
		if(emp1!=null){
			System.out.println("found");
		  System.out.println(emp1.getId()+"  "+emp1.getName()+"  "+emp1.getSalary());
		}	
		
		else
			System.out.println("id not found");
		
	}
}
