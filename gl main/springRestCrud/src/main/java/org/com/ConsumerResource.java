package org.com;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ConsumerResource {

	@Autowired
	ConsumerRepository consumerRepository;

	@GetMapping("/consumers")
	public List<Consumer> getAllConsumer() {
		return consumerRepository.findAll();
	}

	@PostMapping("/addConsumer")
	public ResponseEntity<Object> addConsumer(@RequestBody Consumer consumer) {
		Consumer consumer2 = consumerRepository.save(consumer);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cid}").buildAndExpand(consumer2.getCid())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/delConsumer/{id}")
	public void delCosumer(@PathVariable int id){
		
		consumerRepository.deleteById(id);
		
	}

}
