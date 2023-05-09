package main;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tvscredit.model.Book;

//mvn exec:java -Dexec.mainClass="main.RestTemplatePrg1"
//		ResponseEntity<Employee[]> responseEntity = restTemplate.getForEntity(uri, Employee[].class);


public class RestTemplatePrg1 {

	public static void main(String[] args) {

		RestTemplate restTemplate=new RestTemplate();
		  ResponseEntity<Book> forEntity = restTemplate.getForEntity("http://localhost:8080/book/search/788778",Book.class);
		if(forEntity!=null) {
			System.out.println("found ");
			Book bk=forEntity.getBody();
			System.out.println(bk.getIsbn()+"\t"+bk.getBname()+"\t"+bk.getAuthor()+"\t"+bk.getCost());
		}
		else
			System.out.println("not found");
	
		
		
		
		

//  		  ResponseEntity<Book[]> forEntity1 = restTemplate.getForEntity("http://localhost:8080/book/search/788778",Book[].class);
 //			System.out.println("all books ");

//                                                                         for(Book bk1:forEntity1.getBody())
  //                       			System.out.println(bk1.getIsbn()+"\t"+bk1.getBname()+"\t"+bk1.getAuthor()+"\t"+bk1.getCost());







	}
}
