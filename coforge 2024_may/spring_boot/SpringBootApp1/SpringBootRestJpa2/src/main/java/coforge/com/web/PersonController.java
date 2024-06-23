package coforge.com.web;

import coforge.com.exception.PersonException;
import coforge.com.model.Person;
import coforge.com.repository.PersonRepository;
import coforge.com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @PostMapping("/allPerson")
    public ResponseEntity<Person> addPerson(@RequestBody Person p){
     try{
         Person person = service.addPerson(p);
         ResponseEntity<Person> responseEntity=new ResponseEntity<>(person, HttpStatus.CREATED);
         return  responseEntity;
     }
     catch (PersonException e){
         return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
     }
    }
    @GetMapping("/allPerson")
    public ResponseEntity<List<Person>>getAllPerson(){
     try{
        return   new ResponseEntity<List<Person>>(service.getAllPerson(),HttpStatus.OK);
     }
     catch (PersonException e){
         return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
     }
    }

    @DeleteMapping("/allPerson/{id}")
    public ResponseEntity<Person> deleteById(@PathVariable("id") long id ){
        try{
           return  new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
        }
        catch (PersonException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/allPerson/{id}")
    public ResponseEntity<Person> searchById(@PathVariable("id") long id ){
        try{
           return  new ResponseEntity<>(service.searchById(id), HttpStatus.FOUND);
        }
        catch (PersonException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/allPerson/name/{name}")
    public ResponseEntity<List<Person>> searchByName(@PathVariable("name") String name ){
        try{
           return  new ResponseEntity<List<Person>>(service.searchByName(name), HttpStatus.FOUND);
        }
        catch (PersonException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/allPerson")
    public ResponseEntity<Person> updatePerson(@RequestBody Person p){
        try{
         return  new ResponseEntity<>(service.updatePerson(p), HttpStatus.CREATED);
        }
        catch (PersonException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}






















/*

 @GetMapping("/allPerson/{name}/{id}")
    public Person findBypersonNameAndpersonId( @PathVariable("name") String name,@PathVariable("id")  long id){
      return   repository.findBypersonNameAndpersonId(name,id);
    }

      //public List<Person> searchByName(@RequestParam(value="name") String name ){
    @GetMapping("/allPerson/{salary}")
    public List<Person> searchByName(@PathVariable("salary")  float salary ){
      return   repository.findBypersonSalaryOrderBypersonNameDesc(salary);
    }


 */