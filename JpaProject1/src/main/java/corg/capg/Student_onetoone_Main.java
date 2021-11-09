package corg.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.capg.model.onetoone.Game;
import org.capg.model.onetoone.Student;

public class Student_onetoone_Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		Game game=new Game();
		
		student.setName("surendra paratap");
		student.setMarks(88);
		student.setSubject("math");
		
		game.setGameName("vollyball");
		
		student.setGame(game);
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();
      
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		manager.persist(game);
		transaction.commit();
		
    		
	}
}
