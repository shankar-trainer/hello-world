package org.com.dao;

import org.com.model.WalletAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletAdminDao extends JpaRepository<WalletAdmin, Integer> {

}
