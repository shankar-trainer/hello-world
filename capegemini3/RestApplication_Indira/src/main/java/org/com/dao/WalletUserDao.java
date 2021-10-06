package org.com.dao;


import org.com.model.WalletUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletUserDao extends JpaRepository<WalletUser, Integer>{

}
