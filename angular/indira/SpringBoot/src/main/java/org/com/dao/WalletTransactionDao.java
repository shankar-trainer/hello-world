package org.com.dao;

import java.util.List;

import org.com.model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletTransactionDao extends JpaRepository <WalletTransaction, Integer>{

	@Query( value = "select * from wallet_transaction where sender_id = :user_id or receiver_id = :user_id", nativeQuery=true)
	List<WalletTransaction> getTransaction(@Param("user_id") int user_id);
}
