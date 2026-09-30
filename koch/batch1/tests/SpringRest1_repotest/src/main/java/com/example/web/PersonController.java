//package com.example.web;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entity.Person;
//import com.example.repository.PersonRepository;
//
//@RestController
//@RequestMapping("/person")
//public class PersonController {
//
//	@Autowired
//	PersonRepository repository;
//
//	// @RequestMapping("/all")
//	@GetMapping("/all")
//	public List<Person> getAllPerson() {
//		return repository.findAll();
//	}
//
//	 //@RequestMapping(value="/add", method = RequestMethod.POST )
//
//	@PostMapping("/add")
//	public Person addPerson(@RequestBody Person person) {
//		return repository.save(person);
//	}
//	
//	@GetMapping("/search/{id}")
//	public Person serachById(@PathVariable("id") int id) {
//	   Optional<Person> byId = repository.findById(id);
//	   if(byId.isPresent())
//		   return byId.get();
//	   
//	   return null;
//	}
//
//	//localhost:8080/person/search1?id=77687
//	
//	@GetMapping("/search1")
//	public Person seachrById1(@RequestParam("id") int id) {
//
//		 Optional<Person> byId = repository.findById(id);
//		   if(byId.isPresent())
//			   return byId.get();
//		   
//		   return null;
//	}
//	
//	//localhost:8080/person/delete?id=77687
//	
//	@DeleteMapping("/delete")
//	public Person deleteById1(@RequestParam("id") int id) {
//		Person p=null;
//		
//		Optional<Person> byId = repository.findById(id);
//		if(byId.isPresent()) {
//			p= byId.get();
//		  repository.deleteById(id);
//		}
//		
//		return p;
//	}
//	
//	// delete by @pathvariable
//	
//	//localhost:8080/person/delete/878778
//	
//	@DeleteMapping("/delete/{id}")
//	public Person deleteById2(@PathVariable("id") int id) {
//		Person p=null;
//		
//		Optional<Person> byId = repository.findById(id);
//		if(byId.isPresent()) {
//			p= byId.get();
//			repository.deleteById(id);
//		}
//		
//		return p;
//	}
//	
//	@PutMapping("/update")
//	public Person update(@RequestBody Person p) {
//	   return repository.save(p);
//	}
//	
//	
//
//}
