package coforge.com.repository;

import coforge.com.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    //@Query("select u from Person u where u.personName = ?1")
    public List<Person> findBypersonName(String personName);
    //public List<Person> findByNameAndpersonId(int id,String name);

}
