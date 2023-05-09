package com.nec.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nec.model.Product;
import com.nec.model.ProductFeedback;

@Repository
public interface FeedbackRepository  extends JpaRepository<ProductFeedback, Integer> {

}
