package com.example.accessingdatacassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, UUID> {	
	Vet findByFirstName(String username);
}