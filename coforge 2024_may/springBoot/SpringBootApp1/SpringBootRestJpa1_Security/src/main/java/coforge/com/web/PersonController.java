package coforge.com.web;

import coforge.com.model.Person;
import coforge.com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;

    @PostMapping("/allPerson")
    public Person addPerson(@RequestBody Person p){
      return   repository.save(p);
    }

    @GetMapping("/allPerson")
    public List<Person> getAllPerson(){
      return   repository.findAll();
    }

    @GetMapping("/allPerson/{id}")
    public Person searchById(@PathVariable("id")  long id ){
      return   repository.findById(id).get();
    }

    @GetMapping("/allPerson/name/{name}")
    public List<Person> searchByName(@PathVariable("name")  String name ){
      return   repository.findBypersonName(name);
    }

    @DeleteMapping("/allPerson/{id}")
    public Person deleteById(@PathVariable("id")  long id ){
         Person p1=repository.findById(id).get();
          if(repository.findById(id).isPresent()){
              repository.deleteById(id);
              return  p1;
          }
          return  null;
    }

@PutMapping("/allPerson")
    public Person updatePerson(@RequestBody Person p ){

          if(repository.findById(p.getPersonId()).isPresent()){
              return repository.save(p);
          }
          return  null;
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