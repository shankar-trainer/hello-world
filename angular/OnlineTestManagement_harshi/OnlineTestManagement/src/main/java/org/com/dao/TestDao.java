package org.com.dao;

import org.com.model.Test1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test1,Integer> 
{
	//@Query( "select u.user_id||t.test_id from User u,Test1 t where u.user_id=:uid and t.test_id=:tid")
	//String getAssignTest(@Param("uid") int uid, @Param("tid") int tid);

}
