package com.cts.respository;

import com.cts.model.Consumer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository  extends R2dbcRepository<Consumer,Integer> {

}
