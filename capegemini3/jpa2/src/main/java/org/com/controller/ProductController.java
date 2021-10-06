package org.com.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.com.dao.ItemDao;
import org.com.dao.ProductDao;
import org.com.model.Item;
import org.com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prd")
@CrossOrigin(value = "http://localhost:4200")
public class ProductController {

	@Autowired
	ItemDao dao;

	@Autowired
	ProductDao dao1;

	@GetMapping("/getProduct")
	public List<Item> getAllProduct() {
		return dao.findAll();
	}

	@PostMapping("/getProduct")
	public Item saveItem(@Valid @RequestBody Item item) {
		Set<Product> set = item.getProduct_set();
		item.setProduct_set(set);
		Item i = dao.save(item);

		for (Product p : i.getProduct_set()) {
			dao1.save(p);
		}
		return i;
	}

	@PostMapping("/getProduct/{itemid}")
	public Product saveProduct(@Valid @RequestBody Product product, @PathVariable("itemid") int itemid) {
		Item item = dao.findById(itemid).get();
		Set<Product> prdset = item.getProduct_set();
		int prdid[] = new int[prdset.size()];
		int x = 0;
		for (Product p : prdset) {
			prdid[x] = p.getPrd_id();
			x++;
		}

		Product prd1 = dao1.findById(prdid[0]).get();
		prd1.setPrd_name(product.getPrd_name());

		return dao1.save(prd1);

	}

	@GetMapping("/getProduct/{id}")
	public Item getProduct(@PathVariable("id") int id) {
		if (dao.findById(id).isPresent())
			return dao.findById(id).get();
		else
			return null;
	}

	/*
	 * @DeleteMapping("/getProduct/{id}") public ResponseEntity<Product>
	 * deleteProduct(@PathVariable("id") int id) {
	 * 
	 * Optional<Product> findById = dao.findById(id); try {
	 * 
	 * if (findById.isPresent()) { Product p=dao.findById(id).get();
	 * dao.deleteById(id); return new ResponseEntity<Product>(p, HttpStatus.OK);
	 * } else { throw new RecordNotFoundException("Record not present"); } }
	 * catch (RecordNotFoundException e) { return new
	 * ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); } }
	 */
}
