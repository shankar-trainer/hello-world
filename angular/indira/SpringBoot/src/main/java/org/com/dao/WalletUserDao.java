package org.com.dao;


import java.util.List;
import java.util.Optional;

import org.com.model.WalletUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletUserDao extends JpaRepository<WalletUser, Integer>{

	@Query( value = "select * from wallet_user where user_id in (select user_id from wallet_account where status='registered') ", nativeQuery=true)
	List<WalletUser> getRegisteredAccounts();
	
	@Query( value = "select * from wallet_user where aadhaar_no =:aadhaar_no ", nativeQuery=true)
	Optional<WalletUser> findByAadhaarNo(@Param("aadhaar_no") long aadhaar_no);
	
	@Query( value = "select user_id from wallet_user where login_name= :login_name ", nativeQuery=true)
	Optional<Integer> validLoginName(@Param("login_name") String login_name);
	
	@Query( value = "select user_id from wallet_user where login_name= :login_name and user_password= :password ", nativeQuery=true)
	Optional<Integer> validLogin(@Param("login_name") String login_name, @Param("password") String password);
	
	@Query("SELECT w FROM WalletUser w WHERE LOWER(w.UserName) LIKE %?1%")
	  public List<WalletUser> findByName(String name);
	
}
